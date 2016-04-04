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

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try (PrintWriter out = response.getWriter())
        {
            switch (request.getParameter("do_this"))
            {
                case "addBuilding":
                    String id = request.getParameter("cID");
                    String name = request.getParameter("bName");
                    String address = request.getParameter("bAddress");
                    String zip = request.getParameter("bZip");
                    String parcel = request.getParameter("bParcel");
                    String size = request.getParameter("bSize");
                    f.addBuilding(Integer.parseInt(id), name, address, Integer.parseInt(zip), Integer.parseInt(parcel), Integer.parseInt(size));
                    forward(request, response, "/viewBuilding.jsp");
                case "viewBuilding":
                    //id = request.getParameter("cID");
                case "addCustomer":
                    id = request.getParameter("cID");
                    name = request.getParameter("cName");
                    String phone = request.getParameter("cPhone");
                    address = request.getParameter("cAddress");
                    zip = request.getParameter("cZip");
                    String password = request.getParameter("cPassword");
                    f.addCustomer(Integer.parseInt(id), name, address, Integer.parseInt(zip), Integer.parseInt(phone), password);
                case "login":
                    System.out.println("*******2*******");
                    String cID = request.getParameter("cID");
                    Customer c = f.getCustomer(Integer.parseInt(cID));
                    if (c != null && c.getPassword().equals(request.getParameter("pwd")))
                    {
                        request.getSession().setAttribute("title", c.getName());
                        forward(request, response, "/customerPage.jsp");
                    } else
                    {
                        forward(request, response, "/customerLogin.jsp");
                    }
                    break;
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
