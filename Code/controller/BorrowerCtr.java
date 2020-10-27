package controller;

import model.*;

import java.util.*;

public class BorrowerCtr
{
    
    Borrower b = null;
    
    public Borrower FindBorrowerByName(String name){
        b = BorrowerContainer.getInstance().findBorrowerByName(name);
        return b;
    }
}
