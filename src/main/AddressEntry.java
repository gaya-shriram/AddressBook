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
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    public int getZip() {
        return zip;
    }

    /**
     *
     * @param zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
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
