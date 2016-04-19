<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Kunde <%= session.getAttribute("cID")%></title>
    </head>
    <body style>
        <h1>Velkommen, <%= session.getAttribute("title")%></h1>
        <form action="ControllerServlet" method="post">
            <input type="submit" value="Tilføj bygning" name="cButton">       
            <input type="submit" value="Se bygninger" name="cButton">
            <input type="submit" value="Log ud" name="cButton">           
            <input type="hidden" name="do_this" value="customerButtons">         
        </form>
    </body>
</html>
