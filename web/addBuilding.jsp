<%-- 
    Document   : addBuilding
    Created on : 31-03-2016, 09:35:14
    Author     : Jmach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers add building</title>
    </head>
    <body>
        <h1>Add Building</h1>
        <form name="addBuilding" action="ControllerServlet" method="post">
            Building name: <input type="text" name="bName"><br>
            Building address:<input type="text" name="bAdress"><br>
            Parcel no.:<input type="number" name="bFloors"><br>
            Building size:<input type="number" name="bSize"><br>
            <input type="submit" value="Confirm">
        </form>
    </body>
</html>
