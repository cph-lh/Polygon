package domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDataMapper {
    
    public void addCustomer(int id, String name, String address, int zip, int phone, String password)
    {
        try
        {
            String query = "insert into customers (cID,cName,cPhone,cAddress,zip,cPassword) "
                    + "values('" + id + "','" + name + "','"
                    + phone + "','" + address +"','" + zip + "','" + password + "')";

            new Connector().connect().createStatement().executeUpdate(query);
            
        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Customer getCustomer(int cID)
    {        
        try
        {
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
         try
        {           
            String query = "delete from customers where cID = '" + cID + "';";
            
            new Connector().connect().createStatement().executeUpdate(query);
            
        } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public ArrayList<Customer> viewCustomers()
    {        
        try
        {
            ArrayList<Customer> cList = new ArrayList();
            
            Connection con = new Connector().connect();
            Statement state =  con.createStatement();
        
            String query = "select * from customers natural join zipcodes";
            ResultSet res = state.executeQuery(query);
            
            while(res.next())
            {
                int id = res.getInt("cID");
                String name = res.getString("cName");
                String address = res.getString("cAddress");               
                int zip = res.getInt("zip");
                String city = res.getString("city");
                int phone = res.getInt("cPhone");
                cList.add(new Customer(id,name,address,zip,city,phone));
            }
            return cList;
                } catch (SQLException ex)
        {
            Logger.getLogger(BuildingDataMapper.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
}
