package domain;

import java.sql.*;
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
}
