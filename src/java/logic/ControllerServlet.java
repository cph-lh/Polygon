package logic;

import domain.Customer;
import domain.Facade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet
{

    Facade f = new Facade();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String id, name, address, zip, parcel, size, phone, password;

        try (PrintWriter out = response.getWriter())
        {
            switch (request.getParameter("do_this"))
            {
                case "adminButtons":
                    switch(request.getParameter("aButton"))
                    {
                        case "Customers":
                            forward(request, response, "/adminCustomerHandler.jsp");
                            break;
                    }
                case "addCustomer":
                    id = request.getParameter("cID");
                    name = request.getParameter("cName");
                    phone = request.getParameter("cPhone");
                    address = request.getParameter("cAddress");
                    zip = request.getParameter("cZip");
                    password = request.getParameter("cPassword");
                    f.addCustomer(Integer.parseInt(id), name, address, Integer.parseInt(zip), Integer.parseInt(phone), password);
                    forward(request, response, "/adminCustomerHandler.jsp");
                    break;
                case "deleteCustomer":
                    id = request.getParameter("deletecID");
                    f.deleteCustomer(Integer.parseInt(id));
                    forward(request, response, "/adminCustomerHandler.jsp");
                    break;
                case "customerButtons":
                    switch (request.getParameter("cButton"))
                    {
                        case "View buildings":
                            forward(request, response, "/viewBuilding.jsp");
                            break;
                        case "Add new building":
                            forward(request, response, "/addBuilding.jsp");
                            break;
                    }
                    break;
                case "addBuilding":
                    id = request.getParameter("cID");
                    name = request.getParameter("bName");
                    address = request.getParameter("bAddress");
                    zip = request.getParameter("bZip");
                    parcel = request.getParameter("bParcel");
                    size = request.getParameter("bSize");
                    f.addBuilding(Integer.parseInt(id), name, address, Integer.parseInt(zip), Integer.parseInt(parcel), Integer.parseInt(size));
                    forward(request, response, "/customerPage.jsp");
                    break;
                case "login":
                    id = request.getParameter("cID");
                    if (id != "")
                    {
                        Customer c = f.getCustomer(Integer.parseInt(id));

                        if (c != null && c.getPassword().equals(request.getParameter("pwd")))
                        {
                            request.getSession().setAttribute("title", c.getName());
                            request.getSession().setAttribute("cID", c.getID());
                            forward(request, response, "/customerPage.jsp");
                        } else
                        {
                            forward(request, response, "/customerLogin.jsp");
                        }
                    } else
                    {
                        forward(request, response, "/customerLogin.jsp");
                    }
                    break;
                default: throw new UnsupportedOperationException("Case doesn't exists");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

    private void forward(HttpServletRequest req, HttpServletResponse res, String path) throws IOException, ServletException
    {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(path);
        rd.forward(req, res);
    }
}
