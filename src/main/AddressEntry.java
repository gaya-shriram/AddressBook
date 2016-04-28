package main;

/**
 * @author Gayathiri Shriram
 * @version 1.0
 * @since Version 1.0
 * <p>
 * purpose:
 * AddressEntry class handles getting values from the user and setting them to the appropriate fields.
 */

public class AddressEntry implements Comparable<AddressEntry> {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * No parameter Constructor
     */
    public AddressEntry() {

    }

    /**
     * Constructor with parameters.
     * @param firstName
     * @param lastName
     * @param street
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param email
     */
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

    /**
     * Get First name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get street
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Set street
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Get city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get state
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * Set state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get zip
     * @return zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * Set zip
     * @param zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Get phone
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * toString() is used to get a string object representing the value of the(non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getFirstName() + "\n" + getLastName() + "\n" + getStreet() + "\n" + getCity() + "\n"
                + getState() + "\n" + getZip() + "\n" + getPhone() + "\n" + getEmail();
    }

    /**
     * compareTo()
     * @param o
     * @return
     */
    @Override
    public int compareTo(AddressEntry o) {
        return lastName.compareTo(o.getLastName());
    }
}
