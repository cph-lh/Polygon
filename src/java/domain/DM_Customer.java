package domain;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DM_Customer {
    
    public void addCustomer(int id, String name, String address, int zip, String city, int phone, String password)
    {
        try
        {
            String query = "insert into buildings values('" + id + "','" + name + "','"
                    + address + "','" + zip + "','" + city + "','" + phone +"')";

            new Connector().connect().createStatement().executeUpdate(query);
            
        } catch (SQLException ex)
        {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
