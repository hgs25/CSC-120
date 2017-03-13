import java.awt.Color;
import java.util.Random;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for (int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));
            
            pen.randomSquiggle();
        }
    }
    
    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
    
    /**
     * draws a triangle
     */
    public void drawTriangle()
    {
        Pen pen = new Pen(100,100, myCanvas);
        pen.setColor(Color.BLUE);
        for(int i=0; i<3; i++)
        {
            pen.move(100);
            pen.turn(120);
        }
    }
    
    /**
     * draws a pentagon
     */
    public void drawPentagon()
    {
        Pen pen = new Pen(170,170,myCanvas);
        for(int i=0; i<5; i++)
        {
            pen.move(100);
            pen.turn(72);
        }        
    }
    
    /**
     * draws a regular polygon with n sides.
     * @param n : the number of sides in the polygon
     */
    public void drawPolygon(int n)
    {
        Pen pen = new Pen(100,100,myCanvas);
        for(int i=0; i<n; i++)
        {
            pen.move(50);
            pen.turn(360/n);
        }
    }
    
     
    /**
     * draws a spiral
     */
    public void spiral()
    {
        Pen pen = new Pen(25,25,myCanvas);
        pen.turnTo(90);
        int n = 200;
        for(int i=0; i<3; i++)
        {
            pen.move(n);
            pen.turn(270);
        }
        n=n-10;
        for(int i=0; i<40; i++)
        {            
            pen.move(n);
            pen.turn(270);
            n=n-5;
        }
    }
    
    /**
     * draws a spiral
     * @param n
     */
    public void spiralAnotherWay(int n)
    {
        Pen pen = new Pen(250,200,myCanvas);
        int width = 10;
        pen.turnTo(90);
        for(int j=0; j<n; j++)
        {
            pen.move(width);
            pen.turn(90);
            pen.move(width);
            pen.turn(90);
            width+=10;
        }
    }
    
    public void doodle()
    {
        myCanvas.drawString("My Doodle", 50, 50);
        myCanvas.setForegroundColor(Color.RED);
        myCanvas.draw(new java.awt.Rectangle(100,100,50,50));
        myCanvas.setForegroundColor(Color.BLUE);
        myCanvas.draw(new java.awt.geom.Ellipse2D.Double(100,100,50,50));
    }
}
