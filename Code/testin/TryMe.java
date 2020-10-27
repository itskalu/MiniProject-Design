package testin;

import controller.*;
import tui.*;
import model.*;

public class TryMe
{
   public void Try(){
       //createing people
       Borrower bob = new Borrower("Bob", 45781245, "Aalborg", "Somewhere 5", 9000);
       Borrower joe = new Borrower("Joe", 12456558, "Aalborg", "Somewhere 1", 9100);
       Borrower jane = new Borrower("Jane", 32459865, "Aalborg", "Somewhere 2", 9000);
       Borrower mitch = new Borrower("Mitch", 44935277, "Aalborg", "Somewhere 7", 9000);
       
       //assigning people into an arraylist
       BorrowerContainer.getInstance().addBorrower(bob);
       BorrowerContainer.getInstance().addBorrower(joe);
       BorrowerContainer.getInstance().addBorrower(jane);
       BorrowerContainer.getInstance().addBorrower(mitch);
       
       //creating LPs
       LP lp1 = new LP("1234654", "LPTitle1", "LPArtist1", "2000", "LPDescription1");
       LP lp2 = new LP("5456415", "LPTitle2", "LPArtist2", "1990", "LPDescription2");
       LP lp3 = new LP("1234134", "LPTitle3", "LPArtist3", "1995", "LPDescription3");
       LP lp4 = new LP("8798944", "LPTitle4", "LPArtist4", "2005", "LPDescription4");
      
       //creating copies of LPs
       Copy lp1Copy1 = new Copy("15", "26-10-2020", "300", true, lp1);
       Copy lp1Copy2 = new Copy("7", "25-9-2020", "300", true, lp1);
       Copy lp1Copy3 = new Copy("7", "24-4-2020", "300", true, lp1);
       Copy lp1Copy4 = new Copy("7", "21-5-2020", "300", true, lp1);
       Copy lp2Copy1 = new Copy("22", "20-9-2020", "150", true, lp2);
       Copy lp2Copy2 = new Copy("23", "21-9-2020", "150", true, lp2);
       
       //Assigning copies into an arrayList of copies
       CopyContainer.getInstance().addCopy(lp1Copy1);
       CopyContainer.getInstance().addCopy(lp1Copy2);
       CopyContainer.getInstance().addCopy(lp1Copy3);
       CopyContainer.getInstance().addCopy(lp1Copy4);
       CopyContainer.getInstance().addCopy(lp2Copy1);
       CopyContainer.getInstance().addCopy(lp2Copy2);
       

    }
}
