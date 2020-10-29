package tui;

import controller.*;
import model.*;

import java.util.*;

public class AddLPUI
{
    AddLPCtr addLPCtr = new AddLPCtr();
    Scanner src = new Scanner(System.in);
    
    MainMenuUI mainMenuUI = new MainMenuUI();
    
    public void addLPDialog(){
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
        System.out.println("Enter Publication date(dd/MM/yyyy): ");
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
        System.out.println("Enter purchase date(dd/MM/yyyy): ");
        boolean possiblePurchaseDate = false; 
        String inputPurchaseDate = "";
        while(!possiblePurchaseDate){
            inputPurchaseDate= src.nextLine();
            if(addLPCtr.isDatePossible(inputPurchaseDate)){
                possiblePurchaseDate = true;
            }else System.out.println("Invalid date");
        }

        System.out.println("Enter price: ");
        int inputPrice = src.nextInt();
        newCopy = addLPCtr.addCopy(inputSerialNum, inputPurchaseDate, inputPrice);

        System.out.println("LP successfully added!");
        mainMenuUI.Start();
    }
}