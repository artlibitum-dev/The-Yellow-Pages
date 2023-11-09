import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome to Yellow Pages!" + "\n");

        //display menu
        Menu menuDisplay = new Menu();
        menuDisplay.menuDisplay();
        int userMenuChoice = menuDisplay.userMenuChoice;

       
        YellowPages yellowPages = new YellowPages();

        if (userMenuChoice == 0) /* Exit */ {
            System.out.println("Exiting: Bye Bye");
            System.exit(0);
        } 
            else if (userMenuChoice == 1) /* View */ {
            yellowPages.viewContacts();
        } 
            else if (userMenuChoice == 2) /* Search */ {
        
        } 
            else if (userMenuChoice == 3) /* Edit */ {
        
        } 
            else if (userMenuChoice == 5) /* Add */ {

        }
            else if (userMenuChoice == 6) /* Remove */ {

        }

        }    

        // 

        //display contact details
    }