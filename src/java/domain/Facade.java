package domain;

public class Facade
{
    DM_Building bdm = new DM_Building();
    
    public void addBuilding(int id, String name, String address, int zip, String city, int parcel, int size)
    {
        bdm.addBuilding(id, name, address, zip, city, parcel, size);
    }
}
