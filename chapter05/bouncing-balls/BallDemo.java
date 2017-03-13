import java.awt.Color;
import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private Random rand;
    private ArrayList <BouncingBall> balls;
    
    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
        rand = new Random();
    }

    /**
     * Simulate bouncing ball(s)
     * @param numberOfBalls : enter how many balls are being bounced
     */
    public void bounce(int numberOfBalls)
    {
        //arraylist that will hold the created balls
        balls = new ArrayList<BouncingBall>();
        
        int ground = 400;   // position of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        // create and show the balls        
        for(int i=0; i<numberOfBalls; i++)
        {
            //BouncingBall(startXCoordinate, startYCoordinate, diameter, color(r, g, b), ground, canvas)
            BouncingBall ball = new BouncingBall(rand.nextInt(500), rand.nextInt(250), 5+rand.nextInt(100), 
                                                    new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)), 
                                                    ground, myCanvas);
            ball.draw();
            balls.add(ball); //add created ball to the array list.
        }

        // make them bounce
        boolean finished =  false;
        while((!finished) && (numberOfBalls>0))
        {
            myCanvas.wait(50);           // small delay
           for(BouncingBall ball:balls)
           {
                ball.move();
                // stop once ball has travelled a certain distance on x axis
                if(ball.getXPosition() >= 550) 
                {
                    finished = true;
                }
           }
        }
    }   
}
