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
public class PicturesMapper {
    
    public void customerDocument(){
               
        
        try
        {
            Connection con = new Connector().connect();
            String query = "insert into pictures (documents) values (?)";
            PreparedStatement state = con.prepareStatement(query);
            state.setBinaryStream(1, inputStream);
            
            state.executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(PicturesMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
