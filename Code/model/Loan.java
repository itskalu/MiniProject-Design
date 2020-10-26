package model;



public class Loan
{
    String id;
    String returnDate;
    String borrowDate;
    Copy loanCopy;
    
    public Loan(String id, String returnDate, String borrowDate, Copy loanCopy)
    {
       this.id = id;
       this.returnDate = returnDate;
       this.borrowDate = borrowDate;
       this.loanCopy = loanCopy;
       
    }

   
}
