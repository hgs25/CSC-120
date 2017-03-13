import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTester here.
 * 
 * @author Juan Valenzuela  
 * @version 02.15.2016
 */
public class RandomTester
{
    private Random rnd;
    private int seed;
    private ArrayList <String> response;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {        
        rnd = new Random();  
        response = new ArrayList<String>();
        response.add("yes");
        response.add("no");
        response.add("maybe");
    }
    
    /**
     * prints out a pseudo-random number
     */
    public void printOneRandom()
    {
        int number = rnd.nextInt();
        System.out.println(number);
    }
    
    /**
     * prints out a pseudo-random number a given number of times
     */    
    public void printMultiRandom(int howMany)
    {
        for(int i=0; i<howMany; i++)
        {
            int number = rnd.nextInt();
            System.out.println(number);
        }
    }
    
    /**
     * @return number : generates number between 1 and 6 inclusive
     */
    public int throwDice()
    {
        int number = rnd.nextInt(6)+1; // generates a number between 1 and 6 inclusive
        return(number);
    }
    
    /**
     * randomly returns a response
     * @return response
     */
    public String getResponse()
    {
        int index = rnd.nextInt(response.size());     
        return(response.get(index));
    }
    
    /**
     * generates a number between 1 and a given value inclusive
     */
    public int randomWithMax(int max)
    {
        return(rnd.nextInt(max)+1);
    }
    
    /**
     * generates a random number between two numbers inclusive
     */
    public int randomWithMinMax(int min, int max)
    {
        return(rnd.nextInt(max-min+1)+min);
    }
}
