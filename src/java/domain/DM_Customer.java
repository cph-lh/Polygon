package domain;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DM_Customer {
    
    public void addCustomer(int id, String name, String address, int zip, int phone, String password)
    {
        try
        {
            String query = "insert into customers values('" + id + "','" + name + "','"
                    + address + "','" + zip +"','" + phone + "','" + password + "')";

            new Connector().connect().createStatement().executeUpdate(query);
            
        } catch (SQLException ex)
        {
            Logger.getLogger(DM_Building.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Customer getCustomer(int cID)
    {        
        try
        {
            System.out.println("******1******");
            Connection con = new Connector().connect();
            Statement state =  con.createStatement();
        
            String query = "select * from customers where cID = '"+cID+"';";
            ResultSet res = state.executeQuery(query);
        
            if(res.next())
            {
                Customer c = new Customer(res.getInt(1),res.getString(2),res.getInt(3), res.getString(4),res.getInt(5),res.getString(6));
                return c;
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public void deleteCustomer(int cID){
        
    }
}
