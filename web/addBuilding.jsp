<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            Building year:<input type="text" name="year"><br>
            Size:<input type="text" name="bSize"><br>
            Floors:<input type="text" name="bFloors"><br>
            <input type="submit" value="Confirm">
            <input type="hidden" name="do_this" value="addBuilding">
        </form>
        <form action="customerPage.jsp" method="post">
        <input type="button" value="Back" onClick="window.location = 'customerPage.jsp'; return true;">
        </form>
    </body>
</html>
