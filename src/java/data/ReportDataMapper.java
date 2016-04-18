package data;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportDataMapper {
    
    public void addReportInfo(int rID, String rDate, int pID, String bResponsible, int bID){
        
        String query = "insert into reportInfo (rID, rDate, pID, bResponsible, bID) "
                + "values('" + rID + "','" + rDate + "','" + pID + "','"
                + bResponsible + "','" + bID + "')";
        
        try
        {
            new Connector().connect().createStatement().executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(ReportDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
