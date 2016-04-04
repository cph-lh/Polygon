package domain;

import java.util.ArrayList;

public class Facade
{
    DM_Building bdm = new DM_Building();
    DM_Customer cdm = new DM_Customer();
    
    public void addBuilding(int id, String name, String address, int zip, int parcel, int size)
    {
        bdm.addBuilding(id, name, address, zip, parcel, size);
    }
    
    public void addCustomer(int id, String name, String address, int zip, int phone)
    {
        cdm.addCustomer(id, name, address, zip, phone, address);
    }
    
    public ArrayList<Building> viewBuilding(int cID){
       return bdm.buildings(cID);
    }
    
    public Customer getCustomer(int cID)
    {
        return cdm.getCustomer(cID);
    }
}
