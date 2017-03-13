
/**
 * The ClockDisplay class implements a digital clock display for a
 * American-style 12 hour digital clock. The clock shows hours and minutes. The 
 * range of the clock is 12:00 (noon/midnight) to 11:59 (one minute before 
 * noon/midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Juan Valenzuela Michael Kölling and David J. Barnes
 * @version 2016.01.17
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 12:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(13);    //sets range from 0-12, 13 value is exclusive
        hours.setValue(12);               //sets the hour to the 12 hour mark
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * @param hour : set hour
     * @param minute : set minute
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(13);    //sets range from 0-12, 13 value is exclusive
        hours.setValue(12);               //sets the hour to the 12 hour mark
        minutes = new NumberDisplay(60);
        setTime(hour, minute);            
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) 
        {  // it just rolled over!
            hours.increment();
            if (hours.getValue() == 0)
            {
                hours.increment(); //when timeticks from 12:59, will rollover to 0:00
                                //increment hours by one, one more time, to make it 1:00
            }
        }
        updateDisplay();
    }

    /**
     * @param hour : set hour
     * @param minute : set minute
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        if (hour >= 1)
        {
            hours.setValue(hour);
        }
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * @return displayString returns the time display for the clock
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
}
