
/*
 * AddressBook class is to create an array list of address entries and list them.
 */

import java.util.ArrayList;

public class AddressBook {

	// ArrayList creation.
	private ArrayList<AddressEntry> AddressEntryList;

	// Constructor
	public AddressBook() {
		this.AddressEntryList = new ArrayList<AddressEntry>();
	}

	// Add method to add the entries into the array list.
	public void add(AddressEntry addressEntry) {
		this.AddressEntryList.add(addressEntry);
	}

	// List method is used to list the address entries.
	public void list() {

		for (AddressEntry entry : this.AddressEntryList) {
			System.out.println(entry);
		}
	}
}
