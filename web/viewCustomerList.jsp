<%@page import="domain.Controller"%>
<%@page import="domain.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Controller con = new Controller(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Admin - Kunde liste</title>
    </head>
    <body>
        <h1>Kunde liste</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Navn</th>
                    <th>Adresse</th>
                    <th>Postnummer</th>
                    <th>By</th>
                    <th>Telefon</th>
                    <th>Bygninger</th>
                    <th>Slet kunde</th>
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
                    <td align="center">
                        <form action="ControllerServlet" method="post">
                            <input type="submit" value="View buildings" name="viewCBuilding">
                            <input type="hidden" value="viewCBuilding" name="do_this">
                            <input type="hidden" value="<%=c.getID()%>" name="getID">                        
                        </form>
                    </td> 
                    <td align="center">
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
