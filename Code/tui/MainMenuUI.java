package tui;

import testin.*;

import java.util.Scanner;


public class MainMenuUI
{
    Scanner src = new Scanner(System.in); 
    TryMe tryMe = new TryMe();
    
    ManageBorrowerUI manageBorrowersUI = new ManageBorrowerUI(); 

    public static void main(String[] args){
        MainMenuUI obj = new MainMenuUI();
        obj.Start();
    }

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
                    LendLPUI lendLPUI = new LendLPUI();
                    lendLPUI.lendLPDialog();
                    isChoosing = false;
                    break;
                case "2": 
                    AddLPUI addLPUI = new AddLPUI();
                    addLPUI.addLPDialog();
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
}
