package model;
import java.util.*;

public class Borrower
{
    private String name;
    private int phone;
    private String city; 
    private String address;
    private int postalCode;
    private ArrayList <Loan> loans;

    public Borrower(String name, int phone, String city, String address, int postalCode)
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
    
    public int getPhoneNum(){
        return phone;
    }

}
