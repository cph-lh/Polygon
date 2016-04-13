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
public class PicturesDataMapper {
    
//måske en insert og update, eller noget if ?

    public void addPicture(int bID, String filePath, int column)
    {

        try
        {
            Connection con = new Connector().connect();
     

            InputStream inputStream = new FileInputStream(new File(filePath));

            String query = "insert into pictures (bID '" + column + "') values (?,?)";
            PreparedStatement state = con.prepareStatement(query);
            state.setInt(1, bID);
            state.setBlob(column, inputStream);

            state.executeUpdate();
        } catch (SQLException | FileNotFoundException ex)
        {
            Logger.getLogger(PicturesDataMapper.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}
