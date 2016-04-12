<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polygon - Submit report</title>
    </head>
    <body style="font-family: calibri">
        <%--<img src="polygon-logo.jpg" alt="logo"/>--%>
        <h1>Bygningsrapport</h1>
        <label for="reportNumber">Rapport nr.</label>
        <label id="reportNumber"></label><br>
        <label for="date">Dato</label>  
        <input type="text" id="date" name="date"><br>
        <label for="customerID">Kunde ID</label>
        <input type="text" id="customerID" name="customerID"><br>
        <label for="buildingName">Navn på bygning</label>
        <input type="text" id="buildingName" name="buildingName"><br>
        <label for="address">Adresse</label>
        <input type="text" id="address" name="address"><br>
        <label for="zip">Postnummer</label>
        <input type="text" id="zip" name="zip"><br>
        <label for="city">By</label>
        <input type="text" id="city" name="city"><br><br><br>       
        <label style="font-size: 120%">Generel information om bygningen</label><br><br>
        <label for="year">Byggeår&#160</label>
        <input type="text" id="year" name="year" size="6"><br>
        <label for="size">Bygningsareal i m² (hver etage tælles separat)&#160</label>
        <input type="text" id="year" name="size" size="6"><br>
        <label for="usage">Hvad bruges/har bygningen været brugt til?&#160</label>
        <input type="text" id="year" name="usage"><br><br><br>
        <label style="font-size: 120%">Udvendig gennemgang af bygningen</label><br><br>
        <table border="1" cellspacing="0" cellpadding="2">
            <thead style="background-color: gainsboro">
                <tr>
                    <th colspan="3">Tag</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><table border="0" cellspacing="0" cellpadding="2">
                            <tbody>
                                <tr>
                                    <td><input type="checkbox" name="comment" value="ON"/>Bemærkninger</td>
                                </tr>
                            </tbody>
                        </table>
                    </td>
                    <td><table border="0" cellspacing="0" cellpadding="2">
                            <tbody>
                                <tr>
                                    <td><input type="checkbox" name="noComment" value="ON"/>Ingen bemærkninger</td>
                                </tr>
                            </tbody>
                        </table></td>
                    <td><table border="0" cellspacing="0"cellpadding="2">
                            <tbody>
                                <tr>
                                    <td><input type="checkbox" name="uploadPicture" value="ON"/>Billede</td>
                                </tr>

                            </tbody>
                        </table></td>                      
                </tr>
            <td colspan="5"><input type="text" size="55"></td>
        </tbody>
    </table><br>
    <table border="1" cellspacing="0" cellpadding="2">
        <thead style="background-color: gainsboro">
            <tr>
                <th colspan="3">Ydervægge</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><table border="0" cellspacing="0" cellpadding="2">
                        <tbody>
                            <tr>
                                <td><input type="checkbox" name="comment" value="ON"/>Bemærkninger</td>
                            </tr>
                        </tbody>
                    </table>
                </td>
                <td><table border="0" cellspacing="0" cellpadding="2">
                        <tbody>
                            <tr>
                                <td><input type="checkbox" name="noComment" value="ON"/>Ingen bemærkninger</td>
                            </tr>
                        </tbody>
                    </table></td>
                <td><table border="0" cellspacing="0"cellpadding="2">
                        <tbody>
                            <tr>
                                <td><input type="checkbox" name="uploadPicture" value="ON"/>Billede</td>
                            </tr>

                        </tbody>
                    </table></td>                      
            </tr>
        <td colspan="3"><input type="text" size="55"></td>
    </tbody>
</table><br><br>
<label style="font-size: 120%">Indvendig gennemgang af bygningen</label><br><br>
<table border="0" cellspacing="0" cellpadding="2">
    <tbody>
        <tr>
            <td>Lokale&#160<input type="text" name="room" size="15"/></td>
            <td><input type="checkbox" name="comment" value="ON"/>Bemærkninger</td>
            <td><input type="checkbox" name="noComment" value="ON"/>Ingen bemærkninger</td>
        </tr>
    </tbody>
</table><br>
<table border="0" cellspacing="0" cellpadding="2">
    <tbody>
        <tr>
            <td>Har der været skade i lokalet?&#160
                <input type="checkbox" name="dmgY" value="ON"/>Ja
                <input type="checkbox" name="dmgN" value="ON"/>Nej</td>
        </tr>
        <tr>
            <td>Hvor&#160<input type="text" name="room" size="20"/>&#160Hvornår&#160<input type="text" name="room" size="30"/></td>
        </tr>
        <tr>
            <td>Hvad er der sket&#160<input type="text" name="room" size="30"/></td>
        </tr>
        <tr>
            <td>Hvad er repareret&#160<input type="text" name="room" size="30"/></td>
        </tr>
    </tbody>
</table><br>
<table border="1" cellspacing="0" cellpadding="2">
    <tbody>
    <thead style="background-color: gainsboro">
            <tr>
                <th colspan="1">Skade</th>
            </tr>
        </thead>
        <tr>
            <td><input type="checkbox" name="dmgY" value="ON"/>Fugt/vand</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="dmgY" value="ON"/>Råd/svamp</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="dmgY" value="ON"/>Skimmel</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="dmgY" value="ON"/>Brand</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="dmgY" value="ON"/>Anden skade&#160<input type="text" name="room" size="30"/></td></td>
        </tr>
    </tbody>
</table><br>
</body>
</html>
