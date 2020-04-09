package Lesson6.Products;

public class Suppliers {
    private long ID;
    private String CompanyName;
    private String ContactName;
    private String ContactTitle;
    private String Address;
    private String City;
    private String Region;
    private int PostalCode;
    private String Phone;
    private String Fax;
    private String HomePage;

    public Suppliers(long ID, String companyName, String contactName, String contactTitle, String address, String city,
                     String region, int postalCode, String phone, String fax, String homePage) {
        this.ID = ID;
        CompanyName = companyName;
        ContactName = contactName;
        ContactTitle = contactTitle;
        Address = address;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Phone = phone;
        Fax = fax;
        HomePage = homePage;
    }

    public long getID() {
        return ID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getRegion() {
        return Region;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public String getPhone() {
        return Phone;
    }

    public String getFax() {
        return Fax;
    }

    public String getHomePage() {
        return HomePage;
    }
}
