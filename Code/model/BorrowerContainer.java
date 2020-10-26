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
    
    public boolean findLenderByName(String borrowerName){
        boolean found = false;
        for(Borrower b : borrowers){
            if(b.getName().toLowerCase().equals(borrowerName.toLowerCase())){
                found = true;
            } 
        }
        return found;
    }
    
    public boolean findBorrowerByPhoneNumber(String phoneNumber){
        boolean found = false;
        for(Borrower b : borrowers){
            //if(b.getPhoneNum.equals())
        }
        return found;
    }
    
    public static BorrowerContainer getInstance(){
        return instance;
    }

    
}
