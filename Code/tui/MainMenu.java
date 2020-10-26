package tui;
/**
 * Description of MainMenu goes here.
 * 
 * @author knol, mhi
 * @version 2018.10.19
 * @version 2019.03.29 changed menu to danish and changed method names to reflect the other example
 */
public class MainMenu {
    // instance variables 
    private LoanMenu loanMenu;

    /**
     * Constructor for objects of MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        loanMenu = new LoanMenu();
        
    }

    public void start() { 
        boolean exit=false;
        while (!exit) { //! means while exit not is true (that is: false)
            int choice = writeMainMenu();
            if(choice == 1) {
                System.out.println(" Denne er endnu ikke implementeret");
                
            }
            else if(choice == 2) { 
                // TODO add code here
                System.out.println(" Denne er endnu ikke implementeret");
            }
            else if(choice == 3) {
                loanMenu.start(); 
            }
            else if(choice == 4) {
                // TODO generate test data, this must not be part of final version
            }
            else {
                writeEnd();
                exit = true;
            }//end else
        }//end while
    }
    
    private int writeMainMenu(){
        TextOptions menu = new TextOptions("\n ***Hovedmenu***", "Afslut programmet");
        menu.addOption("Lånermenu");
        menu.addOption("LP menu");
        menu.addOption("Udlånsmenu");
        menu.addOption("Generer test data");
        return menu.prompt();
    }
    
    private void writeEnd() {
        System.out.println(" Tak for denne gang ");
    }
}
