package model;

import java.util.*;


public class BorrowerContainer
{
    private ArrayList <Borrower> borrowers = new ArrayList<>();
    
    private static BorrowerContainer instance = new BorrowerContainer();
    
   
    public void addBorrower(Borrower b){
        borrowers.add(b);
    }
    
    public int getSize(){
        return borrowers.size();
    }
    
    Borrower borrower = null;
    
    public Borrower findBorrowerByName(String borrowerName){
        Borrower foundBorrower = null;
        boolean found = false;
        for(Borrower b : borrowers){
            if(b.getName().toLowerCase().equals(borrowerName.toLowerCase())){
                found = true;
                borrower = b;
            } 
        }
        return borrower;
    }
    
    public boolean findBorrowerByPhoneNumber(int phoneNumber){
        boolean found = false;
        for(Borrower b : borrowers){
            if(b.getPhoneNum()==phoneNumber){
               found=true;
               borrower = b;
            }
        }
        return found;
    }
    
    public Borrower getBorrower(){
        return borrower;
    }
    
    public static BorrowerContainer getInstance(){
        return instance;
    }

    
}
