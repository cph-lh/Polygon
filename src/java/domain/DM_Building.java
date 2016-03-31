package domain;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DM_Building {

    Statement stmt;

    public String addBuilding(int id, String name, String address, int zip, String city, int parcel, int size)
    {
        try
        {
            String query = "insert into buildings values('" + id + "','" + name + "','"
                    + address + "','" + zip + "','" + city + "','" + parcel + "','"+ size +"')";

            stmt.executeUpdate(query);
            return query;
        } catch (SQLException ex)
        {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
