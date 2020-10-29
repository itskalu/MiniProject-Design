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
    
    Copy lpCopy = null;
    
    public Copy FindCopyByLPTitle(String lpTitle){
        for(Copy c : copies){
            LP lp = c.getOriginalLP();
            if(lp.getTitle().toLowerCase().equals(lpTitle.toLowerCase())){
                lpCopy = c;
            }
        }
        return lpCopy;
    }

    public ArrayList getAvailableCopy(){
        ArrayList<Copy> availableCopies = new ArrayList<>();

        for(Copy c : copies){
           if(c.getAvailability()){
               availableCopies.add(c);
           }
        }
        return availableCopies;
    }  
    
    public static CopyContainer getInstance(){
        return instance;
    }
}
