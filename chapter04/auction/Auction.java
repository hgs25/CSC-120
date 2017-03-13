import java.util.ArrayList;
import java.util.Iterator;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.07
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            boolean successful = selectedLot.bidFor(new Bid(bidder, value));
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            // The number seems to be reasonable.
            //Lot selectedLot = lots.get(lotNumber - 1);
            // Include a confidence check to be sure we have the
            // right lot.
            int index = 0;
            for(Lot lot:lots)
            {
                if (lotNumber == lot.getNumber())
                {
                    return lot;
                }
            }
            
            if(lot.getNumber() != lotNumber) {
                System.out.println("Internal error: Lot number " +
                                   selectedLot.getNumber() +
                                   " was returned instead of " +
                                   lotNumber);
                // Don't return an invalid lot.
                selectedLot = null;
            }
            return selectedLot;
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
        }
    }
    
    /**
     * Prints out details on all the lots in the autction.
     * Sells any lot that has at least one bid.
     */
    public void close()
    {
        for(Lot lot:lots)
        {
            Bid winningBid = lot.getHighestBid(); 
            if(winningBid != null)
            {
                System.out.println(lot.getHighestBid().getBidder().getName()+
                                    " has won this lot with a bid of "+winningBid+".");
            }
            else
            {
                System.out.println("Lot "+lot.getNumber()+":"+lot.getDescription()+" has no bidders");
            }                
        }
    }
    
    /**
     * Returns an ArrayList with lots that don't have a bidder.
     * @return unsoldLots
     */
    public ArrayList<Lot> getUnsold()
    {
        ArrayList<Lot> unsoldLots;
        unsoldLots=new ArrayList<Lot>();
        for(Lot lot:lots)
        {
            if(lot.getHighestBid() == null)
            {
                unsoldLots.add(lot);
            }       
        }
        return(unsoldLots);
    }
}
