import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Color;

/**
 * Write a description of class Target here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Target
{
    // instance variables - replace the example below with your own
    private int width;
    private int noRings;
    
    public Target(int x, int r)
    {
        this.width = x;
        this.noRings = r;
    }
    
    public void draw(Graphics2D g_)
    {
        int radius = noRings * width;
        for (int i = 0; i < noRings; i++)
        {
                Ellipse2D.Double x = new Ellipse2D.Double(300 - radius, 300 - radius, 2 * radius, 2 * radius);
                g_.draw(x);
            if (i % 2 == 0)
            {
                g_.setColor(Color.white);
            }
            
            if (i % 2 == 1)
            {
                g_.setColor(Color.black);
            }
            g_.fillOval(300 - radius, 300 - radius, 2 * radius, 2 * radius);
            radius -= width;
        }
    }
}
