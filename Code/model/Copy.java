
package model;



public class Copy
{
    private String serialNumber;
    private String purchaseDate;
    private String price;
    private boolean available;
    private LP originalLP;
    
   
    public Copy(String serialNumber, String purchaseDate, String price, boolean available, LP originalLP)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.price = price;
        this.available = available;
        this.originalLP = originalLP;
        
    } 
    
    public void printAllInfo(){
        System.out.println(serialNumber+", "+purchaseDate+", "+
                            "\n"+price +", "+available);
    }

    public LP getOriginalLP(){
        return originalLP;
    }
      
    public String getSerialNum(){
        return serialNumber;
    }
    
    public String getPrice(){
        return price;
    }
    
    public boolean getAvailability(){
        return available;
    }
    public void setAvailability(boolean input){
        available = input;
    }
}
