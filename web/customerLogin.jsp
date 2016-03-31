<%-- 
    Document   : customerLogin
    Created on : 31-03-2016, 10:35:07
    Author     : Jmach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomerLogin</title>
    </head>
    <body>
        <h1>Login</h1>
        <form name="cLogin" action="ControllerServlet" method="post">
            Name:<input type="text" name="name"><br>
            Password:<input type="text" name="pwd">
            <input type="submit" value="Login">
        </form>
    </body>
</html>
