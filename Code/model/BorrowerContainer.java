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
    }

    
    public Borrower findBorrowerByName(String borrowerName){
       // boolean found = false;
       Borrower borrower = null;
        for(Borrower b : borrowers){
            if(b.getName().toLowerCase().equals(borrowerName.toLowerCase())){
                //found = true;
                borrower = b;
            } 
        }
        return borrower;
    }

    public int getSize(){
        return borrowers.size();
    }

    public static BorrowerContainer getInstance(){
        return instance;
    }

    
}
