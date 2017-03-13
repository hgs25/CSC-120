
/**
 * Fixed size array of 10 character items
 * 
 * @author Juan Valenzuela 
 * @version 02.01.2016
 */
public class FixedArray
{
    private char[] square;
    private char [][] grid;
    /**
     * Constructor for objects of class FixedArray
     */
    public FixedArray()
    {
        square=new char[10];      //makes an array 10 blocks long
        grid = new char [11][11]; //makes an 11x11 grid        
    }

    /**
     * inputs a ' ' in each element in the array
     */
    public void clearSquares()
    {
        for(int i=0; i<square.length; i++)
        {
            square[i] = ' ';
        }
    }
    
    /**
     * puts a star (*) in each of the odd numbered squares. (index 1,3,5, etc.)
     */
    public void starsOnOdd()
    {
        for(int i=0; i<square.length; i++)
        {
            if(i%2!=0)
            {
                square[i]='*';
            }
        }
    }
    
    /**
     * displays the contents of the squares
     */
    public void printSquares()
    {
        for(int i=0; i<square.length; i++)
        {
            System.out.println(i+":"+square[i]);
        }
    }
    
    /**
     * sets each block in the grid to have a blank space (' ').
     */
    public void clearGrid()
    {
        for(int row=0; row<grid.length; row++)
        {
            for(int column=0; column<grid[row].length; column++)
            {
                grid[row][column]=' ';
            }
        }
    }
    
    /**
     * displays the contents of the grid
     */
    public void displayGrid()
    {
        for(int row=0; row<grid.length; row++)
        {
            for(int column=0; column<grid[row].length; column++)
            {
                System.out.print("|" + grid[row][column]);
            }
            System.out.println("|");
        }
    }
    
    /**
     * places a star(*) in the diagonal blocks in the grid
     */
    public void starsOnDiagonal()
    {
        for(int row=0; row<grid.length; row++)
        {
            for(int column=0; column<grid[row].length; column++)
            {
                if(row==column)
                {
                    grid[row][column] = '*';
                }
                else if(row<column)
                {
                    grid[row][column] = '+';
                }
                else
                {
                    grid[row][column] = '-';
                }
            }
        }
    }
}
