package domain;

public class Facade
{
    DM_Building bdm = new DM_Building();
    DM_Customer cdm = new DM_Customer();
    
    public void addBuilding(int id, String name, String address, String city, int zip, int parcel, int size)
    {
        bdm.addBuilding(id, name, address, city, zip, parcel, size);
    }
    
    public void addCustomer(int id, String name, String address, int zip, String city, int phone)
    {
        cdm.addCustomer(id, name, address, zip, city, phone, address);
    }
}
