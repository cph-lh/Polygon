<%-- 
    Document   : viewBuilding
    Created on : Mar 31, 2016, 12:04:33 PM
    Author     : Andreas
--%>

<%@page import="domain.Building"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="domain.Facade" %>
<% Facade f = new Facade(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buildings</title>
    </head>
    <body>
        <h1>View Buildings</h1>
        <form name="viewBuilding" action="ControllerServlet" method="post">
            Customer ID<br> 
            <input type="text" name="viewBuilding"><br>
            <input type="submit" value="View Buildings">
            <input type="hidden" name="do_this" value="addbuilding">
        </form>
        <table>
            <thead>
                <tr>
                    <th>cID</th>
                    <th>bName</th>
                    <th>bAddress</th>
                    <th>bZip</th>
                    <th>bParcel</th>
                    <th>bSize</th>
                    <th>bFloors</th>
                    <th>bStatus</th>
                </tr>
            </thead>
            
            <tbody>
                <% for(Building b : f.viewBuilding(1111))
                  {   
                 %>
                <tr>
                    <td><%= b.getcID() %></td>
                    <td><%= b.getName() %></td>
                    <td><%= b.getAddress() %></td>
                    <td><%= b.getZip() %></td>
                    <td><%= b.getParcel() %></td>
                    <td><%= b.getSize() %></td>
                    <td><%= b.getFloors() %></td>
                    <td><%= b.getStatus() %></td>                    
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
