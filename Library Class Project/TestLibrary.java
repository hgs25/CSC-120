
/**
 * Class to test the Library class
 * 
 * @author Debra Blackman 
 * @version Winter 2016 CSC 120
 */
public class TestLibrary
{
    

    
    public static void main(String[] args) 
    {
        System.out.println("----------------------Begin test of " +
        "Library class-------------");
        //create an instance of library
        Library techLibrary = new Library("Prescott Memorial Library");
        //list it's name and that it has 0 books to begin with
        System.out.println(techLibrary.getLibraryName() + " has " + 
        techLibrary.getCount() + " book(s).");
        //list it's holdings ---should be none at this point
        techLibrary.listHoldings();
        //create some book objects and give them valid reference numbers
        Book book1 = new Book("Margaret Mitchell", "Gone with the Wind", 1037, false);
        book1.setRefNumber("0001");
        Book book2 = new Book("Ann Patchett", "Bel Canto", 318, false);
        book2.setRefNumber("0002");
        Book book3 = new Book("A. A. Milne", "Winnie the Pooh", 160, false);
        book3.setRefNumber("0003");
        Book book4 = new Book("A. A. Milne", "Now We are Six", 120, false);
        book4.setRefNumber("0004");
        Book book5 = new Book("Barnes and Kolling", "Objects First", 546, true);
        book5.setRefNumber("0005");
        //add the books to the library holdings
        techLibrary.acquire(book1);
        techLibrary.acquire(book2);
        techLibrary.acquire(book3);
        techLibrary.acquire(book4);
        techLibrary.acquire(book5);
        //report the holdings --- should be 5 books this time
        techLibrary.listHoldings();
        //find the book with "Canto" in its title--should return 1
        System.out.println("The book that contains " + "Canto " +
         "has index:" + techLibrary.findBook("Canto"));
        //look for a book with "Spartan" in its title
        //there is not one, so this should return a -1
        System.out.println("There is no book that contains " + "Spartan " +
         "so the index should be -1::" + techLibrary.findBook("Spartan"));
        //try to delete the book with index 10
        //since there is not one, this should give an error message
        
        techLibrary.discardByIndex(10); //should give error
        //discard the second book in the holdings
        techLibrary.discardByIndex(1);  //removes Bel Canto
        //discard all the books by A. A. Milne
        int discardCount = techLibrary.discardByAuthor("A. A. Milne");
        //there should be two of them
        System.out.println(discardCount + " books discarded");
        //repor the holdings---should be 2 books this time
        techLibrary.listHoldings();
        System.out.println("----------------------End test of Library class----------");
    }
}
