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
                    <th>ID&#160</th>
                    <th>Name&#160</th>
                    <th>Address&#160</th>
                    <th>Zip&#160</th>
                    <th>Parcel&#160</th>
                    <th>Size&#160</th>
                    <th>Floors&#160</th>
                    <th>Status&#160</th>
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
            <form action="customerPage.jsp" method="post">
        <input type="button" value="Back" onClick="history.go(-1);return true;"> 
        </form>
    </body>
</html>
