import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Color;
/**
 * Write a description of class Panel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panel
{
    // instance variables - replace the example below with your own
    private int x, y, rX, rY; Color w, m;

    /**
     * Constructor for objects of class Panel
     */
    public Panel(int loc1, int loc2, int a, int b, Color A, Color B)
    {
        // initialise instance variables
        this.x = a; this.y = b; this.w = B; this.m = A; this.rX = loc1;
        this.rY = loc2;
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
        Rectangle2D.Double self = new Rectangle2D.Double(rX, rY, x, y);
        Rectangle2D.Double wind = new Rectangle2D.Double(rX + x / 5, rY + y / 5, 3 * x / 5, 3 * y / 5);
        
        g_.setColor(m);
        g_.draw(self);
        g_.fillRect(rX, rY, x, y);
        
        g_.setColor(w);
        g_.draw(wind);
        g_.fillRect(rX + x / 5, rY + y / 5, 3 * x / 5, 3 * y / 5);
    }
}
