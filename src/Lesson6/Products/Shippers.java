package Lesson6.Products;

public class Shippers {
    private long ID;
    private String CompanyName;
    private String Phone;

    public Shippers(long ID, String companyName, String phone) {
        this.ID = ID;
        CompanyName = companyName;
        Phone = phone;
    }

    public long getID() {
        return ID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getPhone() {
        return Phone;
    }
}