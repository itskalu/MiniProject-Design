package model;

import java.text.SimpleDateFormat;  
import java.util.*;

public class Loan
{
    private int id;
    private String returnDate;
    private String borrowDate;
    private String agreedDate;
    private Copy loanCopy;
    
    public Loan(int id, String returnDate, String borrowDate, Copy loanCopy)
    {
       this.id = id;
       this.returnDate = returnDate;
       this.borrowDate = borrowDate;
       this.loanCopy = loanCopy;
       
    }
}
