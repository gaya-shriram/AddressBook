package main;

/**
 * @author Gayathiri Shriram
 * @version 1.0
 * @since Version 1.0
 * <p>
 * purpose: Menu class maintains the details shown on screen and contents
 * of the application.
 */

public class Menu {
    /**
     * Prompt loading
     */
    public static void promptLoading() {
        System.out.println("Enter in FileName: ");
    }

    /**
     * Prompt addition
     */
    public static void promptAddition() {
        System.out.println("Enter the details: ");
    }

    /**
     * Prompt removal
     */
    public static void promptRemoval() {
        System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find: ");
    }

    /**
     * Prompt find
     */
    public static void promptFind() {
        System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find: ");
    }

    /**
     * Prompt listing
     */
    public static void promptListing() {
        System.out.println("Address(es): ");
    }

    /**
     * Prompt save and quit
     */
    public static void promptSaveQuit() {
        System.out.println("Enter in the name of the file you wish to save your AddressBook to: ");
    }

}
