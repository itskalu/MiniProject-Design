package controller;

import model.*;

public class CopyCtr
{   
    public Copy FindLPCopy(String lpTitle){
        Copy copy = null;
        copy = CopyContainer.getInstance().FindCopyByLPTitle(lpTitle);
        return copy;
    }
    
}
