package controller;

import java.util.*;

import model.*;

public class CopyCtr
{   
    ArrayList<Copy> availableCopy = new ArrayList<>();
    
    public Copy findLPCopy(String lpTitle){
        Copy copy = null;
        copy = CopyContainer.getInstance().FindCopyByLPTitle(lpTitle);
        return copy;
    }
   
    public String getAvailableCopy(){
        availableCopy = CopyContainer.getInstance().getAvailableCopy();
        return availableCopy.get(0).getSerialNum();
    }

}
