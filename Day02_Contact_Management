import java.util.ArrayList;
import java.util.Scanner;

// Contact class
class Contact {
    int id;
    String name;
    String phoneNumber;

    public Contact(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

// ContactManager class
class ContactManager {
    ArrayList<Contact> contacts = new ArrayList<>();
    int contactIdCounter = 1;

    // Add contact
    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(contactIdCounter, name, phoneNumber);
        contacts.add(contact);
        contactIdCounter++;
        System.out.println("Contact added successfully!");
    }

    // View all contacts
    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact c : contacts) {
            System.out.println("ID: " + c.id + ", Name: " + c.name + ", Phone: " + c.phoneNumber);
        }
    }

    // Search contact by name
    public void searchContact(String name) {
        boolean found = false;

        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println("Contact Found:");
                System.out.println("ID: " + c.id + ", Name: " + c.name + ", Phone: " + c.phoneNumber);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}

// Main class
public class ContactManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("\n--- Contact Management App ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    manager.addContact(name, phone);
                    break;

                case 2:
                    manager.viewContacts();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    manager.searchContact(searchName);
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
