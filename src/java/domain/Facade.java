package domain;

public class Facade
{
    DM_Building bdm = new DM_Building();
    
    public void addBuilding(int id, String name, String address, String city, int zip, int parcel, int size)
    {
        bdm.addBuilding(id, name, address, city, zip, parcel, size);
    }
}
