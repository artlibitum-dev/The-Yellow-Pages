import java.util.Objects;
import java.util.Scanner;

public class Users {
    int userLoginChoice = 0;
    Boolean guestUser;
    Boolean adminUser;
    String userType;

    int defaultPassword = 1234;
    public String userStatus( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "If you are a guest enter 1 | If you are an admin enter 1");
        // have user choose there status
        do {
            userLoginChoice = scanner.nextInt();
            if( userLoginChoice == 1){
                guestUser = true;
                adminUser = false;
                System.out.println("You are an guest");
            } else if ( userLoginChoice == 2) {
                guestUser = false;
                adminUser = true;
                System.out.println("You are an admin!");
            } else  {
                System.out.println("Invalid entry! You enter: " + userLoginChoice);
                System.out.println( "If you are a guest enter 1 | If you are an admin enter 1");
            }
        }while (userLoginChoice < 1 || userLoginChoice > 2 );

        if (guestUser){
            userType = "Guest";
        } else {
            userType = "Admin";
        }
        return userType;
    }

    public void login(){
if (Objects.equals(userType, "Admin")){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter password:");

    int newPasswordEntry;
    int newPasswordEntryTwo;
    int newPassword;

    defaultPassword = scanner.nextInt();
    if (defaultPassword == 1234){
        System.out.println("Please Create new password with four digits:");
        newPasswordEntry = scanner.nextInt();
        System.out.println("Please reenter contact:");
        newPasswordEntryTwo = scanner.nextInt();

        if (newPasswordEntry == newPasswordEntryTwo){
            newPassword =newPasswordEntryTwo;
        }




    }
}
    }
}
