package data;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoomDataMapper {
    
    public void addRoom(int bID, String rName, String rComment,String rRecommendation ){
        
        try
        {
            String query = "insert into reportInfo (roomName, roomRecommendation)"
                    + "values('" + rName + "','" + rComment + "','" + rRecommendation + "')";
            
            new Connector().connect().createStatement().executeQuery(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(RoomDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
