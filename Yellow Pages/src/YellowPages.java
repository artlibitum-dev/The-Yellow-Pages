import java.util.ArrayList;
import java.util.List;

public class YellowPages {

    private static List<ContactDetails> contacts = new ArrayList<>();

    // Initiate class and add 7 records
    YellowPages() {
        contacts.add(new ContactDetails("John", "Doe", 30, "Anytown", 12345, "Main Street", 10));
        contacts.add(new ContactDetails("Jane", "Smith", 25, "Another City", 54321, "Elm Street", 20));
        contacts.add(new ContactDetails("Alice", "Johnson", 35, "New Town", 98765, "Oak Street", 5));
        contacts.add(new ContactDetails("Bob", "Wilson", 40, "Your City", 11111, "Pine Street", 15));
        contacts.add(new ContactDetails("Charlie", "Brown", 28, "Hometown", 67890, "Cedar Street", 7));
        contacts.add(new ContactDetails("Eva", "Martinez", 50, "Sunnyville", 55555, "Maple Street", 3));
        contacts.add(new ContactDetails("David", "Lee", 29, "Beachtown", 22222, "Birch Street", 12));
    }

    public void viewContacts() {
        for (ContactDetails contact : contacts) {
            String name = contact.getFirstName();
            System.out.println(name);
        }
    }

    
}