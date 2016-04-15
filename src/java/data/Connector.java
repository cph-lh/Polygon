package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector
{
    private final String username = "root"; //sql7113086
    private final String password = "1234"; //kbHfiyC5dS
    private final String host = "localhost"; //sql7.freemysqlhosting.net
    private final String port = "3306";
    private final String db = "PolygonDB"; //sql7113086
    Connection con;

    public Connection connect() throws SQLException 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+host+":"+port+"/"+db;
            return con = DriverManager.getConnection(url, username, password);   
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
       private void disconnect() throws SQLException 
    {
        try
        {
        con.close();   
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
