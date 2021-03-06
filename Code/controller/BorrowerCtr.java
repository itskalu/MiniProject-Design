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

    public int getBorrowersSize(){
        int size = BorrowerContainer.getInstance().getSize();
        return size;
    }
    public void createBorrower(String name, long phoneNum, String address, String postCode, String city){
        borrower = new Borrower(name, phoneNum, city, address, postCode);
        BorrowerContainer.getInstance().addBorrower(borrower);
    }

    public void deleteBorrower(Borrower b){       
        BorrowerContainer.getInstance().deleteBorrower(b);
        borrower = null;
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
