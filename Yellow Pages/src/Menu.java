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
//        if (user.equals("Guest user")){
//           menu = new String[]{
//                   "1. View contacts",
//                   "2. Search for contact",
//                   "3. Exit"
//           };
//        }
        //Menu options
        while (true) {
            try {
                System.out.println("Main menu:");
                for (int i=0; i < menu.length; i++ ) {
                    System.out.println(menu[i]);
                }
                System.out.println( "Select your your option by entering a number from 1 - 4");
                userMenuChoice = scanner.nextInt();

                if (userMenuChoice < menu.length+1 ) {
                    System.out.println(menu[--userMenuChoice]);
                    return userMenuChoice;
                } else {
                    System.out.print("Invalid entry! You enter: " + userMenuChoice + " is not a number between 1-4!" + "\n");
                }
            } catch (Exception e) {
                System.out.println("Error: Input is not an number."+ "\n");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}