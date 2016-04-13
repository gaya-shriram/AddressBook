import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
 * AddressBookApplication class is the main program.
 * The address entries are added and listed through the method in this class.
 */

public class AddressBookApplication {

	// This method handles adding address entries into the address book.
	// static void initAddressBookExercise(AddressBook ab) {
	// // simply invokes static methods of the Menu class
	// // Menu.prompt_FirstName();
	// //
	// // Menu.prompt_LastName();
	// //
	// // Menu.prompt_Street();
	// //
	// // Menu.prompt_City();
	// //
	// // Menu.prompt_State();
	// //
	// // Menu.prompt_Zip();
	// //
	// // Menu.prompt_Telephone();
	// //
	// // Menu.prompt_Email();
	// // Adding dummy values to show the working.
	// // Creating two instances of the AddressEntry and adding them into the
	// // address book and listing the collections
	// AddressEntry entry1 = new AddressEntry("Gayathiri", "bala",
	// "eplingterrace", "fremont", "california", 94555,
	// "4085777565", "bala@gmail.com");
	// AddressEntry entry2 = new AddressEntry("Divya", "Vivek",
	// "meramonteterrace", "cinohills", "california", 91709,
	// "4082508004", "vivek001@gmail.com");
	// ab.add(entry1);
	// ab.add(entry2);
	// ab.list();
	// }

	// // File I/O exercise method
	//
	// static void init(String filename, AddressBook ab) throws Exception
	//
	// {
	// BufferedReader br = new BufferedReader(new FileReader("data.txt"));
	//
	// String line = null;
	// while ((line = br.readLine()) != null) {
	//
	//
	// ab.add(new AddressEntry(values,values2));
	// }
	// br.close();
	// }

	static void init(String filename, AddressBook ab) {
		try {

			AddressEntry entry = new AddressEntry();
			// new buffered reader
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			int linenumber = 1;
			String line = null;
			// add all lines from the file to the arraylist

			while ((line = br.readLine()) != null) {
				if (linenumber == 1) {
					entry = new AddressEntry();
				}
				switch (linenumber) {
				case 1:
					entry.setFirstName(line);
					break;
				case 2:
					entry.setLastName(line);
					break;
				case 3:
					entry.setStreet(line);
					break;
				case 4:
					entry.setCity(line);
					break;
				case 5:
					entry.setState(line);
					break;
				case 6:
					entry.setZip(Integer.parseInt(line));
					break;
				case 7:
					entry.setPhone(line);
					break;
				case 8:
					entry.setEmail(line);
					break;
				}
				if (linenumber == 8) {
					ab.add(entry);
				}
				linenumber = (linenumber % 8) + 1;
			}

			br.close();

		} catch (NumberFormatException e) {

			System.err.println("Inavlid Zip Code");
		} catch (IOException e) {
			System.err.println("Invalid File Format");
		}
	}

	// Main method where the program execution begins.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AddressBook class instance creation
		AddressBook ab = new AddressBook();
		init("filename", ab);
		ab.list();
		// initAddressBookExercise(ab);

	}

}
