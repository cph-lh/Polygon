<%@page import="domain.Building"%>
<%@page import="domain.Controller" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Controller con = new Controller(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Customer <%= session.getAttribute("cID")%> - Buildings</title>
    </head>
    <body>
        <h1>POLYGON</h1>
        <hr>
        <h2>Registered buildings</h2>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Zip</th>
                    <th>City</th>
                    <th>Parcel no.</th>
                    <th>Size</th>
                    <th>Floors</th>
                    <th>Year</th>
                    <th colspan="2">Building documents</th>
                </tr>
            </thead>           
            <tbody>
                <% Integer cID = (Integer) session.getAttribute("cID");
                for(Building b : con.viewBuildings(cID))
                  {   
                 %>
                <tr>
                    <td><%= b.getbID()%></td>
                    <td><%= b.getName() %></td>
                    <td><%= b.getAddress() %></td>
                    <td><%= b.getZip()%></td>
                    <td><%= b.getCity()%></td>
                    <td class="align"><%= b.getParcel() %></td>
                    <td class="align"><%= b.getSize() %></td>
                    <td class="align"><%= b.getFloors() %></td>
                    <td><%= b.getYear() %></td>                                       
                    <td>Upload floor plan<br>
                        <form action="ControllerServlet" method="post" enctype="multipart/form-data">
                            <input type="file" name="file">
                            <input type="hidden" name="do_this" value="uploadFP"><br>
                            <input type="hidden" name="bID" value="<%=b.getbID()%>">
                            <input type="submit" value="Upload">
                        </form>
                    </td>
                    <td>
                        <form action="ControllerServlet" method="post">
                            <input type="hidden" name="do_this" value="viewFP">
                           
                            <input type="submit" value="View Floor Plan">
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
