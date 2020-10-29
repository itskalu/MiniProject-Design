package model;
import java.util.*;

public class Borrower
{
    private String name;
    private long phone;
    private String city; 
    private String address;
    private String postalCode;
    private ArrayList <Loan> loans;

    public Borrower(String name, long phone, String city, String address, String postalCode)
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
    public void setName(String name){
        this.name = name;
    }
    public long getPhoneNum(){
        return phone;
    }
    public void setPhoneNum(long phoneNum){
        this.phone = phoneNum;
    }
    public String getFullAddress(){
        String fullAddress = address+", "+city+", "+postalCode;
        return fullAddress;
    }
    public void setFullAddress(String address, String city, String postalCode){
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
    }

    public ArrayList getLoans(){
        return loans;
    }
}
