package presentation;

import domain.Controller;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet
{

    Controller con = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        String bID = "";
        bID += request.getParameter("bID");
        System.out.println(bID);
        System.out.println("FØR try");
        try
        {
            InputStream stream = con.getFloorPlan(Integer.parseInt(bID));

            BufferedInputStream input = null;
            BufferedOutputStream output = null;
            System.out.println("bcus Tim");
            try
            {
                System.out.println("111111");
                input = new BufferedInputStream(stream, 16177215);

                response.setContentType("image/jpeg");

                output = new BufferedOutputStream(response.getOutputStream(), 16177215);
                System.out.println("222222");

                byte[] buffer = new byte[16177215];
                int length;
                while ((length = input.read(buffer)) > 0)
                {
                    output.write(buffer, 0, length);
                }
            } finally
            {
                output.close();
                input.close();
            }

            forward(request, response, "/floorPlan.jsp");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
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
