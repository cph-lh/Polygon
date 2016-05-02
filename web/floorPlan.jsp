<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Polygon - Plantegning for bygning <%= session.getAttribute("bID")%></title>
    </head>
    <body>
         <img src="ImageServlet" alt="floorPlan">
         <form method="post"><br>
            <input type="button" value="Tilbage" onClick="history.back()"> 
            </form>
    </body>
</html>
