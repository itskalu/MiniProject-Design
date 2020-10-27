package model;

import java.util.*;

public class LPContainer
{
    private ArrayList <LP> LPs = new ArrayList<>();
    
    private static LPContainer instance = new LPContainer();
    
    private LPContainer(){
    }
    
    public void addLPToList(LP lp){
        LPs.add(lp);
    }
    
    public int getSize(){
        return LPs.size();
    }
    
    public LP FindLPByTitle(String lpTitle){
        LP foundLp = null;
        for(LP lp : LPs){
            if(lp.getTitle().toLowerCase().equals(lpTitle.toLowerCase())){
                foundLp = lp;
            }
        }
        return foundLp;
    }
    
    public static LPContainer getInstance(){
        return instance;
    }
}
