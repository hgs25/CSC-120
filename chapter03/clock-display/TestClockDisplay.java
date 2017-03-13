
/**
 * Tester Class for the ClockDisplay Class
 * 
 * @author Juan Valenzuela 
 * @version 01.17.16
 */
public class TestClockDisplay
{   
    public static void main (String[] args)
    {
        //test using the constructor
        System.out.println("**********************************************************************");
        System.out.println("Begin Testing");
        System.out.println("Testing Constuctor and getTime");
        ClockDisplay clock1 = new ClockDisplay(); //without parameters
        System.out.println("clock1 start time: "+clock1.getTime()+" should be 12:00");
        ClockDisplay clock2 = new ClockDisplay(11,59); //would rollover to 12:00 at increment
        System.out.println("clock2 start time: "+clock2.getTime()+" should be 11:59");
        ClockDisplay clock3 = new ClockDisplay(5,49); //within parameter limits
        System.out.println("clock3 start time: "+clock3.getTime()+" should be 05:49");
        ClockDisplay clock4 = new ClockDisplay(13,60); //at limits
        System.out.println("clock4 start time: "+clock4.getTime()+" should be 12:00");
        ClockDisplay clock5 = new ClockDisplay(15,71); //above limits
        System.out.println("clock5 start time: "+clock5.getTime()+" should be 12:00");
        ClockDisplay clock6 = new ClockDisplay(12,59); //would rollover to 1:00 when increment
        System.out.println("clock6 start time: "+clock6.getTime()+" should be 12:59");
        System.out.println();
                
        //test timeTick
        System.out.println("Testing timeTick and rollover");
        clock1.timeTick();
        System.out.println("clock1 new time: "+clock1.getTime()+" should be 12:01");
        clock2.timeTick();
        System.out.println("clock2 new time: "+clock2.getTime()+" should be 12:00");
        clock3.timeTick();
        System.out.println("clock3 new time: "+clock3.getTime()+" should be 05:50");
        clock4.timeTick();
        System.out.println("clock4 new time: "+clock4.getTime()+" should be 12:01");
        clock5.timeTick();
        System.out.println("clock5 new time: "+clock5.getTime()+" should be 12:01");
        clock6.timeTick();
        System.out.println("clock6 new time: "+clock6.getTime()+" should be 01:00");
        System.out.println();
        
        
        //test setTime
        System.out.println("Testing setTime");
        clock1.setTime(0,0); //at lower limit
        System.out.println("clock1 new time: "+clock1.getTime()+" should be 12:00");
        clock2.setTime(13,60); //at limit
        System.out.println("clock2 new time: "+clock2.getTime()+" should be 12:00");
        clock3.setTime(15,76); //above limit so stay the same
        System.out.println("clock3 new time: "+clock3.getTime()+" should be 05:50");
        clock4.setTime(12,59);
        System.out.println("clock4 new time: "+clock4.getTime()+" should be 12:59");        
        clock5.setTime(5,31);
        System.out.println("clock5 new time: "+clock5.getTime()+" should be 05:31");
        System.out.println();
        System.out.println("End of Test");
        System.out.println("**********************************************************************");
    }
}
