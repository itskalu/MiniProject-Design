package model;



public class Copy
{
    String serialNumber;
    String purchaseDate;
    String price;
    boolean available;
    LP originalLP;
    
   
    public Copy(String serialNumber, String purchaseDate, String price, boolean available, LP originalLP)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.price = price;
        this.available = available;
        this.originalLP = originalLP;
        
    }

    
    
}
