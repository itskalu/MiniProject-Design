package controller;

import java.text.*;

import model.*;

public class AddLPCtr
{
    LP lp = null;

   public LP addLP(String title, String artist, String barcode, String publicationDate, String description){
        lp = new LP(title, artist, barcode, publicationDate, description);
        LPContainer.getInstance().addLPToList(lp);
        return lp;
   }

   public Copy addCopy(String serialNum, String purchaseDate, int price){
        Copy c = new Copy(serialNum, purchaseDate, price, true, lp);
        CopyContainer.getInstance().addCopy(c);
        return c;
   }

    public boolean isDatePossible(String dateToValidate){
        boolean possible = false;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try {
            format.parse(dateToValidate);   
            possible = true;  
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return possible;
    } 
}
