package main;

/**
 * @author Gayathiri Shriram
 * @version 1.0
 * @since version 1.0
 * <p>
 * purpose:
 * AddressBookApplication class is the main program.
 * The address entries are added and listed through the method in this class.
 */

import java.util.List;
import java.util.Scanner;

public class AddressBookApplication {

    /**
     * Main method where the program execution begins.
     * @param args
     */
//    public static void main(String[] args) {
//		/*
//		 * AddressBook class instance creation
//		 */
//        AddressBook ab = new AddressBook();
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println(
//                    "\nAddress Book Menu : Please Enter in your Menu Selection\n a)Loading From File\n b)Addition\n "
//                            + "c)Removal\n d)Find\n e)Listing\n f)Save and Quit\n");
//            System.out.println("Enter your choice: ");
//            String choice = input.next();
//            String searchString, filename;
//            switch (choice) {
//                case "a":
//                    Menu.promptLoading();
//                    filename = input.next();
//                    ab.loadingFromFile(filename);
//                    System.out.println("Successfully loaded");
//                    break;
//                case "b":
//                    Menu.promptAddition();
//                    System.out.println("First Name");
//                    String fn = input.next();
//                    System.out.println("Last Name");
//                    String ln = input.next();
//                    System.out.println("street");
//                    String street = input.next();
//                    System.out.println("City");
//                    String city = input.next();
//                    System.out.println("State");
//                    String state = input.next();
//                    System.out.println("Zip");
//                    int zip = Integer.parseInt(input.next());
//                    System.out.println("Phone");
//                    String phone = input.next();
//                    System.out.println("Email");
//                    String email = input.next();
//                    AddressEntry ae = new AddressEntry(fn, ln, street, city, state, zip, phone, email);
//                    ab.addition(ae);
//                    System.out.println("Thank you the following contact has been added to your address book");
//                    System.out.println(ae);
//                    break;
//                case "c":
//                    Menu.promptRemoval();
//                    searchString = input.next();
//                    ab.removal(searchString);
//                    break;
//                case "d":
//                    Menu.promptFind();
//                    searchString = input.next();
//                    List<AddressEntry> entries = ab.find(searchString);
//                    int  i = 1;
//                    for (AddressEntry entry : entries) {
//                        System.out.print(i + ". ");
//                        System.out.println(entry);
//                        System.out.println();
//                        i++;
//                    }
//                    break;
//                case "e":
//                    Menu.promptListing();
//                    ab.list();
//                    System.out.println(ab);
//                    break;
//                case "f":
//                    Menu.promptSaveQuit();
//                    filename = input.next();
//                    ab.storeToFile(filename);
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Please select correct choices");
//            }
//        }
//    }
}
