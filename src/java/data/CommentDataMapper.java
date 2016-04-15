package data;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommentDataMapper {

    public void addComments(int bID, String column, String comment)
    {
        String query = "insert into comments (bID'" + column + "') values('" + bID + "','" + comment + "')";
        try
        {
            new Connector().connect().createStatement().executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(CommentDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
