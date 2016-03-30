package domain;

public class Customer {
    String name;
    String address;
    int phone;
    int ID;
    
    public Customer(String Name, String Address, int phone, int ID) {
        this.name = Name;
        this.address = Address;
        this.phone = phone;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
