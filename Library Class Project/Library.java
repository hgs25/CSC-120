import java.util.ArrayList;
import java.util.Iterator;
/**
 * The Class organizes book objects into an array.
 * 
 * @author Juan Valenzuela
 * @version 02.03.2016
 */
public class Library
{
    private String libraryName;
    private ArrayList<Book> holdings;

    /**
     * Constructor for objects of class Library.
     * @param nameOf Library : What is the name of the Libray? 
     */
    public Library(String nameOfLibrary)
    {
        libraryName = nameOfLibrary;
        holdings = new ArrayList<Book>();
    }
    
    /**
     * Returns the name of the library in the form of a String.
     * @return libraryName
     */
    public String getLibraryName()
    {
        return(libraryName);
    }
    
    /**
     * Mutator method that adds an object Book into the holdings
     * @param Book
     */
    public void acquire(Book book)
    {
        holdings.add(book);
    }
    
    /**
     * Mutator method that removes a book from the collection by looking up the index number
     * @param index
     */
    public void discardByIndex(int index)
    {
        if (validateIndex(index))
        {
            holdings.remove(index);
        }
        else
        {
            System.out.println("Unable to discard; index " + index + " invalid");
        }
    }
    
    /**
     * returns the number of books in the library.
     * @return holdings.size()
     */
    public int getCount()
    {
        return(holdings.size());
    }
    
    /**
     * lists all the names of the books in the library.
     */
    public void listHoldings()
    {
        for (int i=0; i<3; i++)
        {
            System.out.println();
        }
        printCenteredString("Prescott Memorial Library");
        printCenteredString("Holdings");
        System.out.println();
        for (Book book:holdings)
        {
            book.printDetails();
        }
        System.out.println();
        System.out.println("Count of Books in holdings: " + holdings.size());
        System.out.println();
    }
    
    /**
     * Centers and prints a String print output on a 80 character wide line
     * @param str
     */
    private void printCenteredString(String str)
    {
        int size = 80;
        String repeatedChar = " ";
        int left = size/2 - str.length()/2 - str.length()%2;  //determines length of left indent
        int right = size/2 - str.length()/2;                  //determines length of right indent
        for (int i=0; i<left; i++)
        {
            System.out.print(repeatedChar);
        }
        System.out.print(str);
        for (int i=0; i<right; i++)
        {
            System.out.print(repeatedChar);
        }
        System.out.println();
    }
    
    /**
     * Finds a book using a String keyword.
     * Returns the index of the first book to contain the keyword in its name.
     * @param keyword
     * @return index : will return -1 if no book has a title with the keyword
     */
    public int findBook(String keyword)
    {
        boolean found = false;
        int index = 0;
        for(Book book:holdings)
        {
            if(!found)
            {
                String myBook = book.getTitle();
                if(book.getTitle().contains(keyword))
                {
                    found = true;
                }
                else
                {
                    index++;
                }
            }
       }
       if(!found)
       {
            index = -1;
       }
        return(index);        
    }
    
    /**
     * Removes books with the same author from the library.
     * @param author
     * @return removed : returns number of books removed from Library
     */
    public int discardByAuthor(String author)
    {
        Iterator <Book> it = holdings.iterator();
        //int index = 0;
        int removed = 0;
        while(it.hasNext())
        {
            Book book = it.next();
            if(book.getAuthor().contains(author))
            {
                it.remove();
                removed++;
            }
            //index++;
        }
        return(removed);
    }
    
    /**
     * validates index number
     * @param index
     */
    private boolean validateIndex(int index)
    {
        boolean valid; //stores values indicating if the index number is valid (true) or invalid (false).
        if (index > holdings.size())
        {
            //System.out.println("Error: index number entered cannot be greater than " + holdings.size() + ".");
            valid = false;
        }
        else if (index < 0)
        {
            //System.out.println("Error: index number must be a positive non-zero number.");
            valid = false;
        }
        else
        {
            valid = true;
        }
        return(valid);
    }
}
