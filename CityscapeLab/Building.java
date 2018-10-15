import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Color;
/**
 * Write a description of class Building here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Building
{
    // instance variables - replace the example below with your own
    private int x, y, rX, rY, rows, columns;
    Color win, mat;

    /**
     * Constructor for objects of class Building
     */
    public Building(int loc1, int loc2, int a, int b, int c, int d, Color A, Color B)
    {
        // initialise instance variables
        this.x = a; this.y = b; this.rows = c; this.columns = d;
        this.win = A; this.mat = B; this.rX = loc1; this.rY = loc2;
    }

    /**
     * Draws the Building object when called
     *
     * @param an abstract Graphics2D object
     * @return nothing
     */
    public void draw(Graphics2D g_)
    {
        // put your code here
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                Panel pan = new Panel(rX + i * x, rY + y * j, x, y, win, mat);
                pan.draw(g_);
            }
        }
    }
    
    /**
     * Default move mechanism
     */
    public void move()
    {
        rX += y / 10;
    }
    
    /**
     * Changes the color of the building's self
     * @return nothing
     * @param the new color
     */
    public void setColor(Color A)
    {
        this.mat = A;
    }
    
    /**
     * Changes the color of the building's windows
     * @return nothing
     * @param the new color
     */
    public void setWind(Color A)
    {
        this.win = A;
    }
}
