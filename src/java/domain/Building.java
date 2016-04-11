package domain;

public class Building
{
    int cID, bID, zip, parcel, size, floors, year;
    String name, address, city;

    public Building(int cID, String name, String address, int zip, int parcel, int size)
    {
        this.cID = cID;
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.parcel = parcel;
        this.size = size;
    }
    
    public Building(int cID, int bID, String name, String address, int zip, int parcel, int size, int floors, int year, String city)
    {
        this.bID = bID;
        this.cID = cID;
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.parcel = parcel;
        this.size = size;
        this.floors = floors;
        this.year = year;
    }

    public int getcID()
    {
        return cID;
    }

    public void setcID(int cID)
    {
        this.cID = cID;
    }

    public int getbID()
    {
        return bID;
    }

    public void setbID(int bID)
    {
        this.bID = bID;
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

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}
