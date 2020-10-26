package model;
import java.util.*;

public class Lender
{
    String name;
    String phone;
    String city; 
    String address;
    String postalCode;
    ArrayList <Loan> loans;

    public Lender(String name, String phone, String city, String address, String postalCode)
    {
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
        loans = new ArrayList<>();

    }

    public String getName(){

        return name;
    }

}
