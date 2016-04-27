<%@page import="domain.Building"%>
<%@page import="domain.Controller" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Controller con = new Controller(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Kunder <%= session.getAttribute("cID")%> - Buildings</title>
    </head>
    <body>
        <h1>Registrede bygninger</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Navn</th>
                    <th>Adresse</th>
                    <th>Postnummer</th>
                    <th>By</th>
                    <th>Matrikel nr.</th>
                    <th>Bygningsareal</th>
                    <th>Etager</th>
                    <th>Byggeår</th>
                    <th colspan="2">Bygningsdokumenter</th>
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
                    <td>Upload plantegning<br>
                        <form action="ControllerServlet" method="post" enctype="multipart/form-data">
                            <input type="file" name="file" accept="image/*">
                            <input type="hidden" name="do_this" value="uploadFP"><br>
                            <input type="hidden" name="bID" value="<%=b.getbID()%>">
                            <input type="submit" value="Upload">
                        </form>
                    </td>
                    <td>
                        <form action="ImageServlet" method="get">
                            <input type="hidden" name="bID" value="<%=b.getbID()%>">
                            <input type="hidden" name="do_this" value="viewFP">                           
                            <input type="submit" value="Se plantegning">
                        </form>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <form action="customerPage.jsp" method="post"><br>
            <input type="button" value="Tilbage" onClick="window.location = 'customerPage.jsp'; return true;"> 
        </form>
    </body>
</html>
