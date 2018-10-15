import java.awt.geom.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
/**
 * Write a description of class Stump here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stump
{
    // instance variables - replace the example below with your own
    private int rX, rY, x, y;
    Color col;
    
    /**
     * Constructor for objects of class Stump
     */
    public Stump(int rX, int rY, int x, int y, Color col)
    {
        this.rX = rX; this.rY = rY; this.x = x; this.y = y; this.col = col;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw(Graphics2D g_)
    {
        // put your code here
        g_.setColor(col);
        g_.fillRect(rX, rY, x, y);
    }
        
    public void move()
    {
        rX += 5;
    }
}
