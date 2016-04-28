package main;

/**
 * @author Gayathiri Shriram
 * @version 1.0
 * @since Version 1.0
 * <p>
 * purpose:
 * AddressBook class is to create an array list of address entries and list them.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private static ArrayList<AddressEntry> addressEntryList;
    Scanner input = new Scanner(System.in);

    /**
     * Constructor
     */
    public AddressBook() {
        addressEntryList = new ArrayList<AddressEntry>();
    }

    /**
     * Store to file
     * @param filename
     */
    public void storeToFile(String filename) {
        try {
            // create Bufferedwriter instance with a FileWriter
            BufferedWriter out = new BufferedWriter(new FileWriter(filename));
            out.write(this.toString());
            out.close();
            System.out.println("Thank you, your AddressBook has been backed up to the file");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * List method is used to list the address entries.
     */
    public void list() {
        Collections.sort(addressEntryList);
    }

    /**
     * Add method to add the entries into the array list.
     *
     * @param ae - AddressEntry object which you want to add
     */
    public void addition(AddressEntry ae) {
        addressEntryList.add(ae);
    }

    /**
     * Remove an address book entry
     *
     * @param searchString - Search string
     */
    public void removal(String searchString) {
        List<AddressEntry> entries = find(searchString);
        int  i = 1;
        for (AddressEntry entry : entries) {
            System.out.print(i + ": ");
            System.out.println(entry);
            i++;
        }
        System.out.println("Found entry that matches the search string. Enter the record # that you wish to delete: ");
        int selection = input.nextInt();
        i = 1;
        int indexToRemove = -1;
        for (int index = 0; index < addressEntryList.size(); index++) {
            if (addressEntryList.get(index).getLastName().matches(searchString + "(.*)")) {
                if (i == selection) {
                    indexToRemove = index;
                    break;
                }
                i++;
            }
        }
        addressEntryList.remove(indexToRemove);
    }

    /**
     * find an addressbook entry
     *
     * @param searchString -  Search string
     */
    public List<AddressEntry> find(String searchString) {
        List<AddressEntry> result = new ArrayList<AddressEntry>();
        for (AddressEntry addressEntry : addressEntryList) {
            if (addressEntry.getLastName().matches(searchString + "(.*)")) {
                result.add(addressEntry);
            }
        }
        return result;
    }

    /**
     * Load from file
     *
     * @param filename
     */
    public void loadingFromFile(String filename) {
        try {
            String fn;
            String ln;
            String street;
            String city;
            String state;
            String phone;
            String email;
            int zip;
            /*
			 * new buffered reader
			 */
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((fn = br.readLine()) != null && !fn.isEmpty()) {
                ln = br.readLine();
                street = br.readLine();
                city = br.readLine();
                state = br.readLine();
                zip = Integer.parseInt(br.readLine());
                phone = br.readLine();
                email = br.readLine();
                AddressEntry ae = new AddressEntry(fn, ln, street, city, state, zip, phone, email);
                addition(ae);
            }
            br.close();

        } catch (NumberFormatException e) {
            System.err.println("Inavlid Zip Code");
        } catch (IOException e) {
            System.err.println("Invalid File Format");
        }
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (AddressEntry entry : addressEntryList) {
            str.append(entry.toString());
            str.append("\n");
        }
        return str.toString();
    }
}
