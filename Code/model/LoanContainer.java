package model;

import java.util.*;

public class LoanContainer
{
    private ArrayList <Loan> loans = new ArrayList<>();
    
    private static LoanContainer instance = new LoanContainer();
    
    public LoanContainer(){
    }
    
    public Loan registerLoan(int id, String returnDate, Copy c){
        String borrowDate = java.time.LocalDate.now().toString();
        Loan l = new Loan(id, returnDate, borrowDate, c);
        loans.add(l);
        return l;
    }
    
    
    public static LoanContainer getInstance(){
        return instance;
    }
    
    
}
