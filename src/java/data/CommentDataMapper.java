package data;

import domain.Comment;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommentDataMapper {
    
    public void createComment(int bID, String bOutsideC, String roofC, String outerWallsC, String wallsC, String celingC, String floorC, String windows_doorsC){
        try
        {
            String query = "insert into comments(bID,bOutsideC,roofC,outerWallsC,wallsC,celingC,floorC,windows_doorsC)"
                    + " values(" + bID + ",'" + bOutsideC + "','"
                    + roofC + "','" + outerWallsC + "','" + wallsC + "','" + celingC + "','" + floorC + "','" + windows_doorsC + "');";
            new Connector().connect().createStatement().executeUpdate(query);
        } catch (SQLException ex)
        {
            Logger.getLogger(CommentDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public void createComment(int bID, Comment comment){
//        try
//        {
//            String sql = "INSERT INTO comments (bID, bOutsideC, roofC, outerWallsC, wallsC, celingC, floorC, windows_doorsC)VALUES(?,?,?,?,?,?,?,?);";
//            PreparedStatement pstmt = new Connector().connect().prepareStatement(sql);
//            pstmt.setInt(1, bID);
//            pstmt.setString(2, comment.getbOutsideC());
//            pstmt.setString(3, comment.getRoofC());
//            pstmt.setString(4, comment.getOuterWallsC());
//            pstmt.setString(5, comment.getWallsC());
//            pstmt.setString(6, comment.getCelingC());
//            pstmt.setString(7, comment.getFloorC());
//            pstmt.setString(8, comment.getWindows_doorsC());
//            
//            
//        } catch (SQLException ex)
//        {
//            Logger.getLogger(CommentDataMapper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    public void updateCommentColumn(int bID, String column, String comment)
    {
        try
        {
            int checkBID = -1;

            String query = "select bID from comments where bID =" + bID + ";";
            ResultSet res = new Connector().connect().createStatement().executeQuery(query);

            if (res.next())
            {
                checkBID = res.getInt("bID");
                System.out.println("------checkbdid--------"+checkBID);
            }
            if (checkBID != -1)
            {
                String updateQuery = "update comments set " + column + "='" + comment + "' where bID =" + bID + ";";
                new Connector().connect().createStatement().executeUpdate(updateQuery);
            } 
        } catch (SQLException ex)
        {
            Logger.getLogger(CommentDataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}