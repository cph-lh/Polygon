<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                font-family: calibri;
            }
            thead{
                background-color: lightsteelblue;
            }
            .header{
                font-size: 120%;
            }             
        </style>
        <title>Polygon - Submit report</title>
    </head>
    <body>
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
        <label class="header">Udvendig gennemgang af bygningen</label><br><br>
        <table border="1" cellspacing="0" cellpadding="2">
            <thead class="thead">
                <tr>
                    <th colspan="3">Tag</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><table border="0" cellspacing="0" cellpadding="2">
                            <tbody>
                                <tr>
                                    <td><input type="checkbox" name="roofComment" value="ON"/>Bemærkninger</td>
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
        <thead class="thead">
            <tr>
                <th colspan="3">Ydervægge</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><table border="0" cellspacing="0" cellpadding="2">
                        <tbody>
                            <tr>
                                <td><input type="checkbox" name="outerWallsC" value="ON"/>Bemærkninger</td>
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
                <td>
                    <table border="0" cellspacing="0"cellpadding="2">
                        <tbody>
                            <tr>
                                <td><input type="checkbox" name="uploadPicture" value="ON"/>Billede</td>
                            </tr>

                        </tbody>
                    </table>
                </td>                    
            </tr>
        <td colspan="3"><input type="text" size="55"></td>
    </tbody>
</table><br><br>
<label class="header">Indvendig gennemgang af bygningen</label><br><br>
<table border="0" cellspacing="0" cellpadding="2">
    <tbody>
        <tr>
            <td>Lokale&#160<input type="text" name="roomID" size="15"/></td>
            <td><input type="checkbox" name="roomComment" value="ON"/>Bemærkninger</td>
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
            <td>Hvor&#160<input type="text" name="dmgLocation" size="20"/>&#160Hvornår&#160<input type="text" name="dmgDate" size="30"/></td>
        </tr>
        <tr>
            <td>Hvad er der sket&#160<input type="text" name="dmgDone" size="30"/></td>
        </tr>
        <tr>
            <td>Hvad er repareret&#160<input type="text" name="dmgRepaired" size="30"/></td>
        </tr>
    </tbody>
</table><br>
<table border="1" cellspacing="0" cellpadding="2">
    <tbody>
    <thead class="thead">
        <tr>
            <th colspan="1">Skade</th>
        </tr>
    </thead>
    <tr>
        <td><input type="checkbox" name="moisture/water" value="ON"/>Fugt/vand</td>
    </tr>
    <tr>
        <td><input type="checkbox" name="rot/fungus" value="ON"/>Råd/svamp</td>
    </tr>
    <tr>
        <td><input type="checkbox" name="mould" value="ON"/>Skimmel</td>
    </tr>
    <tr>
        <td><input type="checkbox" name="fire" value="ON"/>Brand</td>
    </tr>
    <tr>
        <td><input type="checkbox" name="otherDamage" value="ON"/>Anden skade&#160<input type="text" name="room" size="30"/></td></td>
    </tr>
</tbody>
</table><br><br>
<label class="header">Fugtscanning</label><br><br>
<table border="0" cellspacing="0" cellpadding="2">
    <tbody>
        <tr>
            <td>Er der foretaget fugtscanning?&#160
                <input type="checkbox" name="scannedY" value="ON"/>Ja
                <input type="checkbox" name="scannedN" value="ON"/>Nej</td>
        </tr>
        <tr>
            <td>Målepunkt&#160<input type="text" name="analysisResult" size="20"/></td>
        </tr>
        <tr>
            <td>Bemærkninger&#160<input type="text" name="analysisComment" size="40"/></td>
        </tr>
    </tbody>
</table><br><br>
<label class="header">Konklusion</label><br><br>
<table border="1" cellspacing="0" cellpadding="2">
    <tbody>
    <thead class="thead">
        <tr>
            <th>Lokale</th>
            <th>Anbefalinger</th>
        </tr>
    </thead>
    <tr><td><input type="text" name="roomID" size="15"/></td>
        <td><input type="text" name="dmgRecomendation" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID2" size="15"/></td>
        <td><input type="text" name="dmgRecomendation2" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID3" size="15"/></td>
        <td><input type="text" name="dmgRecomendation3" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID4" size="15"/></td>
        <td><input type="text" name="dmgRecomendation4" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID5" size="15"/></td>
        <td><input type="text" name="dmgRecomendation5" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID6" size="15"/></td>
        <td><input type="text" name="dmgRecomendation6" size="60"/></td>
    </tr>
</tbody>
</table><br>
<label for="pName">Bygningsgennemgangen er foretaget af&#160</label>
<input type="text" id="pName" name="polygon" size="30">
<label for="cName">, Polygon<br> i samarbejde med&#160</label>
<input type="text" id="cName" name="customer" size=41"><label>(bygningsansvarlig).</label><br><br>
<label class="header">Bygningstilstand</label><br><br>
<table border="1" cellspacing="0" cellpadding="2">
    <tbody>
    <thead class="thead">
        <tr>
            <th>Tilstand</th>
            <th>Beskrivelse af bygningen</th>
            <th>Funktion af bygningen</th>
            <th>Tilstandsgrad</th>
        </tr>
    </thead>
    <tr>
        <td><label name="condition0">Tilstandsgrad 0</label></td>
        <td><label name="describtion0">Bygningsdelen er ny og som bygget</label></td>
        <td><label name="function0">Funktionen er som beskrevet</label></td>
        <td align="center"><input type="checkbox" name="bStatus0" value="ON"/></td>
    </tr>
    <tr>
        <td><label name="condition1">Tilstandsgrad 1</label></td>
        <td><label name="describtion1">Bygningsdelen er intakt, men med<br>begyndende slid og synlige skader<br>(kosmetiske skader)</label></td>
        <td><label name="function1">Funktionen er som beskrevet</label></td>
        <td align="center"><input type="checkbox" name="bStatus1" value="ON"/></td>
    </tr>
    <tr>
        <td><label name="condition2">Tilstandsgrad 2</label></td>
        <td><label name="describtion2">Bygningsdelen er begyndt at forfalde,<br>med enkelte defekte komponenter</label></td>
        <td><label name="function2">Funktionen er nedsat - fare<br>for følgeskader</label></td>
        <td align="center"><input type="checkbox" name="bStatus2" value="ON"/></td>
    </tr>
    <tr>
        <td><label name="condition3">Tilstandsgrad 3</label></td>
        <td><label name="describtion3">Bygningsdelen er nedbruft og<br>skal udskiftes</label></td>
        <td><label name="function3">Funktionen er ophørt - fare<br>for følgeskader</label></td>
        <td align="center"><input type="checkbox" name="bStatus3" value="ON"/></td>
    </tr>
</body>
</html>
