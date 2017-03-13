/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Juan Valenzuela
 * @version CSC/CYEN 120 Program 3 Ver. 01.13.2016
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Constructor for the Book object.
     * @param bookAuthor : What is the name of the author of this book?
     * @param bookTitle : What is the Title of this book?
     * @param bookPages : How many pages are in this book?
     * @param isCourseText : Is this book required for a Course?
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
    }

    /**
     * mutator method which sets the reference number of a book
     * @param ref : The Refernce Number of the book.
     * Please enter the reference number 
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() < 3)
        {
            System.out.println("Reference number must be at least 3 characters");
        }
        else
        {
            refNumber=ref;
        }
    }
    
    /**
     * mutator method which increases and updates the variable (borrowed) 
     * by one each time the method is called.
     */
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    
    /**
     * prints the name of the books author
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
     /**
     * @return author : name of the author of the Book
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * prints the name of the book
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * @return title : Title of the book.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @return pages : the number of pages in the book.
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * @return refNumber : the reference number of a book 
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * @return borrowed : the number of times this book has been borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * @return boolean courseText : whether or not the book is or is not a Course Text
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * prints details on the book: Reference Number, Title, Author, number of pages, 
     *      and number of times borrowed to the terminal window
     */
    public void printDetails()
    {
        //prints out "Title: titleOfBook, Author: authorOfBook, Pages: numberOfPages"
        String rno;
        if (refNumber.length()>0)
        {
            rno=refNumber;
        }
        else
        {
            rno="ZZZ";
        }
            System.out.println(rno + ": " + "Title: " + title + ", Author: " 
                + author + ", Pages: " + pages + ", has been borrowed " + borrowed + " times.");
    }     
}
