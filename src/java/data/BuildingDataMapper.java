package data;

import domain.Building;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuildingDataMapper
{

    public void addBuilding(int id, String name, String address, int zip, int parcel, int size, int floors, int year)
    {
        try
        {
            String query = "insert into buildings(cID,bName,bAddress,zip,bParcel,bSize,bYear,bFloors)"
                    + " values('" + id + "','" + name + "','"
                    + address + "','" + zip + "','" + parcel + "','" + size + "'," + floors + "," + year + ");";
            new Connector().connect().createStatement().executeUpdate(query);

        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteBuilding(int bID)
    {
        try
        {
            String query = "delete from buildings where bID = '" + bID + "';";

            new Connector().connect().createStatement().executeUpdate(query);

        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteAllBuildings(int cID)
    {
        try
        {
            String query = "delete from buildings where cID = '" + cID + "';";

            new Connector().connect().createStatement().executeUpdate(query);

        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Building> viewBuildings(int cID)
    {
        try
        {
            ArrayList<Building> buildingList = new ArrayList();

            String query = "select * from zipcodes natural join buildings where cID = '" + cID + "'";

            ResultSet res = new Connector().connect().createStatement().executeQuery(query);

            while (res.next())
            {
                int bID = res.getInt("bID");
                String name = res.getString("bName");
                String address = res.getString("bAddress");
                int parcel = res.getInt("bParcel");
                int size = res.getInt("bSize");
                int floors = res.getInt("bFloors");
                int year = res.getInt("bYear");
                int zip = res.getInt("zip");
                String city = res.getString("city");

                Building building = new Building(cID, bID, name, address, zip, parcel, size, floors, year, city);
                buildingList.add(building);

            }
            return buildingList;
        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }

    public void addFloorPlan(int bID, InputStream input)
    {
        try
        {
            PreparedStatement state = new Connector().connect().prepareStatement("insert into floor_plan values (?,?)");
            state.setInt(1, bID);
            state.setBlob(2, input);
            state.executeUpdate();
        } catch (SQLException ex)
        {
            Logger.getLogger(PictureDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public InputStream getFloorPlan(int bID)
    {
        try
        {
            Connection con = new Connector().connect();
            PreparedStatement pstmt = null;
            ResultSet res = null;
            InputStream stream = null;
            pstmt = con.prepareStatement("select * from floor_plan where bID = '" + bID + "';");
            res = pstmt.executeQuery();
            
            while (res.next())
            {
                stream = res.getBinaryStream("floor_plan");
            }
            return stream;
        } catch (SQLException | IllegalArgumentException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void setStatus(int bID, int status)
    {

        try
        {
            String query = "update buildings set status='" + status + "' where bID = " + bID + ";";

            new Connector().connect().createStatement().executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addUsage(int bID, String bUsage){
        try
        {
            String query = "update buildings set bUsage='"+ bUsage+"' where bID =" + bID+";";

            new Connector().connect().createStatement().executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
