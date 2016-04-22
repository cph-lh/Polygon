package domain;

public class Comment
{
    String bID, bOutsideC, roofC, outerWallsC, wallsC, celingC ,floorC ,windows_doorsC;

    public Comment(String bID, String bOutsideC, String roofC, String outerWallsC, String wallsC, String celingC, String floorC, String windows_doorsC)
    {
        this.bID = bID;
        this.bOutsideC = bOutsideC;
        this.roofC = roofC;
        this.outerWallsC = outerWallsC;
        this.wallsC = wallsC;
        this.celingC = celingC;
        this.floorC = floorC;
        this.windows_doorsC = windows_doorsC;
    }
    
    
    public String getbID()
    {
        return bID;
    }

    public void setbID(String bID)
    {
        this.bID = bID;
    }

    public String getbOutsideC()
    {
        return bOutsideC;
    }

    public void setbOutsideC(String bOutsideC)
    {
        this.bOutsideC = bOutsideC;
    }

    public String getRoofC()
    {
        return roofC;
    }

    public void setRoofC(String roofC)
    {
        this.roofC = roofC;
    }

    public String getOuterWallsC()
    {
        return outerWallsC;
    }

    public void setOuterWallsC(String outerWallsC)
    {
        this.outerWallsC = outerWallsC;
    }

    public String getWallsC()
    {
        return wallsC;
    }

    public void setWallsC(String wallsC)
    {
        this.wallsC = wallsC;
    }

    public String getCelingC()
    {
        return celingC;
    }

    public void setCelingC(String celingC)
    {
        this.celingC = celingC;
    }

    public String getFloorC()
    {
        return floorC;
    }

    public void setFloorC(String floorC)
    {
        this.floorC = floorC;
    }

    public String getWindows_doorsC()
    {
        return windows_doorsC;
    }

    public void setWindows_doorsC(String windows_doorsC)
    {
        this.windows_doorsC = windows_doorsC;
    }
    
}
