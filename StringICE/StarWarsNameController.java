
/**
 * StarWarsNameController is the controller of the
 * model-view-controller design.
 * To begin, create an instance of this class
 * 
 * DO NOT CHANGE THIS CLASS AT ALL
 * 
 * @author Debra Blackman 
 * @version January 3, 2016
 */  
public class StarWarsNameController
{
    
    private StarWarsName name;      //the model for the Star Wars name
    private UserInterface gui;      //the graphical user interface

    /**
     * Create a new generator and show it.
     */
    public StarWarsNameController()
    {
        name = new StarWarsName();
        gui = new UserInterface(name);
    }

    /**
     * In case the window was closed, show it again.
     */
    public void show()
    {
        gui.setVisible(true);
    }
}

