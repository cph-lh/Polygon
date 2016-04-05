<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Customer login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form name="cLogin" action="ControllerServlet" method="post">
            Customer ID:<input type="text" name="cID"><br>
            Password:<input type="password" name="pwd"><br>
            <input type="submit" value="Login" name="login">
            <input type="hidden" value="login" name="do_this">
        </form>
    </body>
</html>