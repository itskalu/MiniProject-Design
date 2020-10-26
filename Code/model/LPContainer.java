package model;

import java.util.*;

public class LPContainer
{
    private ArrayList <LP> LPs = new ArrayList<>();
    
    private static LPContainer instance = new LPContainer();
    
    private LPContainer(){
    }
    
    public boolean findLPByTitle(String lpTitle){
        boolean found = false;
        
        return found;
    }
    
    public static LPContainer getInstance(){
        return instance;
    }
}
