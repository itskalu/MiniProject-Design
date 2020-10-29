package model;
import java.util.*;

public class Borrower
{
    private String name;
    private int phone;
    private String city; 
    private String address;
    private String postalCode;
    private ArrayList <Loan> loans;

    public Borrower(String name, int phone, String city, String address, String postalCode)
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
    public int getPhoneNum(){
        return phone;
    }
    public void setPhoneNum(int phoneNum){
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
