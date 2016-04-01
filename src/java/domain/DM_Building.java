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
                    + address + "','" + city + "','" + zip + "','" + parcel + "','" + size + "')";
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

            while (res.next())
            {
                String name = res.getString("bName");
                String address = res.getString("bAddress");
                String city = res.getString("bCity");
                int zip = res.getInt("bZip");
                int parcel = res.getInt("bParcel");
                int size = res.getInt("bSize");
                int floors = res.getInt("bFloors");
                int status = res.getInt("bStatus");

                Building building = new Building(cID, name, address, zip, city, parcel, size, floors, status);
                buildingList.add(building);

            }
            return buildingList;
        } catch (SQLException ex)
        {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
