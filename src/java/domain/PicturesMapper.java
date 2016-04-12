/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.*;

/**
 *
 * @author Jmach
 */
public class PicturesMapper {
    
    public void customerDocument(){
        
        String query = "insert into pictures (documents) values (?)";
        
        new Connector().connect().createStatement().executeUpdate(query);
        
        Statement.setBinaryStream(1, );
    }
}
