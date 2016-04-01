package domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DM_Building {


    public void addBuilding(int id, String name, String address, String city, int zip, int parcel, int size)
    {
        try
        {
            String query = "insert into buildings(cID,bName,bAddress,bCity,bZip,bParcel,bSize)"
                    + " values('" + id + "','" + name + "','"
                    + address + "','" + city + "','" + zip + "','" + parcel + "','"+ size +"')";
            new Connector().connect().createStatement().executeUpdate(query);
            
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public ArrayList<Building> buildings(int cID)
    {

        try
        {
            ArrayList<Building> buildingList = new ArrayList();
            
            String query = "select * from buildings where cID = '" + cID + "'";
            
            ResultSet res = new Connector().connect().createStatement().executeQuery(query);
            
            String name = "";
            String address = "";
            String city = "";
            int zip = 0;
            int parcel = 0;
            int size = 0;
            int floors = 0;
            int status = 0;
            
                    while (res.next())
            {
            try
            {    
            name = res.getString("bName");
            address = res.getString("bAddress");
            city = res.getString("bCity");
            zip = res.getInt("bZip");
            parcel = res.getInt("bParcel");
            size = res.getInt("bSize");
            floors = res.getInt("bFloors");
            status = res.getInt("bStatus");
            
            Building building = new Building(cID, name, address, zip, city, parcel, size, floors, status);
            buildingList.add(building);
            
            } catch (SQLException ex)
            {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            return null;
        } catch (SQLException ex)
        {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
