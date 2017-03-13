import java.util.HashMap;
/**
 * Tests using the HasMap
 * 
 * @author Juan Valenzuela 
 * @version 02.16.2016
 */
public class MapTester
{
    private HashMap<String, String> phoneBook;
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        phoneBook = new HashMap<String, String>();
    }

    /**
     * adds a contact to the phoneBook
     * 
     * @param String name
     * @param String phoneNumber
     */
    public void enterNumber(String name, String phoneNumber)
    {
        phoneBook.put(name, phoneNumber);
    }
    
    /**
     * returns a phone number when given a valid name
     * 
     * @param String name
     * @return String phoneNumber
     */
    public String lookupNumber(String name)
    {
        return(phoneBook.get(name));
    }
}
