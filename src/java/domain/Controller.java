package domain;

import data.Facade;
import java.io.InputStream;
import java.util.ArrayList;

public class Controller {

    Facade f = new Facade();

    public void addBuilding(int id, String name, String address, int zip, int parcel, int size, int year, int floors)
    {
        f.addBuilding(id, name, address, zip, parcel, size, year, floors);
    }

    public void addCustomer(int id, String name, String address, int zip, int phone, String password)
    {
        f.addCustomer(id, name, address, zip, phone, password);
    }

    public ArrayList<Building> viewBuildings(int cID)
    {
        return f.viewBuildings(cID);
    }

    public Customer getCustomer(int cID)
    {
        return f.getCustomer(cID);
    }

    public void deleteBuilding(int bID)
    {
        f.deleteBuilding(bID);
    }

    private void deleteAllBuildings(int cID)
    {
        f.deleteAllBuildings(cID);
    }

    public void deleteCustomer(int cID)
    {
        deleteAllBuildings(cID);
        f.deleteCustomer(cID);
    }

    public ArrayList<Customer> viewCustomers()
    {
        return f.viewCustomers();
    }

    public void addFloorPlan(int bID, InputStream input)
    {
        f.addFloorPlan(bID, input);
    }

    public byte[] getFloorPlan(int bID)
    {
        return f.getFloorPlan(bID);
    }
    
    public void addComment(int bID, String column, String comment){
        f.addComment(bID, column, comment);
    }
    
    public void setStatus(int bID, int status){
        f.setStatus(bID, status);
    }
    
    public void addRoom(int bID, String rName, String rComment,String rRecommendation){
        f.addRoom(bID, rName, rComment, rRecommendation);
    }
}
