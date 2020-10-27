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

    
    public void Start(){ 
        boolean isChoosing=true;
        
        System.out.println("####### Main menu ######");
        System.out.println("[1] - Lend LP");
        System.out.println("[2] - Add LP");
        System.out.println("[3] - Update LP");
        System.out.println("[4] - Return LP");
        System.out.println("[5] - Manage Borrower");
        System.out.println("[9] - Generate testdata");
        System.out.println("[0] - Exit");
        
        do{
            String input = src.nextLine();
            
            switch(input){
                case "1": 
                    LendLPDialog();
                    isChoosing = false;
                    break;
                case "2": 
                    System.out.println("2");
                    isChoosing = false;
                    break;
                case "3": 
                    System.out.println("3");
                    isChoosing = false;
                    break;
                case "4": 
                    System.out.println("4");
                    isChoosing = false;
                    break; 
                case "9": 
                    tryMe.Try();
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
    
    private void LendLPDialog(){
        Borrower b = null;
        Copy copy = null;
        
        LendLPCtr lendLPCtr = new LendLPCtr();
        System.out.println("######## LEND LP ########");
        System.out.println("Enter name or phone number: ");
        boolean borrowerFound = false;
        while(!borrowerFound){  
            String input = src.nextLine();
            b = lendLPCtr.FindBorrowerByName(input);
            if(b!=null){
                borrowerFound = true;
            }else{
                System.out.println("Entered name was not found, please try again");
            }        
        }
        
        System.out.println("Enter title of LP: ");
        boolean copyFound = false;
        while(!copyFound){
            String input = src.nextLine();
            copy = lendLPCtr.FindLPCopy(input);
            if(copy!=null){
                copyFound = true;
            }else{
                System.out.println("Entered LP title was not found, please try again");         
            }
        }
        
        System.out.println("Borrower: "+b.getName());
        LP lp = copy.getOriginalLP();
        System.out.println("LP Title: "+lp.getTitle());
        System.out.println("Number of available copies: "+CopyContainer.getInstance().getNumOfCopies(lp));
        System.out.println("Available Copies: ");
        
        
         
        
    }
}
