import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    public boolean isRep = false;
    
    private int comX = 800;
    private int comY = 0;
    private int comSize = 0;
    
    private Color skyCol = Color.blue;
    
    private Color metCol = new Color(20, 0, 255);
    private int colR = 20, colB = 255;
    
    private int k = 0;
    private Color colQ = Color.white, colW = Color.yellow;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    private Color brown = new Color(102, 51, 0);
    private ArrayList<Building> list1 = new ArrayList<Building>();
    private ArrayList<Building> list2 = new ArrayList<Building>();
    
    public void paint(Graphics g)
    {   
        Graphics2D g_ = (Graphics2D) g;
        
        g_.setColor(skyCol);
        g_.fillRect(0, 0, 800, 600);
        
        g_.setColor(metCol);
        g_.fillOval(comX, comY, comSize, comSize);
        
        g_.setColor(Color.lightGray);
        Rectangle2D.Double road = new Rectangle2D.Double(0, 500, 800, 100);
        g_.draw(road);
        g_.fillRect(0, 500, 800, 100);
        
        Random gen = new Random();
        
        for (int i = 0; i < 250; i++)
        {
            int genNum = gen.nextInt(7) + 9;
            Building b0 = new Building (20 * i - k, 500 - genNum * 20, 20, 20, 3, genNum, colQ, colW);
            b0.draw(g_);
        }
        
        for (int i = 0; i < 100; i++)
        {
            int genNum = gen.nextInt(7) + 2;
            Building b0 = new Building (40 * i - 2 * k, 500 - genNum * 40, 40, 40, 3, genNum, colQ, colW);
            b0.draw(g_);
        }
        
        if (comY <= 500)
        {
            for (int i = 0; i < 100; i++)
            {
                Tree tar = new Tree(800 - 50 * i + (int)(2.5 * k), 500, 30, brown, Color.green);
                tar.draw(g_);
            }
        }
        
        else
        {
            for (int i = 0; i < 100; i++)
            {
                Rectangle2D.Double tar = new Rectangle2D.Double (800 - 50 * i + (int)(2.5 * k),480, 30, 20);
                g_.draw(tar);
                g_.setColor(Color.black);
                g_.fillRect(800 - 50 * i + (int)(2.5 * k), 480, 30, 20);
            }
        }
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        Color newCol = new Color(java.lang.Math.min(255, metCol.getRed() + 1), 0, java.lang.Math.max(0, metCol.getBlue() - 1));
        metCol = newCol;
        
        k += 2;
        
        Random gener = new Random();
        comX -= gener.nextInt(11) + 7;
        comY += gener.nextInt(8) + 8;
        comSize++;
        
        skyCol = skyCol.darker();
        if (comY > 500)
        {
            for (int i = 0; i < 10; i++)
            {
                skyCol = skyCol.brighter();
            }
            colQ = Color.black;
            colW = Color.white;
        }
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    /**/
}
