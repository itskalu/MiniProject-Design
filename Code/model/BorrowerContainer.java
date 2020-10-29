package model;

import java.util.*;


public class BorrowerContainer
{
    private ArrayList <Borrower> borrowers = new ArrayList<>();
    
    private static BorrowerContainer instance = new BorrowerContainer();
    
   
    public void addBorrower(Borrower b){
        borrowers.add(b);
    }
    
    public void deleteBorrower(Borrower b){
        borrowers.remove(b);
        b = null;
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

    public int getSize(){
        return borrowers.size();
    }

    public Borrower getBorrower(){
        return borrower;
    }
    
    public static BorrowerContainer getInstance(){
        return instance;
    }

    
}
