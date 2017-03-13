
/**
 * Performs basic arithmetic functions (add, subtract, multiply, divide).
 * Indicate positive value of an integer or negate the integer.
 * Performs operations with double precision.
 * 
 * @author Juan Valenzuela
 * @version 12.12.2015
 */
public class DoubleCalculator
{
    /**
     * Constructor for objects of class DoubleCalculator
     */
    public DoubleCalculator()
    {
    }

    /**
     * performs arithmetic with two integers.
     * Operations available
     * 1) '+' for addition
     * 2) '-' for subtraction
     * 3) '*' for multiplication
     * 4) '/' for division
     * x and y are numbers
     */
    public double binaryOperation(double x , char operation , double y)
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
    public double unaryOperation(char operation , double z)
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
