package controller;

import model.*;

import java.util.*;

public class LPCtr
{
    public LP FindLP(String title){
        LP lp = null;      
        lp = LPContainer.getInstance().FindLPByTitle(title);
        
        return lp;
    }
}
