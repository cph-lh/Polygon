<%@page import="domain.Building"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="domain.Facade" %>
<% Facade f = new Facade(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Customer</title>
    </head>
    <body>
        <h1>View Buildings</h1>
        <table>
            <thead>
                <tr>
                    <th>cID&#160</th>
                    <th>bName&#160</th>
                    <th>bAddress&#160</th>
                    <th>bZip&#160</th>
                    <th>bParcel&#160</th>
                    <th>bSize&#160</th>
                    <th>bFloors&#160</th>
                    <th>bStatus&#160</th>
                </tr>
            </thead>           
            <tbody>
                <% Integer cID = (Integer) session.getAttribute("cID");
                for(Building b : f.viewBuilding(cID))
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
