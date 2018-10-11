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
        int rectX = (int)(x - 0.1 * size);
        int rectY = (int)(y + 2.5 * size);
        int height = (int)(2.5 * size);
        int width = (int)(0.2 * size);
        
        Rectangle trunk = new Rectangle(height, width, rectX, rectY);
        Ellipse2D.Double top = new Ellipse2D.Double((int)size, (int)size, x, y + size);
        g_.draw(trunk);
        g_.draw(top);
        g_.fill(trunk);
        g_.fill(top);
    }
    
    public void move1()
    {
        y++;
        x++;
    }
}
