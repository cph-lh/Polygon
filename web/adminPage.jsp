<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Admin</title>
    </head>
    <body>
        <h1>Admin Page</h1>
        <form action="ControllerServlet" method="post">
            <input type="submit" value="Add/delete customers" name="aButton">
            <input type="submit" value="Customer list" name="aButton">
            <input type="submit" value="Submit report" name="aButton">        
            <input type="hidden" name="do_this" value="adminButtons">
        </form>
        <form action="index.html" method="post"><br>
            <input type="button" value="Back" onClick="window.location = 'index.html'; return true;"> 
        </form>
    </body>
</html>
