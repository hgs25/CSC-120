import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author Juan Valenzuela
 * @version 01.28.2015
 */
public class Club
{
    private ArrayList<Membership> members;
    /**
     * Constructor for Club class.
     * stores members into an array.
     */
    public Club()
    {
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
       members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return(members.size());
    }
}
