<%-- 
    Document   : adminCustomerHandler
    Created on : 04-04-2016, 11:54:27
    Author     : Jmach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>Admin Page</h1>
        <form name="addOrDelete" action="ControllerServlet" method="post">
            Customer ID: <input type="text" name="cID">
            Customer Name: <input type="text" name="cName">
            Customer phone: <input type="text" name="cPhone">
            Customer Address: <input type="text" name="cAddress">
            Customer Zip: <input type="text" name="cZip">
            Customer password: <input type="text" name="cPassword">
            <input type="submit" value="add customer">
            <input type="hidden" name="do_this" value="add customer">
        </form>
    </body>
</html>
