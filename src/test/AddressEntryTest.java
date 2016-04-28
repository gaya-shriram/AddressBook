/**
 *
 */
package test;

import main.AddressEntry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * @author Gaya
 */
public class AddressEntryTest {
    private AddressEntry addressEntry1, addressEntry2;

    @Before
    public void setUp() {
        addressEntry1 = new AddressEntry("Gaya", "Shriram", "12 St", "Fremont", "CA", 94555, "1234567890", "Gaya@Shriram.com");
        addressEntry2 = new AddressEntry("Bala", "Sankar", "45 St", "Sunnyvale", "AZ", 94089, "9876543210", "Bala@Sankar.com");
    }

    /**
     * Test method for {@link main.AddressEntry#AddressEntry(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)}.
     */
    @Test
    public void testAddressEntryWithParams() {
        AddressEntry addressEntry3 = new AddressEntry("Gaya", "Shriram", "12 St", "Fremont", "CA", 94555, "1234567890", "Gaya@Shriram.com");
        AddressEntry addressEntry4 = new AddressEntry("Bala", "Sankar", "45 St", "Sunnyvale", "AZ", 94089, "9876543210", "Bala@Sankar.com");
        Assert.assertEquals("Address Entry macthes", addressEntry1.toString(), addressEntry3.toString());
        Assert.assertEquals("Address Entry macthes", addressEntry2.toString(), addressEntry4.toString());
    }

    /**
     * Test method for {@link main.AddressEntry#getFirstName()}.
     */
    @Test
    public void testGetFirstName() {
        Assert.assertEquals("First name matched", "Gaya", addressEntry1.getFirstName());
        Assert.assertEquals("First name matched", "Bala", addressEntry2.getFirstName());
    }

    /**
     * Test method for {@link main.AddressEntry#setFirstName(java.lang.String)}.
     */
    @Test
    public void testSetFirstName() {
        String name = "Bala";
        addressEntry1.setFirstName(name);
        Assert.assertEquals("First name matches", name, addressEntry1.getFirstName());
        name = "Alice";
        addressEntry2.setFirstName(name);
        Assert.assertEquals("First name matches", name, addressEntry2.getFirstName());
    }

    /**
     * Test method for {@link main.AddressEntry#getLastName()}.
     */
    @Test
    public void testGetLastName() {
        Assert.assertEquals("Last name matched", "Shriram", addressEntry1.getLastName());
        Assert.assertEquals("Last name matched", "Sankar", addressEntry2.getLastName());
    }

    /**
     * Test method for {@link main.AddressEntry#setLastName(java.lang.String)}.
     */
    @Test
    public void testSetLastName() {
        String name = "Bob";
        addressEntry1.setLastName(name);
        Assert.assertEquals("Last name matches", name, addressEntry1.getLastName());
        name = "John";
        addressEntry2.setLastName(name);
        Assert.assertEquals("Last name matches", name, addressEntry2.getLastName());
    }

    /**
     * Test method for {@link main.AddressEntry#getStreet()}.
     */
    @Test
    public void testGetStreet() {
        Assert.assertEquals("Street matched", "12 St", addressEntry1.getStreet());
        Assert.assertEquals("Street matched", "45 St", addressEntry2.getStreet());
    }

    /**
     * Test method for {@link main.AddressEntry#setStreet(java.lang.String)}.
     */
    @Test
    public void testSetStreet() {
        String st = "disney st";
        addressEntry1.setStreet(st);
        Assert.assertEquals("Street matches", st, addressEntry1.getStreet());
        addressEntry2.setStreet(st);
        Assert.assertEquals("Street matches", st, addressEntry2.getStreet());
    }

    /**
     * Test method for {@link main.AddressEntry#getCity()}.
     */
    @Test
    public void testGetCity() {
        Assert.assertEquals("City matched", "Fremont", addressEntry1.getCity());
        Assert.assertEquals("City matched", "Sunnyvale", addressEntry2.getCity());
    }

    /**
     * Test method for {@link main.AddressEntry#setCity(java.lang.String)}.
     */
    @Test
    public void testSetCity() {
        String city = "Santa Clara";
        addressEntry1.setCity(city);
        Assert.assertEquals("City matches", city, addressEntry1.getCity());
        addressEntry2.setCity(city);
        Assert.assertEquals("City matches", city, addressEntry2.getCity());
    }

    /**
     * Test method for {@link main.AddressEntry#getState()}.
     */
    @Test
    public void testGetState() {
        Assert.assertEquals("State matched", "CA", addressEntry1.getState());
        Assert.assertEquals("State matched", "AZ", addressEntry2.getState());
    }

    /**
     * Test method for {@link main.AddressEntry#setState(java.lang.String)}.
     */
    @Test
    public void testSetState() {

        String state = "WI";
        addressEntry1.setState(state);
        Assert.assertEquals("State matches", state, addressEntry1.getState());
        addressEntry2.setState(state);
        Assert.assertEquals("State matches", state, addressEntry2.getState());
    }

    /**
     * Test method for {@link main.AddressEntry#getZip()}.
     */
    @Test
    public void testGetZip() {

        Assert.assertEquals("Zip matched", 94555, addressEntry1.getZip());
        Assert.assertEquals("Zip matched", 94089, addressEntry2.getZip());
    }

    /**
     * Test method for {@link main.AddressEntry#setZip(int)}.
     */
    @Test
    public void testSetZip() {

        int zip = 11111;
        addressEntry1.setZip(zip);
        Assert.assertEquals("Zip matches", zip, addressEntry1.getZip());
        addressEntry2.setZip(zip);
        Assert.assertEquals("State matches", zip, addressEntry2.getZip());
    }

    /**
     * Test method for {@link main.AddressEntry#getPhone()}.
     */
    @Test
    public void testGetPhone() {

        Assert.assertEquals("Phone matched", "1234567890", addressEntry1.getPhone());
        Assert.assertEquals("Phone matched", "9876543210", addressEntry2.getPhone());
    }

    /**
     * Test method for {@link main.AddressEntry#setPhone(java.lang.String)}.
     */
    @Test
    public void testSetPhone() {
        String phone = "11111111";
        addressEntry1.setPhone(phone);
        Assert.assertEquals("Phone matches", phone, addressEntry1.getPhone());
        addressEntry2.setPhone(phone);
        Assert.assertEquals("Phone matches", phone, addressEntry2.getPhone());
    }

    /**
     * Test method for {@link main.AddressEntry#getEmail()}.
     */
    @Test
    public void testGetEmail() {
        Assert.assertEquals("Phone matched", "Gaya@Shriram.com", addressEntry1.getEmail());
        Assert.assertEquals("Phone matched", "Bala@Sankar.com", addressEntry2.getEmail());
    }

    /**
     * Test method for {@link main.AddressEntry#setEmail(java.lang.String)}.
     */
    @Test
    public void testSetEmail() {

        String email = "ab@xyz.com";
        addressEntry1.setEmail(email);
        Assert.assertEquals("Email matches", email, addressEntry1.getEmail());
        addressEntry2.setEmail(email);
        Assert.assertEquals("Email matches", email, addressEntry2.getEmail());
    }

    /**
     * Test method for {@link main.AddressEntry#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertTrue("ToString works", addressEntry1.toString().contains("Gaya"));
        Assert.assertTrue("ToString works", addressEntry2.toString().contains("Bala"));
    }

    /**
     * Test method for {@link main.AddressEntry#compareTo(main.AddressEntry)}.
     */
    @Test
    public void testCompareTo() {
        Assert.assertTrue("Compare works", addressEntry1.compareTo(addressEntry2) > 0);
    }

}
