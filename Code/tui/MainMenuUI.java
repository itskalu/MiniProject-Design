package tui;

import controller.*;
import testin.*;
import java.util.*;


public class MainMenuUI
{
    Scanner src = new Scanner(System.in); 
    LendController lendLP = new LendController();
    TryMe tryMe = new TryMe();
    
    void Start(){ 
        boolean isChoosing=true;
        
        System.out.println("####### Main menu ######");
        System.out.println("[1] - Lend LP");
        System.out.println("[2] - Add LP");
        System.out.println("[3] - Manage Lender");
        System.out.println("[4] - Return LP");
        System.out.println("[5] - Update LP");
        System.out.println("[9] - Generate testdata");
        System.out.println("[0] - Exit");
        
        do{
            String input = src.nextLine();
            
            switch(input){
                case "1": 
                    lendLP.Lend();
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
}
