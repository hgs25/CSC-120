
/**
 * This "class" is designed to test the functionality of the Book class
 * YOU MAY NOT CHANGE ANYTHING IN THIS CLASS
 * @author Debra Blackman 
 * @version January 5, 2016
 */
public class BookTester
{


    /**
     * the main method creates a few Book objects,
     * displays some information about them,
     * asks them to perform some of their methods,
     * and then displays information about them
     * to check that the methods did what they were
     * supposed to do.
     * 
     * YOU MAY NOT CHANGE ANYTHING IN THIS CLASS
     * 
     */
    public static void main(String[] args)
    {
        //use the constructor to create a few Book objects
        Book book1 = new Book("Margaret Mitchell", "Gone with the Wind", 1037, false);
        System.out.println("Length of refNumber: " + book1.getRefNumber().length() + " should be 0");
        Book book2 = new Book("Ann Patchett", "Bel Canto", 318, false);
        System.out.println("Length of refNumber: " + book2.getRefNumber().length() + " should be 0");
        Book book3 = new Book ("A. A. Milne", "Winnie the Pooh", 160, false);
        System.out.println("Length of refNumber: " + book3.getRefNumber().length() + " should be 0");
        Book book4 = new Book("","",0, false);
        System.out.println("Length of refNumber: " + book4.getRefNumber().length() + " should be 0");
        Book book5 = new Book("Barnes and Kolling", "Objects First", 546, true);
        //use the getAuthor() and getTitle() methods
        System.out.println(book1.getPages() + " pages in " + book1.getTitle() + " written by " + book1.getAuthor());
        System.out.println(book2.getPages() + " pages in " + book2.getTitle() + " written by " + book2.getAuthor());
        System.out.println(book3.getPages() + " pages in " + book3.getTitle() + " written by " + book3.getAuthor());
        System.out.println(book4.getPages() + " pages in " + book4.getTitle() + " written by " + book4.getAuthor());
        System.out.println(book5.getPages() + " pages in " + book5.getTitle() + " written by " + book5.getAuthor());
        //use the printAuthor() and printTitle() methods
        book1.printAuthor();
        book1.printTitle();
        book2.printAuthor();
        book2.printTitle();
        book3.printAuthor();
        book3.printTitle();
        book4.printAuthor();
        book4.printTitle();
        book5.printAuthor();
        book5.printTitle();
        //use the printDetails() method
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
        book4.printDetails();
        book5.printDetails();
        //use the setRefNumber() method
        book1.setRefNumber("0001");
        book2.setRefNumber("0002");
        book3.setRefNumber("0003");
        book5.setRefNumber("0005");
        //check to see that the refNumber got set properly
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
        book4.printDetails();
        book5.printDetails();
        //use the borrow() method
        book1.borrow();
        book1.borrow();
        book1.borrow();
        book2.borrow();
        book2.borrow();
        book3.borrow();
        //check to see that the borrow() method worked
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
        book4.printDetails();
        book5.printDetails();
        //test the isCourseText() method
        System.out.println(book1.getTitle() + ((book1.isCourseText()) ? " is " : " is not ") +
        "a course text book");
        System.out.println(book5.getTitle() + ((book5.isCourseText()) ? " is " : " is not ") +
        "a course text book");
        
    }
}
