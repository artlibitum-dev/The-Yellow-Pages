import java.util.Scanner;

public class Menu {
    int userMenuChoice;
    Scanner scanner = new Scanner(System.in);
    String[] menu = {
            "1. View contacts",
            "2. Search for contact",
            "3. Edit contacts",
            "4. Exit"
    };
    public int menuDisplay(){
        // get users status
        Users userStatus = new Users();
        String userRole;
        userRole = userStatus.userStatus();
        System.out.println("Your role is: " + userRole + "\n");

        if (userRole.equals("Guest user")){
           menu = new String[]{
                   "1. View contacts",
                   "2. Search for contact",
                   "3. Exit"
           };
        }
        //Menu options
        while (true) {
            try {
                System.out.println("Main menu:");
                for (int i=0; i < menu.length; i++ ) {
                    System.out.println(menu[i]);
                }
                if (userRole.equals("Guest user")){
                System.out.println( "Select your your option by entering a number from 1 - 3");
                userMenuChoice = scanner.nextInt();}
                else {
                    System.out.println( "Select your your option by entering a number from 1 - 4");
                }

                if (userMenuChoice < menu.length+1 ) {
                    System.out.println(menu[--userMenuChoice]);
                    return userMenuChoice;
                } else {
                    if (userRole.equals("Guest user")) {
                        System.out.print("Invalid entry! You enter: " + userMenuChoice + " is not a number between 1-3!" + "\n");
                    } else {
                        System.out.print("Invalid entry! You enter: " + userMenuChoice + " is not a number between 1-4!" + "\n");

                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Input is not an number."+ "\n");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}