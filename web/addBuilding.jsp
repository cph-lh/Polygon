<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="domain.Facade"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Customer</title>
    </head>
    <body>
        <h1>Add Building</h1>
        <form name="addBuilding" action="ControllerServlet" method="post">
            Customer ID:<input type="text" name="cID"><br>
            Building name:<input type="text" name="bName"><br>
            Address:<input type="text" name="bAddress"><br>
            Zipcode:<input type="text" name="bZip"><br>
            City:<input type="text" name="bCity"><br>
            Parcel no.:<input type="text" name="bParcel"><br>
            Size:<input type="text" name="bSize"><br>
            <input type="submit" value="Confirm">
            <input type="hidden" name="do_this" value="addBuilding">
        </form>
    </body>
</html>
