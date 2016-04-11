package domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuildingDataMapper {

    public void addBuilding(int id, String name, String address, int zip, int parcel, int size)
    {
        try
        {
            String query = "insert into buildings(cID,bName,bAddress,zip,bParcel,bSize)"
                    + " values('" + id + "','" + name + "','"
                    + address + "','" + zip + "','" + parcel + "','" + size + "')";
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

            String query = "select * from zipcodes natural join buildings where cID = '"+ cID +"'";

            ResultSet res = new Connector().connect().createStatement().executeQuery(query);

            while (res.next())
            {               
                String name = res.getString("bName");
                String address = res.getString("bAddress");               
                int parcel = res.getInt("bParcel");
                int size = res.getInt("bSize");
                int floors = res.getInt("bFloors");
                int status = res.getInt("bStatus");
                int zip = res.getInt("zip");
                String city = res.getString("city");

                Building building = new Building(cID, name, address, zip, parcel, size, floors, status, city);
                buildingList.add(building);

            }
            return buildingList;
        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
}
