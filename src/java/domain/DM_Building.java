/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jmach
 */
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

        int cID;
        String name;
        String address;
        String city;
        int zip;
        int parcel;
        int size;
        int floors;
        int status;

        return buildingList;
    }
}
