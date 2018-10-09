import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Color;
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private double x, y, size;
    private Color bark, leaves;

    /**
     * Constructor for objects of class Tree
     */
    public Tree(double x, double y, double size, Color bark, Color leaves)
    {
        // initialise instance variables
        this.x = x; this.y = y; this.bark = bark; this.leaves = leaves; this.size = size;
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
        Rectangle trunk = new Rectangle(1.5 * size, 0.2 * size, x - 0.1 * size, y + 1.5 * size());
        Ellipse2D.Double top = new Ellipse2D.Double(300, 300, 2, 2);
        g_.draw(y);
        g_.draw(x);
    }
}
