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
            .button{
                width: 200px;
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
        <input type="text" id="year" name="usage" size="35"><br><br><br>
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
                                    <td><input type="radio" name="roofC" value="on"/>Bemærkninger</td>
                                </tr>
                            </tbody>
                        </table>
                    </td>
                    <td><table border="0" cellspacing="0" cellpadding="2">
                            <tbody>
                                <tr>
                                    <td><input type="radio" name="roofC" value="off" checked="checked"/>Ingen bemærkninger</td>                                  
                                </tr>
                            </tbody>
                        </table></td>
                    <td><table border="0" cellspacing="0"cellpadding="2">
                            <tbody>
                                <tr>
                                    <td>Billede&#160<input type="file" name="roofPicture"/></td>
                                </tr>
                            </tbody>
                        </table></td>                      
                </tr>
            <td colspan="5"><input type="text" name="roofComment" size="77"></td>
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
                                <td><input type="radio" name="outerWallsC" value="on"/>Bemærkninger</td>
                            </tr>
                        </tbody>
                    </table>
                </td>
                <td><table border="0" cellspacing="0" cellpadding="2">
                        <tbody>
                            <tr>
                                <td><input type="radio" name="outerWallsC" value="off" checked="checked"/>Ingen bemærkninger</td>
                            </tr>
                        </tbody>
                    </table></td>
                <td>
                    <table border="0" cellspacing="0"cellpadding="2">
                        <tbody>
                            <tr>
                                <td>Billede&#160<input type="file" name="outerWallPicture" value="ON"/></td>
                            </tr>

                        </tbody>
                    </table>
                </td>                    
            </tr>
        <td colspan="3"><input type="text" name="outerWallComment" size="77"></td>
    </tbody>
</table><br><br>
<label class="header">Indvendig gennemgang af bygningen</label><br><br>
<table border="0" cellspacing="0" cellpadding="2">
    <tbody>
        <tr>
            <td>Lokale&#160<input type="text" name="roomID" size="15"/></td>
            <td><input type="radio" name="roomComment" value="on"/>Bemærkninger</td>
            <td><input type="radio" name="roomComment" value="off" checked="checked"/>Ingen bemærkninger</td>
        </tr>
    </tbody>
</table><br>
<table border="0" cellspacing="0" cellpadding="2">
    <tbody>
        <tr>
            <td>Har der været skade i lokalet?&#160
                <input type="radio" name="damaged" value="on"/>Ja
                <input type="radio" name="damaged" value="off" checked="checked"/>Nej</td>
        </tr>
        <tr>
            <td>Hvor&#160<input type="text" name="dmgLocation" size="30"/>&#160Hvornår&#160<input type="text" name="dmgDate" size="30"/></td>
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
        <td><input type="checkbox" name="other" value="ON"/>Anden skade&#160<input type="text" name="otherDamage" size="30"/></td></td>
    </tr>
</tbody>
</table><br>
<table border="1" cellspacing="0" cellpadding="2">
    <tbody>
    <thead class="thead">
        <tr>
            <th align="left">Gennemgang af:</th>
            <th>Bemærkninger</th>
            <th>Ingen bemærkninger</th>
            <th>Billede</th>
        </tr>
    </thead>
    <tr>
        <td>Vægge</td>
        <td align="center"><input type="radio" name="wallC" value="on"/></td>
        <td align="center"><input type="radio" name="WallC" value="off" checked="checked"/></td>
        <td align="center"><input type="file" name="wallPicture"/></td>
    </tr>
    <tr>
        <td colspan="4"><input type="text" name="wallComment" size="83"/></td>
    </tr>
    <tr>
        <td>Loft</td>
        <td align="center"><input type="radio" name="ceilingC" value="ON"/></td>
        <td align="center"><input type="radio" name="ceilingC" value="OFF" checked="checked"/></td>
        <td align="center"><input type="file" name="ceilingPicture"/></td>
    </tr>
    <tr>
        <td colspan="4"><input type="text" name="ceilingComment" size="83"/></td>
    </tr>
    <tr>
        <td>Gulv</td>
        <td align="center"><input type="radio" name="floorC" value="ON"/></td>
        <td align="center"><input type="radio" name="floorC" value="OFF" checked="checked"/></td>
        <td align="center"><input type="file" name="floorPicture"/></td>
    </tr>
    <tr>
        <td colspan="4"><input type="text" name="floorComment" size="83"/></td>
    </tr>
    <tr>
        <td>Vinduer/døre</td>
        <td align="center"><input type="radio" name="window/doorC" value="ON"/></td>
        <td align="center"><input type="radio" name="window/doorC" value="OFF" checked="checked"/></td>
        <td align="center"><input type="file" name="window/doorPicture"/></td>
    </tr>
    <tr>
        <td colspan="4"><input type="text" name="window/doorComment" size="83"/></td>
    </tr>
    <tr>
        <td><input type="text" name="customElement" size="16"/></td>
        <td align="center"><input type="radio" name="customC1" value="ON"/></td>
        <td align="center"><input type="radio" name="customC1" value="OFF" checked="checked"/></td>
        <td align="center"><input type="file" name="customPicture1"/></td>
    </tr>
    <tr>
        <td colspan="4"><input type="text" name="customComment" size="83"/></td>
    </tr>
    <tr>
        <td><input type="text" name="customElement" size="16"/></td>
        <td align="center"><input type="radio" name="customC2" value="ON"/></td>
        <td align="center"><input type="radio" name="customC2" value="OFF" checked="checked"/></td>
        <td align="center"><input type="file" name="customPicture2"/></td>
    </tr>
    <tr>
        <td colspan="4"><input type="text" name="customComment" size="83"/></td>
    </tr>
</tbody>
</table><br>
<label class="header">Fugtscanning</label><br><br>
<table border="0" cellspacing="0" cellpadding="2">
    <tbody>
        <tr>
            <td>Er der foretaget fugtscanning?&#160
                <input type="radio" name="scanned" value="ON"/>Ja
                <input type="radio" name="scanned" value="OFF" checked="checked"/>Nej</td>
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
    <tr><td><input type="text" name="roomID" size="15"/></td>
        <td><input type="text" name="dmgRecomendation" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID" size="15"/></td>
        <td><input type="text" name="dmgRecomendation" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID" size="15"/></td>
        <td><input type="text" name="dmgRecomendation" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID" size="15"/></td>
        <td><input type="text" name="dmgRecomendation" size="60"/></td></tr>
    <tr><td><input type="text" name="roomID" size="15"/></td>
        <td><input type="text" name="dmgRecomendation" size="60"/></td>
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
        <td align="center"><input type="radio" name="bStatus" value="ON"/></td>
    </tr>
    <tr>
        <td><label name="condition1">Tilstandsgrad 1</label></td>
        <td><label name="describtion1">Bygningsdelen er intakt, men med<br>begyndende slid og synlige skader<br>(kosmetiske skader)</label></td>
        <td><label name="function1">Funktionen er som beskrevet</label></td>
        <td align="center"><input type="radio" name="bStatus" value="ON"/></td>
    </tr>
    <tr>
        <td><label name="condition2">Tilstandsgrad 2</label></td>
        <td><label name="describtion2">Bygningsdelen er begyndt at forfalde,<br>med enkelte defekte komponenter</label></td>
        <td><label name="function2">Funktionen er nedsat - fare<br>for følgeskader</label></td>
        <td align="center"><input type="radio" name="bStatus" value="ON"/></td>
    </tr>
    <tr>
        <td><label name="condition3">Tilstandsgrad 3</label></td>
        <td><label name="describtion3">Bygningsdelen er nedbru raft og<br>skal udskiftes</label></td>
        <td><label name="function3">Funktionen er ophørt - fare<br>for følgeskader</label></td>
        <td align="center"><input type="radio" name="bStatus" value="ON"/></td>
    </tr>
</tbody>
</table><br>
<form action="ControllerServlet" method="post">
    <input class="button" type="submit" value="Submit report" name="submitReport" >        
    <input type="hidden" name="do_this" value="submitReport">&#160&#160&#160&#160&#160&#160&#160&#160&#160&#160
    <input type="button" value="Cancel" onClick="window.location = 'adminPage.jsp';
            return true;">
</form>
</body>
</html>
