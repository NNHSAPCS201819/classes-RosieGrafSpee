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
    int x, y, size;
    Color bark, leaves;
    
    public Tree(int x, int y, int size, Color bark, Color leaves)
    {
        this.x = x; this.y = y; this.size = size; this.bark = bark; this.leaves = leaves;
    }
    
    public void draw(Graphics2D g_)
    {
        Ellipse2D.Double top = new Ellipse2D.Double(x - 1.5 * size, y - 6.5 * size, 3 * size,3 * size);
        Rectangle2D.Double bottom = new Rectangle2D.Double(x - 0.5 * size, y - 5 * size, size, 5 * size);

        g_.setColor(bark);
        g_.draw(bottom);
        g_.fillRect((int)(x - 0.5 * size), (int)(y - 5 * size), size, 5 * size);
        
        g_.setColor(leaves);
        g_.draw(top);
        g_.fillOval((int)(x - 1.5 * size), (int)(y - 6.5 * size), 3 * size, 3 * size);
    }
    
    public void move()
    {
        x += 5;
    }
}
