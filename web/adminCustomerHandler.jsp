<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Admin</title>
    </head>
    <body>
        <h1>Admin Page</h1>
        <h2>Add Customer</h2>
        <form name="add" action="ControllerServlet" method="post">
            Customer ID: <input type="text" name="cID"><br>
            Customer Name: <input type="text" name="cName"><br>
            Customer phone: <input type="text" name="cPhone"><br>
            Customer Address: <input type="text" name="cAddress"><br>
            Customer Zip: <input type="text" name="cZip"><br>
            Customer password: <input type="text" name="cPassword"><br>
            <input type="submit" value="Add customer">
            <input type="hidden" name="do_this" value="addCustomer">
        </form>
        <br>
        <hr>
        <h2> Delete Customer</h2>
        <form name="delete" action="ControllerServlet" method="post">
            Customer ID: <input type="text" name="cID"><br>
            <input type="submit" value="Delete customer">
            <input type="hidden" name="do_this" value="deleteCustomer">
        </form>
    </body>
</html>
