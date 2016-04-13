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
public class commentsDataMapper {

    public void addComments(int bID, String column, String comment)
    {
        String query = "insert into comments (bID'" + column + "') values('" + bID + "','" + comment + "')";
        try
        {
            new Connector().connect().createStatement().executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(commentsDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
