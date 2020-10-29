package tui;

import controller.*;
import model.*;

import java.util.*;

public class LendLPUI
{
    LendLPCtr lendLPCtr = new LendLPCtr();
    BorrowerCtr borrowerCtr = new BorrowerCtr();
    Scanner src = new Scanner(System.in);
    MainMenuUI mainMenuUI = new MainMenuUI();

    public void lendLPDialog(){
        Borrower b = null;
        Copy copy = null;
        

        System.out.println("######## LEND LP ########");
        
        //Searching for Borrower by its NAME
        if(borrowerCtr.getBorrowersSize()>0){
            System.out.println("Enter borrower's name: ");
            boolean borrowerFound = false;
            while(!borrowerFound){  
                String input = src.nextLine();
                b = lendLPCtr.findBorrowerByName(input);
                if(b!=null){
                    borrowerFound = true;
                }else{
                    System.out.println("Entered name was not found, please try again");
                }        
            }
        }else{
            System.out.println("No Borrowers were found, you need to add Borrower first");
            mainMenuUI.Start();
        }
        
        //Searching for Copy of LP by its TITLE
        if(lendLPCtr.getLPsSize()>0){   
            System.out.println("Enter title of LP: ");
            boolean copyFound = false;
            while(!copyFound){
                String input = src.nextLine();
                copy = lendLPCtr.findLPCopy(input);
                if(copy!=null && copy.getAvailability()){
                    copyFound = true;
                }else{
                    System.out.println("Entered LP title was not found or is not available, please try again");         
                }
            }
        }else{
            System.out.println("No LPs were found, you need to add LP first");
            mainMenuUI.Start();
        }
        System.out.println("###### BORROWER INFORMATIONS ######");
        System.out.println("Borrower: "+b.getName());
        System.out.println("Full Address: "+b.getFullAddress());
        
        System.out.println("\n######## LP INFORMATIONS ##########");
        LP lp = copy.getOriginalLP();
        System.out.println("LP Title: "+lp.getTitle());
        System.out.println("LP Artist: "+lp.getArtist());
        System.out.println("LP Publication date: "+lp.getPublicationDate());
        
        System.out.println("\n######## COPY INFORMATIONS ##########");
        System.out.println("Copy Serial number: "+copy.getSerialNum());
        System.out.println("Copy Price: "+copy.getPrice());
        
        //Registering loan
        boolean isDone=false;
        while(!isDone){
            System.out.println("Do you want to confirm loan? (yes/no)");
            String inputConfirm = src.nextLine();
            if(inputConfirm.equals("yes")){
                Random rndm = new Random();
                int randomID = rndm.nextInt(100);
                System.out.println("Enter approximate return date(dd/MM/yyyy): ");
                String returnDate = src.nextLine();
                Loan registeredLoan = lendLPCtr.registerLoan(randomID, returnDate);
                
                isDone = true;
                System.out.println("Loan successfully registered");
                mainMenuUI.Start();
            }else if(inputConfirm.equals("no")){
                System.out.println("Do you want to storno the loan? (yes/no)");
                String inputStorno = src.nextLine();
                if(inputStorno.equals("yes")){
                    isDone = true;
                    System.out.println("Bye then.");
                    mainMenuUI.Start();
                }else if(inputStorno.equals("no")){                 
                }
            }
        }      
    }
}
