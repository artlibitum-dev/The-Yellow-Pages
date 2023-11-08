import java.util.Scanner;

public class Menu {
    int userMenuChoice = 0;
    public int menuDisplay(){
        Scanner scanner = new Scanner(System.in);
        //Menu options
        System.out.println("Main menu:");
        System.out.println("1. View contacts");
        System.out.println("2. Search for contact");
        System.out.println("3. Edit contacts");
        System.out.println("4. Exit");
        System.out.println( "Select your your option by entering a number from 1 - 4");

        do {
            userMenuChoice = scanner.nextInt();
            if( userMenuChoice == 1){
                System.out.println("1. View contacts");
            } else if ( userMenuChoice  == 2) {
                System.out.println("2. Search for contact");
            } else if ( userMenuChoice  == 3) {
                System.out.println("3. Edit contacts");}
            else if ( userMenuChoice  == 4) {
                System.out.println("4. Exit");}
            else  {
                System.out.println("Invalid entry! You enter: " + userMenuChoice + "is not a number between 1-4!");
                System.out.println( "Select your your option by entering a number from 1 - 4");
                System.out.println("Main menu:");
                System.out.println("1. View contacts");
                System.out.println("2. Search for contact");
                System.out.println("3. Edit contacts");
                System.out.println("4. Exit");
            }
        }while (userMenuChoice < 1 || userMenuChoice > 4 );
        return userMenuChoice;
    }
}
