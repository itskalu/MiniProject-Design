package controller;

import java.util.*;
import java.util.Date;

import model.*;
import tui.*;

public class LendLPCtr
{
    private Copy c;
    private Borrower b;
    
    BorrowerContainer borrowerContainer = BorrowerContainer.getInstance();
    CopyContainer copyContainer = CopyContainer.getInstance();
    
    BorrowerCtr borrowerCtr = new BorrowerCtr();   
    CopyCtr copyCtr = new CopyCtr();
    
    public Borrower findBorrowerByName(String borrowerName){
        b = borrowerCtr.findBorrowerByName(borrowerName);
        return b;
    }
    
    public Copy findLPCopy(String lpTitle){
        c = copyCtr.findLPCopy(lpTitle);
        return c;
    }      
    
    public Loan registerLoan(int id, String returnDate){
        Loan l = LoanContainer.getInstance().registerLoan(id, returnDate, c);
        b.getLoans().add(l);
        return l;
    }

    public int getLPsSize(){
        int size = LPContainer.getInstance().getSize();
        return size;
    }
}
    

