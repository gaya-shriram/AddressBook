/*
 * AddressEntry class handles getting values from the user and setting them to the appropriate fields.
 */

public class AddressEntry {
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private int zip;
	private String phone;
	private String email;
	
	public String[] values = new String[10];
	public int[] values2 = new int[8];

	// No parameter Constructor
	public AddressEntry() {

	}

//	// Constructor with parameters.
	public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip,
			String phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}
	
	// File IO exercise constructor
	// Constructor with parameters.
//	public AddressEntry(String values[] , int values2[]) {
//		this.firstName = values[0];
//		this.lastName = values[1];
//		this.street = values[2];
//		this.city = values[3];
//		this.state = values[4];
//		this.zip = values2[0];
//		this.phone = values[5];
//		this.email = values[6];
//	}

	// Get and Set methods to get and set the values to the corresponding
	// fields.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString() is used to get a string object representing the value of the
	// number object.
	@Override
	public String toString() {
		return "[" + getFirstName() + "," + getLastName() + "," + getStreet() + "," + getCity() + "," + getState() + ","
				+ getZip() + "," + getPhone() + "," + getEmail() + "]";
	}

}
