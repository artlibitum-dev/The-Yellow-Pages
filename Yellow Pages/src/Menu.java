import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    int userMenuChoice;
    Scanner scanner = new Scanner(System.in);

    private List<String> getMenu(String userRole) {
        List<String> menu = new ArrayList<>();
        menu.add(0, "Exit");
        menu.add(1, "View contacts");
        menu.add(2, "Search for contact");
        
        if (userRole == "admin") {
            menu.add(3, "Add contact");
            menu.add(4, "Edit contact");
            menu.add(5, "Remove contact");
        }

        return menu;
    }
    
    public int menuDisplay(){
        // get users status
        Users userStatus = new Users();
        String userRole;
        userRole = userStatus.userStatus();
        System.out.println("Your role is: " + userRole + "\n");

        //Menu options
        while (true) {
            try {
                System.out.println("Main menu:");
                List<String> menu = getMenu(userRole);

                System.out.println( "Select your your option by entering a number from 0 - " + String.valueOf(menu.size()-1));
                //printOut menu except 0 index
                for (int i = 1; i < menu.size(); i++) {
                    System.out.println(i + ". " + menu.get(i));
                }
                // printout menu 0 index - Exit
                System.out.println("0. " + menu.get(0) + "\n");

                userMenuChoice = scanner.nextInt();
                if (userMenuChoice < menu.size() ) {
                    System.out.print(menu.get(userMenuChoice));
                    return userMenuChoice;
                } else {
                    System.out.print("Invalid entry! You enter: " + userMenuChoice + " is not a number between 0 - " + menu.size() + "!\n");
                }
            } catch (Exception e) {
                System.out.println("Error: Input is not an number."+ "\n");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}