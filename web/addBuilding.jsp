<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Kunde <%= session.getAttribute("cID")%> - Tilføj Bygning</title>
    </head>
    <body>
        <h1>Add a building</h1>
        <form name="addBuilding" action="ControllerServlet" method="post">
            Bygnings Navn:<input type="text" name="bName"><br>
            Adresse:<input type="text" name="bAddress"><br>
            Postnummer:<input type="text" name="bZip"><br>
            Matrikel nr.:<input type="text" name="bParcel"><br>
            Bygnings år:<input type="text" name="year"><br>
            Areal:<input type="text" name="bSize"><br>
            Etager:<input type="text" name="bFloors"><br>
            <input type="submit" value="Confirm">
            <input type="hidden" name="do_this" value="addBuilding">
        </form>
        <form action="customerPage.jsp" method="post">
        <input type="button" value="Back" onClick="window.location = 'customerPage.jsp'; return true;">
        </form>
    </body>
</html>
