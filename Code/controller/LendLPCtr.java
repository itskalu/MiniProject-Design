package controller;

import java.util.*;
import model.*;

public class LendLPCtr
{
    BorrowerContainer borrowerContainer = BorrowerContainer.getInstance();
    
    Scanner src = new Scanner(System.in);
    
    public void Lend(){
        System.out.println("Enter name or phone number: ");
        String lenderName = src.nextLine();
        if(!borrowerContainer.findLenderByName(lenderName)){
            System.out.println("Sorry, You are not in the system, try again please");
        }
        
        System.out.println("Enter title of LP");
        String lpName = src.nextLine();
        
        
    }
    
}
