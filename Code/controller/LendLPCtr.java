package controller;

import java.util.*;
import model.*;

public class LendLPCtr
{
    BorrowerContainer borrowerContainer = BorrowerContainer.getInstance();
    CopyContainer copyContainer = CopyContainer.getInstance();
    
    Scanner src = new Scanner(System.in);
    
    public void Lend(){
        boolean borrowerFound = false;
        Borrower borrower = null; 
        LP lp = null;
        
        //     ENTER NAME OR PHONE NUMBER
        System.out.println("Enter name or phone number: ");
        while(!borrowerFound){
            String input = src.nextLine();
            
            //---checks if input is string or numbers
            boolean numeric = true;
            int inputInt=0;
            try {
                inputInt = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                numeric = false;
            }
            //--- depending wheter input is string or numbers -> chooses the right method
            if(numeric){
                if(!borrowerContainer.findBorrowerByPhoneNumber(inputInt)){
                    System.out.println("Entered phone number was not found, please try again");
                }else {
                   borrowerFound = true; 
                   borrower = borrowerContainer.getBorrower();
                }
            }else if(!borrowerContainer.findBorrowerByName(input)){
                System.out.println("Entered name was not found, please try again");
            }else {
                borrowerFound = true;
                borrower = borrowerContainer.getBorrower();
            }    
        }
        
        boolean lpFound = false;
        
        System.out.println("Enter title of LP: ");
        while(!lpFound){
            String lpTitle = src.nextLine();
            
            if(!copyContainer.FindLPByTitle(lpTitle)){ 
                System.out.println("Entered LP title was not found, please try again");         
            }else{
                lpFound = true;
                lp = copyContainer.getLP();
            }
        }
        
        System.out.println(borrower.getName());
        System.out.println(lp.getTitle());
        System.out.println(copyContainer.getNumOfCopies(lp));
        
        
        
        
        
        
    }
    
}
