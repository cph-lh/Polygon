package data;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportDataMapper {
    
    public void addReportInfo(String rDate, int pID, String bResponsible, int bID){
        
        String query = "insert into reportInfo (rDate, pID, bResponsible, bID) "
                + "values('" + rDate + "','" + pID + "','"
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
