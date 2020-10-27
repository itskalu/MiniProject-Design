package controller;

import java.util.*;
import java.util.Date; 

import model.*;
import tui.*;

public class LendLPCtr
{
    BorrowerContainer borrowerContainer = BorrowerContainer.getInstance();
    CopyContainer copyContainer = CopyContainer.getInstance();
    
    BorrowerCtr borrowerCtr = new BorrowerCtr();   
    LPCtr lpCtr = new LPCtr();
    
    public Borrower FindBorrowerByName(String borrowerName){
        Borrower b = borrowerCtr.FindBorrowerByName(borrowerName);
        return b;
    }
    
    public LP FindLP(String title){
        LP lp = lpCtr.FindLP(title);
        return lp;
    }
    
    /*public void Lend(){
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
        
        // ENTER TITLE OF LP
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
        
        
        System.out.println("Borrower name: "+borrower.getName().toUpperCase());
        System.out.println("Borrower's phone number: "+borrower.getPhoneNum());
        System.out.println("\nLP Title: "+lp.getTitle());
        System.out.println("LP Artist: "+lp.getArtist());
        System.out.println("Number of copies: "+copyContainer.getNumOfCopies(lp));
        System.out.println("\nDo you want to confirm loan? (yes/no)");
        String inputConfirmLoan = src.nextLine();
        
        if(inputConfirmLoan.equals("yes")){
            Loan loan = new Loan("1", "30-10-2020", java.time.LocalDate.now().toString(), copyContainer.getCopy(lp));
            
            System.out.println(loan.getLoanCopyLPArtist()+" "+loan.getID() );
        }
        
        MainMenuUI mainMenuUI = new MainMenuUI();
        mainMenuUI.Start();
        */
        
        
    }
    

