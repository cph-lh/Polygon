package domain;

public class Building
{
    int cID;
    String name;
    String address;
    String city;
    int zip;
    int parcel;   
    int size;
    int floors;
    int status;

    public Building(int cID, String name, String address, int zip, String city, int parcel, int size, int floors, int status)
    {
        this.cID = cID;
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.parcel = parcel;
        this.size = size;
        this.floors = floors;
        this.status = status;
    }

    public int getcID()
    {
        return cID;
    }

    public void setcID(int cID)
    {
        this.cID = cID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getParcel()
    {
        return parcel;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public int getZip()
    {
        return zip;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }

    public void setParcel(int parcel)
    {
        this.parcel = parcel;
    }

    public int getFloors()
    {
        return floors;
    }

    public void setFloors(int floors)
    {
        this.floors = floors;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }
}
