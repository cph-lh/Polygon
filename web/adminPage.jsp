<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Admin</title>
    </head>
    <body>
        <h1>Admin Page</h1>
        <form action="ControllerServlet" method="post">
            <input type="submit" value="Customers" name="aButton">
            <input type="hidden" name="do_this" value="adminButtons">
        </form>
    </body>
</html>
