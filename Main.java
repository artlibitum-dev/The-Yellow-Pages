import java.util.Arrays;
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

        // preSaved contact list
        String[] preSaveSurnamePhoneList = new String[7];
        preSaveSurnamePhoneList[0]= "Drogba";
        preSaveSurnamePhoneList[1]= "Henry";
        preSaveSurnamePhoneList[2]= "Eto";
        preSaveSurnamePhoneList[3]= "Diouf";
        preSaveSurnamePhoneList[4]= "Essien";
        preSaveSurnamePhoneList[5]= "Mikel";
        preSaveSurnamePhoneList[6]= "";

        ContactDetails contactDetails = new ContactDetails();
        if (userMenuChoice == 1){
            System.out.println("Enter the number of the contact you would like to view:");
            for (int i = 0; i < preSaveSurnamePhoneList.length; i++)
                System.out.println((i +1)+". " + preSaveSurnamePhoneList[i]);

            //Open contact details
        int openContactDetails = 0;
            System.out.println("Pick which number you would like to open");
            // openContactDetails = scanner.nextInt();
            if (openContactDetails == 1){
                contactDetails.Drogba();
            }
        }

        //display contact details
    }
}