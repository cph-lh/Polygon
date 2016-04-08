<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="domain.Facade"%>
<% Facade f = new Facade(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Customer <%= session.getAttribute("cID")%> - Add building</title>
    </head>
    <body>
        <h1>Add Building</h1>
        <form name="addBuilding" action="ControllerServlet" method="post">
            Building name:<input type="text" name="bName"><br>
            Address:<input type="text" name="bAddress"><br>
            Zipcode:<input type="text" name="bZip"><br>
            Parcel no.:<input type="text" name="bParcel"><br>
            Size:<input type="text" name="bSize"><br>
            <input type="submit" value="Confirm">
            <input type="hidden" name="do_this" value="addBuilding">
        </form>
        <form action="customerPage.jsp" method="post">
        <input type="button" value="Back" onClick="window.location = 'customerPage.jsp'; return true;">
        </form>
    </body>
</html>
