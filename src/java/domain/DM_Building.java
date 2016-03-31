package domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DM_Building {

    Statement stmt;

    public String addBuilding(String name, String address, int parcel, int floors, int size, int status)
    {
        try
        {
            String query = "insert into buildings values('" + name + "','" + address + "','"
                    + parcel + "','" + floors + "','" + size + "','" + status + "')";

            stmt.executeUpdate(query);
            return query;
        } catch (SQLException ex)
        {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Building> buildings(int cID)
    {

        ArrayList<Building> buildingList = new ArrayList();

        String query = "select * from buildings where cID = '" + cID + "'";

        ResultSet res;

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

        return buildingList;
    }
}
