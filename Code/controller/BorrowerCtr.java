package controller;

import model.*;

import java.util.*;

public class BorrowerCtr
{
    
    Borrower borrower = null;
    
    public Borrower findBorrowerByName(String name){
        borrower = BorrowerContainer.getInstance().findBorrowerByName(name);
        return borrower;
    }

    public void createBorrower(String name, int phoneNum, String address, String postCode, String city){
        Borrower b = new Borrower(name, phoneNum, city, address, postCode);
        BorrowerContainer.getInstance().addBorrower(b);
    }

    public void deleteBorrower(Borrower b){       
        BorrowerContainer.getInstance().deleteBorrower(b);
    }

    public void updateName(String name){
        borrower.setName(name);
    }
    public void updatePhoneNum(int phoneNum){
        borrower.setPhoneNum(phoneNum);
    }
    public void updateFullAddress(String address, String city, String postalCode){
        borrower.setFullAddress(address, city, postalCode);
    }
}
