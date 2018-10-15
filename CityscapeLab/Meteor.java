import java.awt.geom.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class Meteor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Meteor
{
    // instance variables - replace the example below with your own
    private int x, y, size;
    Color col, trailCol;
    
    private ArrayList<Integer> histX = new ArrayList<Integer>();
    private ArrayList<Integer> histY = new ArrayList<Integer>();
    
    /*
     * https://stackoverflow.com/questions/10477628/arraylist-of-int-array-in-java apparently have to use Integer class instead of int.
     * I only know ArrayList as an analogy to STL C++ Vector.
     */

    /**
     * Constructor for objects of class Meteor
     */
    public Meteor(int x, int y, int size, Color col, Color trailCol)
    {
        // initialise instance variables
        this.x = x; this.y = y; this.size = size; this.col = col; this.trailCol = trailCol;
        histX.add(x); histY.add(y);
    }

    /**
     * Draws the meteor when called
     * 
     * @param an abstract Graphics2D object. 
     * @return nothing
     */
    public void draw(Graphics2D g_)
    {
        // put your code here
        g_.setColor(trailCol);
        
        for (int i = -size / 2; i < size / 2; i++)
        {
            for (int j = 0; j < 5 && j < histX.size() - 1; j++)
            {
                g_.drawLine(histX.get(j), histY.get(j) + i, histX.get(j + 1), histY.get(j + 1) + i);
            }
        }
        g_.setColor(col);
        g_.fillOval(x - size / 2, y - size / 2, size, size);
    }
    
    /**
     * @return the color of the meteor's y-coordinate
     * @param nothing
     */
    public int getMeteorY()
    {
        return this.y;
    }
    
    /**
     * @return the color of the meteor's x-coordinate
     * @param nothing
     */
    public int getMeteorX()
    {
        return this.x;
    }
    
    /**
     * @return the color of the meteor's tail
     * @param nothing
     */
    public Color getMeteorTail()
    {
        return this.trailCol;
    }
    
    /**
     * @return the color of the meteor's self
     * @param nothing
     */
    public Color getMeteorCol()
    {
        return this.col;
    }
    
    /**
     * Changes the x-coordinate of the meteor
     * @return nothing
     * @param the new x-coordinate
     */
    public void setMeteorX(int x)
    {
        this.x = x;
    }
    
    /**
     * Changes the y-coordinate of the meteor
     * @return nothing
     * @param the new y-coordinate
     */
    public void setMeteorY(int y)
    {
        this.y = y;
    }
    
    /**
     * Changes the color of the meteor's self
     * @return nothing
     * @param the new color
     */
    public void setMeteorCol(Color x)
    {
        this.col = x;
    }
    
    /**
     * Changes the color of the meteor's trail
     * @return nothing
     * @param the new color
     */
    public void setMeteorTrail(Color x)
    {
        this.trailCol = x;
    }
    
    /**
     * The default move mechanism.
     */
    public void move()
    {
        Random gener = new Random();
        x -= gener.nextInt(11) + 7;
        y += gener.nextInt(8) + 8;
        size++;
        
        histX.add(0, x);
        histY.add(0, y);
    }
}
