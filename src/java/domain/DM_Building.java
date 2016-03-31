/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jmach
 */
public class DM_Building {
    
    public String addBuilding(String name, String address, int parcel, int floors, int size, int status){
        
        String query = "insert into buildings values('"+name+"','" +address+"','"+ 
                                parcel+"','"+ floors+"','"+size+"','"+status+"')";
                            
        stmt.executeUpdate(query);
        return query;
    }
}
