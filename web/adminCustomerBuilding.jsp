<%@page import="domain.Building"%>
<%@page import="domain.Controller" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Controller con = new Controller();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Admin - View customer buildings</title>
    </head>
    <body>
        <h1>Registered buildings for customer <%=session.getAttribute("cID")%></h1>
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
                    <th>Floor plan</th>
                    <th colspan="2">Reports</th>
                </tr>
            </thead>           
            <tbody>
                <% Integer cID = (Integer) session.getAttribute("cID");
                    for (Building b : con.viewBuildings(cID))
                    {
                        request.getSession().setAttribute("bID", b.getbID());
                %>
                <tr>
                    <td><%= b.getbID()%></td>
                    <td><%= b.getName()%></td>
                    <td><%= b.getAddress()%></td>
                    <td><%= b.getZip()%></td>
                    <td><%= b.getCity()%></td>
                    <td class="align"><%= b.getParcel()%></td>
                    <td class="align"><%= b.getSize()%></td>
                    <td class="align"><%= b.getFloors()%></td>
                    <td><%= b.getYear()%></td>                                       
                    <td>
                        <form action="ControllerServlet" method="post">
                            <input type="submit" value="View floor plan">
                            <input type="hidden" name="do_this" value="viewFP">
                        </form>
                    </td>
                    <td>
                        <form action="ControllerServlet" method="post">
                            <input type="hidden" name="bID" value="<%=b.getbID()%>">
                            <input type="hidden" name="bName" value="<%= b.getName()%>">
                            <input type="hidden" name="address" value="<%= b.getAddress()%>">
                            <input type="hidden" name="zip" value="<%= b.getZip()%>">
                            <input type="hidden" name="city" value="<%= b.getCity()%>">
                            <input type="hidden" name="parcel" value="<%= b.getParcel()%>">
                            <input type="hidden" name="size" value="<%= b.getSize()%>">
                            <input type="hidden" name="year" value="<%= b.getYear()%>">
                            <input type="submit" value="Submit report" name="rButton">
                            <input type="submit" value="View report" name="rButton">
                            <input type="hidden" name="do_this" value="reportButtons">
                        </form>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <form action="viewCustomerList.jsp" method="post"><br>
            <input type="button" value="Back" onClick="window.location = 'viewCustomerList.jsp';
                    return true;"> 
        </form>
    </body>
</html>