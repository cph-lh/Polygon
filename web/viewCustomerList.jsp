<%@page import="domain.Controller"%>
<%@page import="domain.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Controller con = new Controller(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Admin - Customer List</title>
    </head>
    <body>
        <h1>Customer list</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Zip</th>
                    <th>City</th>
                    <th>Phone</th>
                    <th>Delete</th>
                </tr>
            </thead>           
            <tbody>
                <%  for (Customer c : con.viewCustomers())
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
