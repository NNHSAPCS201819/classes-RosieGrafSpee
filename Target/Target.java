import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;

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
            Ellipse2D.Double x = new Ellipse2D.Double(2 * radius, 2 * radius, 300 - radius, 300 - radius);
            radius += width;
            g_.draw(x);
        }
    }
}
