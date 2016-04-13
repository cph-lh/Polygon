/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jmach
 */
public class PicturesMapper {

    public void addCustomerDocument(String filePath)
    {

        try
        {
            Connection con = new Connector().connect();
            InputStream inputStream;

            inputStream = new FileInputStream(new File(filePath));

            String query = "insert into pictures (documents) values (?)";
            PreparedStatement state = con.prepareStatement(query);
            state.setBlob(1, inputStream);

            state.executeUpdate();
        } catch (SQLException | FileNotFoundException ex)
        {
            Logger.getLogger(PicturesMapper.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}

public void addBuildingOutside(String FilePath){
    
}
