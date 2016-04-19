<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StyleSheet.css">
        <title>Polygon - Customer login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form name="cLogin" action="ControllerServlet" method="post">
            Kunde ID<br><input type="text" name="cID"><br>
            Password<br><input type="password" name="pwd"><br>
            <br>
            <input type="submit" value="Login" name="login">
            <input type="hidden" value="login" name="do_this">
        </form>
        <form action="index.html" method="post"><br>
            <input type="button" value="Back" onClick="window.location = 'index.html'; return true;"> 
        </form>
    </body>
</html>