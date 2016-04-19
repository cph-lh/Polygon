<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Tilføj kunde</title>
    </head>
    <body>
        <h1>Tilføj kunde</h1>
        <form name="add" action="ControllerServlet" method="post">
            ID: <input type="text" name="cID"><br>
            Navn: <input type="text" name="cName"><br>
            Telefon: <input type="text" name="cPhone"><br>
            Address: <input type="text" name="cAddress"><br>
            Postnummer: <input type="text" name="cZip"><br>
            Password: <input type="text" name="cPassword"><br>
            <input type="submit" value="Tilføj kunde">
            <input type="hidden" name="do_this" value="addCustomer">
        </form>
<!--        <br>
        <hr>
        <h1> Delete Customer</h1>
        <form name="delete" action="ControllerServlet" method="post">
            Customer ID: <input type="text" name="deletecID"><br>
            <input type="submit" value="Delete customer">
            <input type="hidden" name="do_this" value="deleteCustomer">
        </form>-->
        <form action="adminPage.jsp" method="post"><br>
            <input type="button" value="Tilbage" onClick="window.location = 'adminPage.jsp'; return true;"> 
        </form>
    </body>
</html>
