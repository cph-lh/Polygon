package domain;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DM_Customer {
    
    Statement stmt;

    public String addCustomer(String name, String address, int phone, int ID, String password)
    {
        try
        {
            String query = "insert into customers values('" + ID + "','" + name + "','"
                    + phone + "','" + address + "','" + password + "')";

            stmt.executeUpdate(query);
            return query;
        } catch (SQLException ex)
        {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
}
