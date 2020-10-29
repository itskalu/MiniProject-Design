package tui;

import controller.*;
import model.*;

import java.util.*;

public class ManageBorrowerUI
{
    Scanner src = new Scanner(System.in);
    BorrowerCtr borrowerCtr = new BorrowerCtr();

    private Borrower borrower = null;

    public void manageBorrowersDialog(){
        boolean isChoosing=true;
        
        System.out.println("#### Manage Borrowers Menu ####");
        System.out.println("[1] - Create borrower");
        System.out.println("[2] - Delete borrower");
        System.out.println("[3] - Update borrower");
        System.out.println("[0] - Go back to main menu");
        
        do{
            String input = src.nextLine();
            
            switch(input){
                case "1": 
                    createBorrower();
                    isChoosing = false;
                    break;
                case "2": 
                    deleteBorrower();
                    isChoosing = false;
                    break;
                case "3": 
                    updateBorrower();
                    isChoosing = false;
                    break;
                case "0": 
                    MainMenuUI mainMenu = new MainMenuUI();
                    mainMenu.Start(); 
                    isChoosing = false;
                    break;      
                default:
                    System.out.println("Please use numbers to select actions");
            }
            
        }while(isChoosing); 

    }


    private void createBorrower(){
        System.out.println("##### CREATE NEW BORROWER #####");
        System.out.println("Enter name: ");
        String inputName = src.nextLine();
        System.out.println("Enter phone number: ");
        int inputPhoneNum = Integer.parseInt(src.nextLine());
        System.out.println("Enter address: ");
        String inputAddress = src.nextLine();
        System.out.println("Enter city: ");
        String inputCity = src.nextLine();
        System.out.println("Enter postal code: ");
        String inputPostCode = src.nextLine();

        borrowerCtr.createBorrower(inputName, inputPhoneNum, inputAddress, inputPostCode, inputCity);
        System.out.println("New borrower successfuly created!");
        System.out.println(BorrowerContainer.getInstance().getSize());
        manageBorrowersDialog();
    }

    private void deleteBorrower(){
        System.out.println("##### DELETE BORROWER #####");
        System.out.println("Enter name to find the borrower: ");
        boolean borrowerFound = false;
        borrower = null;
        while(!borrowerFound){  
            String inputName = src.nextLine();
            borrower = borrowerCtr.findBorrowerByName(inputName);
            if(borrower!=null){
                borrowerFound = true;
            }else{
                System.out.println("Entered name was not found, please try again");
            }  
        }
        printAllInfoAboutBorrower();

        System.out.println("Do you really want to delete this Borrower? (yes/no)");
        String inputChoice = src.nextLine();
        if(inputChoice.equals("yes")){
            borrowerCtr.deleteBorrower(borrower);
            borrower = null;
        }else if(inputChoice.equals("no")){
            System.out.println("Bye then");
            borrower = null;
            manageBorrowersDialog();
        }else System.out.println("Invalid choice");
        System.out.println(BorrowerContainer.getInstance().getSize());
        manageBorrowersDialog();
    }
   
    private void updateBorrower(){
        if(borrower==null){
        System.out.println("##### UPDATE BORROWER #####");
        System.out.println("Enter name to find the borrower: ");
        boolean borrowerFound = false;
        while(!borrowerFound){    
                String inputName = src.nextLine();
                borrower = borrowerCtr.findBorrowerByName(inputName);
                if(borrower!=null){
                    borrowerFound = true;
                }else{
                    System.out.println("Entered name was not found, please try again");
                }
            }
        }
        printAllInfoAboutBorrower();
        System.out.println("[0] Go back");
        System.out.println("What information do you want to update?");
        boolean isChoosing = true; 
        do{
            String inputChoice = src.nextLine();
            switch(inputChoice){
                case "1":
                    updateName();
                    isChoosing = false;
                    break;
                case "2":
                    updatePhoneNum();
                    isChoosing = false;
                    break;
                case "3":
                    updateFullAddress();
                    isChoosing = false;
                    break;
                case "0":
                    manageBorrowersDialog();
                    isChoosing = false;
                    borrower = null;
                    break;
                default: 
                    System.out.println("Please use numbers to select actions");
            }
        }while(isChoosing);
    }
    public void updateName(){
        System.out.println("Enter new name: ");
        String inputName = src.nextLine();

        borrowerCtr.updateName(inputName);
        updateBorrower();
    }

    public void updatePhoneNum(){
        System.out.println("Enter new phone number: ");
        int inputPhoneNumber = src.nextInt();

        borrowerCtr.updatePhoneNum(inputPhoneNumber);
        updateBorrower();
    }

    public void updateFullAddress(){
        System.out.println("Enter new address: ");
        String inputAddress = src.nextLine();
        System.out.println("Enter new city: ");
        String inputCity = src.nextLine();
        System.out.println("Enter new postal code: ");
        String inputPostCode = src.nextLine();
        
        borrowerCtr.updateFullAddress(inputAddress, inputCity, inputPostCode); 
        updateBorrower();    
    }

    public void printAllInfoAboutBorrower(){
        System.out.println("Informations about found borrower: ");
        System.out.println("[1] Borrower's name: "+borrower.getName());
        System.out.println("[2] Borrower's phone number: "+borrower.getPhoneNum());
        System.out.println("[3] Borrower's full address: "+borrower.getFullAddress());
        
    }
    
}
