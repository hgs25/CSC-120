
/**
 * Performs basic arithmetic functions (add, subtract, multiply, divide).
 * indicate positive value of an integer or negate the integer.
 * 
 * @author Juan Valenzuela 
 * @version 12.12.2015
 */
public class IntegerCalculator
{
    /**
     * Constructor for objects of class IntegerCalculator
     */
    public IntegerCalculator()
    {
    }

    /**
     * performs arithmetic with two integers.
     * Operations available
     * 1) '+' for addition
     * 2) '-' for subtraction
     * 3) '*' for multiplication
     * 4) '/' for division with whole number result
     * 5) '%' for division with remainder result
     * x and y are numbers
     */
    public int binaryOperation(int x , char operation , int y)
    {
        if (operation == '+')
        {
            //calculates and shows value of addition
            return(x+y);
        }
        if (operation == '-')
        {
            //calculates and shows value of subtraction
            return(x-y);
        }
        if (operation == '*')
        {
            //calculates and shows value of multiplication
            return (x*y);
        }
        if (operation == '/')
        {
            //calculates and shows whole number value of division
            return (x/y);
        }        
        if (operation == '%')
        {
            //calculates and shows value of remainder from division
            return (x%y);
        }
        System.out.println("Error: operation not known.");
        System.out.println("Please use one of the following: +,-,*,/,%");
        return(0);        
    }
    
    /**
     * denotes/negate sign of integer
     * 1) '+' to place posative sign in front of number
     * 2) '-' to place negative sign in front of number
     * z is a number
     */
    public int unaryOperation(char operation , int z)
    {
        if (operation == '+')
        {
            //indicate positive value for integer z
            return (+z);
        }
        if (operation =='-')
        {
            //negates integer z
            return(-z);
        }
        System.out.println("Error: operation not known.");
        System.out.println("Please use one of the following: +,-,*,/,%");
        return(0);
    }
}
