package domain;

public class Building
{
    String name;
    String address;
    int parcel;
    int floors;
    int size;
    int status;

    public Building(String name, String address, int parcel, int floors, int size, int status)
    {
        this.name = name;
        this.address = address;
        this.parcel = parcel;
        this.floors = floors;
        this.size = size;
        this.status = status;
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
