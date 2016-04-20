package data;

import domain.Customer;
import domain.Building;
import java.io.InputStream;
import java.util.ArrayList;

public class Facade {

    BuildingDataMapper bdm = new BuildingDataMapper();
    CustomerDataMapper cdm = new CustomerDataMapper();
    PictureDataMapper pdm = new PictureDataMapper();
    CommentDataMapper comdm = new CommentDataMapper();
    RoomDataMapper rdm = new RoomDataMapper();
    ReportDataMapper repdm = new ReportDataMapper();

    public void addBuilding(int id, String name, String address, int zip, int parcel, int size, int year, int floors)
    {
        bdm.addBuilding(id, name, address, zip, parcel, size, year, floors);
    }

    public void addCustomer(int id, String name, String address, int zip, int phone, String password)
    {
        cdm.addCustomer(id, name, address, zip, phone, password);
    }

    public ArrayList<Building> viewBuildings(int cID)
    {
        return bdm.viewBuildings(cID);
    }

    public Customer getCustomer(int cID)
    {
        return cdm.getCustomer(cID);
    }

    public void deleteBuilding(int bID)
    {
        bdm.deleteBuilding(bID);
    }

    public void deleteAllBuildings(int cID)
    {
        bdm.deleteAllBuildings(cID);
    }

    public void deleteCustomer(int cID)
    {
        deleteAllBuildings(cID);
        cdm.deleteCustomer(cID);
    }

    public ArrayList<Customer> viewCustomers()
    {
        return cdm.viewCustomers();
    }

    public void addFloorPlan(int bID, InputStream input)
    {
        bdm.addFloorPlan(bID, input);
    }

    public InputStream getFloorPlan(int bID)
    {
        return bdm.getFloorPlan(bID);
    }
    
    public void addComment(int bID, String column, String comment){
        comdm.addComment(bID, column, comment);
    }
    
    public void setStatus(int bID, int status){
        bdm.setStatus(bID, status);
    }
    
    public void addRoom(int bID, String rName, String rComment,String rRecommendation){
        rdm.addRoom(bID, rName, rComment, rRecommendation);
    }
    
    public void addReportInfo(String rDate, int pID, String bResponsible, int bID){
        repdm.addReportInfo(rDate, pID, bResponsible, bID);
    }
}

