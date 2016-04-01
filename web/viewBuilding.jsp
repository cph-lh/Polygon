<%-- 
    Document   : viewBuilding
    Created on : Mar 31, 2016, 12:04:33 PM
    Author     : Andreas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buildings</title>
    </head>
    <body>
        <h1>View Buildings</h1>
        <form name="viewBuilding" action="ControllerServlet" method="post">
            Customer ID<br> 
            <input type="text" name="viewBuilding"><br>
            <input type="submit" value="View Buildings">
            <input type="hidden" name="do_this" value="addbuilding">
        </form>
    </body>
</html>
