package pax4;
// Vendor
public class Vendor {
    private String companyName;
    private String address;
    private String representativeName;
    private String phoneNumber;

    // Constructor 1
    public Vendor(String companyName, String address, String representativeName, String phoneNumber) {
        this.companyName = companyName;
        this.address = address;
        this.representativeName = representativeName;
        this.phoneNumber = phoneNumber;
    }

    // Constructor 2
    public Vendor() {
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString method
    @Override
    public String toString() {
        return "Vendor [Company Name: " + companyName + ", Address: " + address +
                ", Representative: " + representativeName + ", Phone: " + phoneNumber + "]";
    }
}

