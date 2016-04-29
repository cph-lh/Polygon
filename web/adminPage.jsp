<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Admin</title>
    </head>
    <body>
        <h1>Admin forside</h1>
        <form action="ControllerServlet" method="post">
            <input type="submit" value="Tilføj kunde" name="aButton">
            <input type="submit" value="Kundeliste" name="aButton">      
            <input type="hidden" name="do_this" value="adminButtons">
        </form>
        <form action="index.html" method="post"><br>
            <input type="button" value="Tilbage" onClick="window.location = 'index.html'; return true;"> 
        </form>
    </body>
</html>
