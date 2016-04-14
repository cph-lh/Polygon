<%@page import="domain.Building"%>
<%@page import="domain.Facade" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Facade f = new Facade(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Customer <%= session.getAttribute("cID")%> - Buildings</title>
    </head>
    <body style="text-align: left">
        <h1>Registered buildings</h1>
        <table>
            <thead>
                <tr>
                    <th>ID&#160</th>
                    <th>Name&#160</th>
                    <th>Address&#160</th>
                    <th>Zip&#160</th>
                    <th>City&#160</th>
                    <th>Parcel&#160</th>
                    <th>Size&#160</th>
                    <th>Floors&#160</th>
                    <th>Year&#160</th>
                </tr>
            </thead>           
            <tbody>
                <% Integer cID = (Integer) session.getAttribute("cID");
                for(Building b : f.viewBuildings(cID))
                  {   
                 %>
                <tr>
                    <td><%= b.getbID()%></td>
                    <td><%= b.getName() %></td>
                    <td><%= b.getAddress() %></td>
                    <td><%= b.getZip()%></td>
                    <td><%= b.getCity()%></td>
                    <td><%= b.getParcel() %></td>
                    <td><%= b.getSize() %></td>
                    <td><%= b.getFloors() %></td>
                    <td><%= b.getYear() %></td>
                    <td colspan="6"></td>                   
                    <td>Upload floor plan<br>
                        <form action="ControllerServlet" method="post" enctype="multipart/form-data">
                            <input type="file" name="file">
                            <input type="hidden" name="do_this" value="uploadFP">
                            <input type="hidden" name="bID" value="<%=b.getbID()%>">
                            <input type="submit" value="Upload">
                        </form>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <form action="customerPage.jsp" method="post"><br>
            <input type="button" value="Back" onClick="window.location = 'customerPage.jsp'; return true;"> 
        </form>
    </body>
</html>
