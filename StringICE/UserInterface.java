import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * A graphical user interface for the StarWarsName. This class is just responsible for putting up the display on 
 * screen. It then refers to the "Generator" to do all the real work.
 * 
 * @author: Debra Blackman
 * @version 2016.01.01
 */
public class UserInterface
implements ActionListener
{
    private StarWarsName generator;
    private JFrame frame;
    private JLabel firstNameLabel; 
    private JTextField firstNameTextBox;
    private JLabel lastNameLabel; 
    private JTextField lastNameTextBox;
    private JLabel mothersMaidenNameLabel;
    private JTextField mothersMaidenNameTextBox;
    private JLabel placeOfBirthLabel;
    private JTextField placeOfBirthTextBox;
    private JLabel nameLabel;
    private JLabel wishLabel;
    /**
     * Create a user interface.
     * @param engine the name generator.
     */
    public UserInterface(StarWarsName engine)
    {
        generator = engine;
        makeFrame();
        frame.setVisible(true);
    }

    /**
     * Set the visibility of the interface.
     * @param visible true if the interface is to be made visible, false otherwise.
     */
    public void setVisible(boolean visible)
    {
        frame.setVisible(visible);
    }

    /**
     * Make the frame for the user interface.
     * Initalize all the labels
     * Add all the labels and text fields to the frame container
     * Repack the components into the frame container
     */
    private void makeFrame()
    {
        frame = new JFrame("Star Wars Name Generator");
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new GridLayout(6,2));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));
        firstNameLabel = new JLabel("First Name: ");
        firstNameTextBox = new JTextField();
        lastNameLabel = new JLabel("Last Name: ");
        lastNameTextBox = new JTextField();
        mothersMaidenNameLabel = new JLabel("Mother's maiden name: ");
        mothersMaidenNameTextBox = new JTextField();
        placeOfBirthLabel = new JLabel("Your place of birth: ");
        placeOfBirthTextBox = new JTextField();
        nameLabel = new JLabel();
        wishLabel = new JLabel();
        contentPane.add(firstNameLabel);
        contentPane.add(firstNameTextBox);
        contentPane.add(lastNameLabel);
        contentPane.add(lastNameTextBox);
        contentPane.add(mothersMaidenNameLabel);
        contentPane.add(mothersMaidenNameTextBox);
        contentPane.add(placeOfBirthLabel);
        contentPane.add(placeOfBirthTextBox); 
        addButton(contentPane,"Reset");
        addButton(contentPane,"Generate Star Wars Name");
        contentPane.add(nameLabel);
        contentPane.add(wishLabel);
        frame.pack();               // put all the components in proper places in container
    }

    /**
     * Add a button to the button panel.
     * @param panel The panel to receive the button.
     * @param buttonText The text for the button.
     */
    private void addButton(Container panel, String buttonText)
    {
        JButton button = new JButton(buttonText);   //create a new instance of JButton
        button.addActionListener(this);     //make this class the listener for button actions
        panel.add(button);          //add the button to the window frame container
    }

    /**
     * An interface action has been performed.
     * Find out what it was and handle it.
     * @param event The event that has occured.
     */
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        // System.out.println(command);   uncomment to display command on terminal
        if (command.equals("Reset"))
            reset();
        else
        if(command.equals("Generate Star Wars Name"))
            generate();
    }

    /**
     * private method to reset all the input text fields and 
     * output label fields to empty and reset focus to the
     * first name field
     */
    private void reset()    
    {
        firstNameTextBox.setText("");
        lastNameTextBox.setText(""); 
        mothersMaidenNameTextBox.setText("");
        placeOfBirthTextBox.setText("");
        nameLabel.setText("");
        wishLabel.setText("");
        firstNameTextBox.requestFocus();
        frame.pack();
    }

    /**
     * private method to call on the model to generate a Star Wars Name
     * put it in the nameLabel
     * add the nameLabel and wishLabel to the container
     * repack the container
     */
    private void generate()
    {
        String starWarsName = "Your Star Wars Name is " + 
        // call the makeName method of the StarWarsName object 
        // passing the text entered in the textboxes as actual parameters
            generator.getStarWarsName(firstNameTextBox.getText(),
                lastNameTextBox.getText(),
                mothersMaidenNameTextBox.getText(),
                placeOfBirthTextBox.getText()) 
        // the result returned is concatenated with other text         
                + ".  ";
        nameLabel.setText(starWarsName);
        wishLabel.setText("May the Force be with you!");
        frame.pack();    
    }
}

