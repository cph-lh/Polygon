package domain;

public class Customer {
    String Name;
    String Address;
    int phone;
    int ID;
    
    public Customer(String Name, String Address, int phone, int ID) {
        this.Name = Name;
        this.Address = Address;
        this.phone = phone;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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
