package model;

import java.util.*;

public class LoanContainer
{
    private ArrayList <Loan> loans = new ArrayList<>();
    
    private static LoanContainer instance = new LoanContainer();
    
    public LoanContainer()
    {
    }
    
    public static LoanContainer getInstance(){
        return instance;
    }
    
    
    
}
