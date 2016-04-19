package presentation;

import domain.Customer;
import domain.Controller;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class ControllerServlet extends HttpServlet
{

    Controller con = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String id, name, address, zip, parcel, size, year, floors, phone, password, city;
        int cID, bID;
        HttpSession session = request.getSession(true);
        try (PrintWriter out = response.getWriter())
        {
            switch (request.getParameter("do_this"))
            {
                case "uploadFP":
                    Part filepart = request.getPart("file");
                    InputStream input = filepart.getInputStream();
                    id = request.getParameter("bID");
                    con.addFloorPlan(Integer.parseInt(id), input);
                    forward(request, response, "/viewBuilding.jsp");
                    break;
                case "viewFP":
                    id = request.getParameter("bID");
                    byte[] imgData = con.getFloorPlan(Integer.parseInt(id));
                    response.setContentType("image/gif");
                    OutputStream output = response.getOutputStream();
                    output.write(imgData);
                    output.flush();
                    output.close();
                    forward(request, response, "/viewBuilding.jsp");
                    break;
                case "adminButtons":
                    System.out.println("1");
                    System.out.println(request.getParameter("aButton").substring(0, 4));
                 
                    switch (request.getParameter("aButton").substring(0,4))
                    {
                        case "Tilf"/*Tilføj Kunde*/:
                            System.out.println("2");
                            forward(request, response, "/adminCustomerHandler.jsp");
                            break;
                        case "Kund"/*Kundeliste*/:
                            forward(request, response, "/viewCustomerList.jsp");
                            break;
                        case "Udfy" /*Udfyld rapport*/:
                            forward(request, response, "/report.jsp");
                            break;
                    }
                    break;
                case "viewCBuilding":
                    cID = Integer.parseInt(request.getParameter("getID"));
                    session.setAttribute("cID", cID);
                    forward(request, response, "/adminCustomerBuilding.jsp");
                    break;
                case "reportButtons":
                    switch (request.getParameter("rButton"))
                    {
                        case "Udfyld rapport":
                            bID = Integer.parseInt(request.getParameter("bID"));
                            session.setAttribute("bID", bID);
                            name = request.getParameter("name");
                            session.setAttribute("name", name);
                            address = request.getParameter("address");
                            session.setAttribute("address", address);
                            zip = request.getParameter("zip");
                            session.setAttribute("zip", zip);
                            city = request.getParameter("city");
                            session.setAttribute("bID", city);
                            parcel = request.getParameter("parcel");
                            session.setAttribute("parcel", parcel);
                            size = request.getParameter("size");
                            session.setAttribute("size", size);
                            year = request.getParameter("year");
                            session.setAttribute("year", year);
                            forward(request, response, "/report.jsp");    
                            break;
                        case "Se rapport":
                        forward(request, response, "/blankReport.jsp"); //ny JSP her
                            break;
                    }
                case "addCustomer":
                    id = request.getParameter("cID");
                    name = request.getParameter("cName");
                    phone = request.getParameter("cPhone");
                    address = request.getParameter("cAddress");
                    zip = request.getParameter("cZip");
                    password = request.getParameter("cPassword");
                    con.addCustomer(Integer.parseInt(id), name, address, Integer.parseInt(zip), Integer.parseInt(phone), password);
                    forward(request, response, "/viewCustomerList.jsp");
                    break;
                case "deleteC":
                    id = request.getParameter("deleteC");
                    con.deleteCustomer(Integer.parseInt(id));
                    forward(request, response, "/viewCustomerList.jsp");
                    break;
                case "deleteCustomer":
                    id = request.getParameter("deletecID");
                    con.deleteCustomer(Integer.parseInt(id));
                    forward(request, response, "/adminCustomerHandler.jsp");
                    break;
                case "customerButtons":
                    switch (request.getParameter("cButton").substring(0, 4))
                    {
                        case "Se b"/*Se bygninger*/:
                            forward(request, response, "/viewBuilding.jsp");
                            break;
                        case "Tilf"/*Tilføj bygning*/:
                            forward(request, response, "/addBuilding.jsp");
                            break;
                        case "Log "/*Log ud*/:
                            session = request.getSession(false);
                            if (session != null)
                            {
                                //loggedIn = false;
                                session.invalidate();
                                forward(request, response, "/customerLogin.jsp");
                            }
                            break;
                    }
                    break;
                case "addBuilding":
                    name = request.getParameter("bName");
                    address = request.getParameter("bAddress");
                    zip = request.getParameter("bZip");
                    parcel = request.getParameter("bParcel");
                    size = request.getParameter("bSize");
                    year = request.getParameter("year");
                    floors = request.getParameter("bFloors");
                    con.addBuilding((int) session.getAttribute("cID"), name, address, Integer.parseInt(zip), Integer.parseInt(parcel), Integer.parseInt(size), Integer.parseInt(year), Integer.parseInt(floors));
                    forward(request, response, "/viewBuilding.jsp");
                    break;
                case "login":
                    id = request.getParameter("cID");
                    if (id != "" || id != null)
                    {
                        Customer c = con.getCustomer(Integer.parseInt(id));

                        if (c != null && c.getPassword().equals(request.getParameter("pwd")))
                        {
                            //loggedIn = true;
                            session.setAttribute("title", c.getName());
                            session.setAttribute("cID", c.getID());
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
                default:
                    throw new UnsupportedOperationException("Case doesn't exists");
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
