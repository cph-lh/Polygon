package domain;

import java.util.ArrayList;

public class Facade
{
    BuildingDataMapper bdm = new BuildingDataMapper();
    CustomerDataMapper cdm = new CustomerDataMapper();
    
    public void addBuilding(int id, String name, String address, int zip, int parcel, int size)
    {
        bdm.addBuilding(id, name, address, zip, parcel, size);
    }
    
    public void addCustomer(int id, String name, String address, int zip, int phone, String password)
    {
        cdm.addCustomer(id, name, address, zip, phone, password);
    }
    
    public ArrayList<Building> viewBuildings(int cID){
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
    
    private void deleteAllBuildings(int cID)
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
    
}
