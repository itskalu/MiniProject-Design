package tui;

import controller.*;
import testin.*;
import model.*;

import java.util.*;


public class MainMenuUI
{
    Scanner src = new Scanner(System.in); 
    TryMe tryMe = new TryMe();
    
    LendLPCtr lendLPCtr = new LendLPCtr();
    AddLPCtr addLPCtr = new AddLPCtr();
    CopyCtr copyCtr = new CopyCtr();

    ManageBorrowerUI manageBorrowersUI = new ManageBorrowerUI(); 

    
    public void Start(){ 
        boolean isChoosing=true;
        
        System.out.println("####### Main menu ######");
        System.out.println("[1] - Lend LP");
        System.out.println("[2] - Add LP");
        System.out.println("[3] - Manage Borrowers");
        System.out.println("[9] - Generate testdata");
        System.out.println("[0] - Exit");
        
        do{
            String input = src.nextLine();
            
            switch(input){
                case "1": 
                    lendLPDialog();
                    isChoosing = false;
                    break;
                case "2": 
                    addLPDialog();
                    isChoosing = false;
                    break;
                case "3": 
                    manageBorrowersUI.manageBorrowersDialog();
                    isChoosing = false;
                    break;

                case "9": 
                    tryMe.generateTestDate();
                    break;
                case "0": 
                    System.out.println("Exiting program....");
                    isChoosing = false;
                    break;      
                default:
                    System.out.println("Please use numbers to select actions");
            }
            
        }while(isChoosing);        
    }
    
    private void lendLPDialog(){
        Borrower b = null;
        Copy copy = null;
        Loan registeredLoan = null;

        System.out.println("######## LEND LP ########");
        
        //Searching for Borrower by its NAME
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
        
        //Searching for Copy of LP by its TITLE
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
        System.out.println("Copy Price "+copy.getPrice());
        
        //Registering loan
        boolean isDone=false;
        while(!isDone){
            System.out.println("Do you want to confirm loan? (yes/no)");
            String inputConfirm = src.nextLine();
            if(inputConfirm.equals("yes")){
                Random rndm = new Random();
                int randomID = rndm.nextInt(100);
                System.out.println("Enter approximate return date: ");
                String returnDate = src.nextLine();
                registeredLoan = lendLPCtr.registerLoan(randomID, returnDate);
                
                isDone = true;
                System.out.println("Loan successfully registered");
                Start();
            }else if(inputConfirm.equals("no")){
                System.out.println("Do you want to storno the loan? (yes/no)");
                String inputStorno = src.nextLine();
                if(inputStorno.equals("yes")){
                    isDone = true;
                    System.out.println("Bye then.");
                    Start();
                }else if(inputStorno.equals("no")){
                }
            }
    }
      
    }
    
    private void addLPDialog(){
        Copy newCopy = null;

        System.out.println("########## ADD LP ##########");
        System.out.println("Please enter informations about LP");

        System.out.println("Enter Title: ");
        String inputTitle = src.nextLine();

        System.out.println("Enter Artist: ");  
        String inputArtist = src.nextLine();

        System.out.println("Enter Barcode: ");
        String inputBarcode = src.nextLine();

        //Check if entered date is POSSIBLE
        System.out.println("Enter Publication date: ");
        boolean possiblePublicationDate = false; 
        String inputPublicationDate = "";
        while(!possiblePublicationDate){
            inputPublicationDate = src.nextLine(); 
            if(addLPCtr.isDatePossible(inputPublicationDate)){
                possiblePublicationDate = true;
            }else System.out.println("Invalid date");
        }

        System.out.println("Enter Description: ");
        String inputDescription = src.nextLine();

        addLPCtr.addLP(inputTitle, inputArtist, inputBarcode, inputPublicationDate, inputDescription);

        System.out.println("Please enter informations about COPY");
        System.out.println("Enter serial number: ");
        String inputSerialNum = src.nextLine();

        //Checks if entered date is POSSIBLE
        System.out.println("Enter purchase date(dd/mm/yyyy): ");
        boolean possiblePurchaseDate = false; 
        String inputPurchaseDate = "";
        while(!possiblePurchaseDate){
            inputPurchaseDate= src.nextLine();
            if(addLPCtr.isDatePossible(inputPurchaseDate)){
                possiblePurchaseDate = true;
            }else System.out.println("Invalid date");
        }

        System.out.println("Enter price: ");
        String inputPrice = src.nextLine();
        newCopy = addLPCtr.addCopy(inputSerialNum, inputPurchaseDate, inputPrice);

        System.out.println("LP successfully added!");
        newCopy.printAllInfo();

    }
}
