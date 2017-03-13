
/**
 * Write a description of class exFourEightyFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SummaryExercises
{

    /**
     * Constructor for objects of class exFourEightyFour
     */
    public SummaryExercises()
    {
    }
    
    /**
     * do-while loop that that prints out the numbers between 1-10.
     */
    public void countToTen()
    {
        int i = 1;
        do
        {
          System.out.println(i);
          i++;
        }
        while(i<=10);
    }
    
    /**
     * Switch-case example
     * tells what day of the week the number corresponds to.
     */
    public void rounding(int i)
    {
        String weekday;
        switch(i)
        {
            case 1:
            {
                weekday = "Sunday";
                System.out.println(weekday);
                break;
            }
            case 2:
            {
                weekday = "Monday";
                System.out.println(weekday);
                break;
            }
            case 3:
            {
                weekday = "Tuesday";
                System.out.println(weekday);
                break;
            }
            case 4:
            {
                weekday = "Wednesday";
                System.out.println(weekday);
                break;
            }
            case 5:
            {
                weekday = "Thursday";
                System.out.println(weekday);
                break;
            }
            case 6:
            {
                weekday = "Friday";
                System.out.println(weekday);
                break;
            }
            case 7:
            {
                weekday = "Saturday";
                System.out.println(weekday);
                break;
            }
            default:
            {
                break;
            }
        }
    }
}
