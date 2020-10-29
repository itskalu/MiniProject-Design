package model;

public class Copy
{
    private String serialNumber;
    private String purchaseDate;
    private int price;
    private boolean available;
    private LP originalLP;
    
   
    public Copy(String serialNumber, String purchaseDate, int price, boolean available, LP originalLP)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.price = price;
        this.available = available;
        this.originalLP = originalLP;
        
    } 
    
    public LP getOriginalLP(){
        return originalLP;
    }
      
    public String getSerialNum(){
        return serialNumber;
    }
    
    public int getPrice(){
        return price;
    }
    
    public boolean getAvailability(){
        return available;
    }
    public void setAvailability(boolean input){
        available = input;
    }
}
