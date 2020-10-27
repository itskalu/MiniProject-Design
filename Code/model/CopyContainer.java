package model;

import java.util.*;

public class CopyContainer
{
    
    private ArrayList <Copy> copies = new ArrayList<>(); 
    
    private static CopyContainer instance = new CopyContainer();
    
    
    public void addCopy(Copy c){
        copies.add(c);
    }
    
    public int getSize(){
        return copies.size();
    }
    
    LP originalLP = null;
    
    public boolean FindLPByTitle(String inputTitle){
        boolean found = false;
        for(Copy c : copies){
            LP lp = c.getOriginalLP();
            if(lp.getTitle().toLowerCase().equals(inputTitle.toLowerCase())){
                found = true;
                originalLP = lp;
            }
        }
        return found;
    }
    
     public int getNumOfCopies(LP lp){
        int numOfCopies = 0;
        for(Copy c : copies){
            if(c.getOriginalLP()==lp){
                numOfCopies++;
            }
        }
        
        return numOfCopies;
    }
    
    public LP getLP(){
        return originalLP;
    }
    
    public static CopyContainer getInstance(){
        return instance;
    }
}
