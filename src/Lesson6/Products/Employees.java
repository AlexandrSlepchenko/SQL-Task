package Lesson6.Products;

import java.util.Date;

public class Employees {
    private long ID;
    private String LastName;
    private String FirstName;
    private String Title;
    private String TitleOfCourtesy;
    private Date BirthDate;
    private Date HireDate;
    private String Address;
    private String City;
    private String Region;
    private int PostalCode;
    private String Country;
    private String HomePhone;
    private String Extension;
    private String Photo;
    private String Notes;
    private String ReportsTo;

    public Employees(long ID, String lastName, String firstName, String title, String titleOfCourtesy, Date birthDate,
                     Date hireDate, String address, String city, String region, int postalCode, String country,
                     String homePhone, String extension, String photo, String notes, String reportsTo) {
        this.ID = ID;
        LastName = lastName;
        FirstName = firstName;
        Title = title;
        TitleOfCourtesy = titleOfCourtesy;
        BirthDate = birthDate;
        HireDate = hireDate;
        Address = address;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        HomePhone = homePhone;
        Extension = extension;
        Photo = photo;
        Notes = notes;
        ReportsTo = reportsTo;
    }

    public long getID() {
        return ID;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getTitle() {
        return Title;
    }

    public String getTitleOfCourtesy() {
        return TitleOfCourtesy;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public String getAdress() {
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

    public String getCountry() {
        return Country;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public String getExtension() {
        return Extension;
    }

    public String getPhoto() {
        return Photo;
    }

    public String getNotes() {
        return Notes;
    }

    public String getReportsTo() {
        return ReportsTo;
    }
}
