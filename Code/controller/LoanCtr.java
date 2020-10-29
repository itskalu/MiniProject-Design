package controller;

import model.*;

import java.util.*;

public class LoanCtr
{
    public Loan registerLoan(int id, String returnDate, Copy c){
        Loan l = LoanContainer.getInstance().registerLoan(id, returnDate, c);
        c.setAvailability(false);
        
        return l;
    }

}
