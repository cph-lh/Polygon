/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jmach
 */
public class reportInfoDataMapper {
    
    public void addReportInfo(int rID, String rDate, int pID, String bResponsible, int bID){
        
        String query = "insert into reportInfo (rID, rDate, pID, bResponsible, bID) "
                + "values('" + rID + "','" + rDate + "','" + pID + "','"
                + bResponsible + "','" + bID + "')";
        
        try
        {
            new Connector().connect().createStatement().executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(reportInfoDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
