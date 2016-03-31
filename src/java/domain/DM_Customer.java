/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jmach
 */
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
