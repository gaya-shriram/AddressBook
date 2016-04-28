package test;

import main.AddressBook;
import main.AddressEntry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AddressBookTest {
    private AddressBook addressBook;
    AddressEntry addressEntry1;
    AddressEntry addressEntry2;

    @Before
    public void setUp() {
        addressBook = new AddressBook();
        addressEntry1 = new AddressEntry("Gaya", "Bob", "12 St", "Fremont", "CA", 94555, "1234567890", "Gaya@Shriram.com");
        addressEntry2 = new AddressEntry("Bala", "Alice", "45 St", "Sunnyvale", "AZ", 94089, "9876543210", "Bala@Sankar.com");
        addressBook.addition(addressEntry1);
        addressBook.addition(addressEntry2);
    }

    @Test
    public final void testList() {
        StringBuffer expected = new StringBuffer();
        expected.append(addressEntry1.toString()).append("\n").append(addressEntry2.toString()).append("\n");
        Assert.assertEquals("Unsorted - Address book matches", expected.toString(), addressBook.toString());
        addressBook.list();
        expected = new StringBuffer();
        expected.append(addressEntry2.toString()).append("\n").append(addressEntry1.toString()).append("\n");
        Assert.assertEquals("Sorted - Address book matches", expected.toString(), addressBook.toString());
    }

    @Test
    public final void testAddition() {
        StringBuffer expected = new StringBuffer();
        expected.append(addressEntry1.toString()).append("\n").append(addressEntry2.toString()).append("\n");
        Assert.assertEquals("Address book matches", expected.toString(), addressBook.toString());
    }

    @Test
    public final void testFind() {
        List<AddressEntry> result = addressBook.find("Ali");
        Assert.assertEquals("Search count matches", 1, result.size());
        Assert.assertEquals("Result macthes", addressEntry2.toString(), result.get(0).toString());
    }

    @Test
    public final void testLoadingFromFile() {
        addressBook.loadingFromFile("data.txt");
        AddressEntry addressEntry3 = new AddressEntry("Lynne", "Grewe", "123 3rd Ave", "Hayward", "Ca", 28666, "lynne.grewe@csueastbay.edu", "510-885-4167");
        AddressEntry addressEntry4 = new AddressEntry("Butch", "Grewe", "Bay Avenue", "Capitoal", "Ca", 99999, "bg@gmail.com", "415-389-1239");
        StringBuffer expected = new StringBuffer();
        expected.append(addressEntry1.toString()).append("\n").append(addressEntry2.toString()).append("\n")
                .append(addressEntry3.toString()).append("\n").append(addressEntry4.toString()).append("\n");
        Assert.assertEquals("Address book matches", expected.toString(), addressBook.toString());
    }

    @Test
    public final void testStoreToFile() {
        addressBook.storeToFile("test_store_file_data.txt");
        AddressBook storedAddressBook = new AddressBook();
        storedAddressBook.loadingFromFile("test_store_file_data.txt");
        Assert.assertEquals("Address book matches", addressBook.toString(), storedAddressBook.toString());
    }

}
