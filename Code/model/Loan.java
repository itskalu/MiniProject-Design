package model;



public class Loan
{
    private String id;
    private String returnDate;
    private String borrowDate;
    private Copy loanCopy;
    
    public Loan(String id, String returnDate, String borrowDate, Copy loanCopy)
    {
       this.id = id;
       this.returnDate = returnDate;
       this.borrowDate = borrowDate;
       this.loanCopy = loanCopy;
       
    }

    public String getID(){
        return id;
    }
    public String getLoanCopyLPArtist(){
        return loanCopy.getOriginalLP().getArtist();
    }
}
