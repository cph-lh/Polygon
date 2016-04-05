<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Customer <%= session.getAttribute("cID")%></title>
    </head>
    <body>
        <h1>Welcome, <%= session.getAttribute("title")%></h1>
        <form action="ControllerServlet" method="post">
            <input type="submit" value="Add new building" name="button">       
            <input type="submit" value="View buildings" name="button">
            <input type="hidden" name="do_this" value="customerButtons">         
        </form>
    </body>
</html>
