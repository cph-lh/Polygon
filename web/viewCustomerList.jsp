<%@page import="domain.Facade"%>
<%@page import="domain.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Facade f = new Facade(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Admin - Customer List</title>
    </head>
    <body style="text-align: left">
        <h1>Customer list</h1>
        <table>
            <thead>
                <tr>
                    <th>ID&#160</th>
                    <th>Name&#160</th>
                    <th>Address&#160</th>
                    <th>Zip&#160</th>
                    <th>City&#160</th>
                    <th>Phone&#160</th>
                </tr>
            </thead>           
            <tbody>
                <%  for (Customer c : f.viewCustomers())
                    {
                %>
                <tr>
                    <td><%= c.getID()%></td>
                    <td><%= c.getName()%></td>
                    <td><%= c.getAddress()%></td>
                    <td><%= c.getZip()%></td>
                    <td><%= c.getCity()%></td>
                    <td><%= c.getPhone()%></td>              
                    <td>
                        <form action="ControllerServlet" method="post">
                            <input type="submit" value="Delete" name="delete">
                            <input type="hidden" value="deleteC" name="do_this">
                            <input type="hidden" value="<%=c.getID()%>" name="deleteC">
                        </form>
                    </td>              
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <form action="adminPage.jsp" method="post"><br>
            <input type="button" value="Back" onClick="window.location = 'adminPage.jsp'; return true;">
        </form>
    </body>
</html>
