public class listNode {
    private String name;
    private String address;
    private String city;
    private String phoneNo;

    public listNode(String name, String address, String city, String phoneNo) { // Constructor
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNo = phoneNo;
    }

    public String getName() { // Getter
        return name;
    }

    public void setName(String newName) { // Setter
        this.name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getPhoneNumber() {
        return phoneNo;
    }

    public void setPhoneNumber(String newphoneNo) {
        this.phoneNo = newphoneNo;
    }

    @Override // Override of toString method to return a formatted string representation of
              // the node's data.
    public String toString() {
        return "List Node :" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNo + '\'';
    }
}