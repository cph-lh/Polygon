package data;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PictureDataMapper {

    public void addPicture(int bID, InputStream input, int column)
    {

        try
        {
            Connection con = new Connector().connect();

            String query = "insert into pictures (bID '" + column + "') values (?,?)";
            PreparedStatement state = con.prepareStatement(query);
            state.setInt(1, bID);
            state.setBlob(column, input);
            state.executeUpdate();
        } catch (SQLException ex)
        {
            Logger.getLogger(PictureDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
