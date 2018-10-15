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
    
    /*
     * The idea is that there is a meteor that strikes a city and blows it apart. Yes, I'm sadistic, but whatever.
     */
    
    public int frames = 0;
    
    /**
     * Whether the meteor hit and exploded or not
     */
    public boolean hasHit = false;
    
    /**
     * The meteor's x-coordinate, initialized to 800
     */
    private int comX = 800;
    
    /**
     * The meteor's y-coordinate, initialized to 0
     */
    private int comY = 0;
    
    /**
     * The meteor's size, initialized to 0
     */
    private int comSize = 0;
    
    // The color of the sky
    private Color skyCol = Color.blue;
    
    /*
     * Colors for the building and the windows, respectively. Inspired by panel
     * housing, apparently with lights on.
     */
    private Color colQ = Color.white, colW = Color.yellow;
    
    //defines "brown", for the trees of course.
    private Color brown = new Color(102, 51, 0);
    
    //defines the meteor
    private Meteor met = new Meteor(800, 0, 0, brown, Color.red);
    
    //This is an innovative solution; after all, the moon is just another meteor.
    private Meteor moon = new Meteor(800, 0, 100, Color.white, Color.blue);
    
    //list of buildings near
    private ArrayList<Building> list1 = new ArrayList<Building>();
    
    //list of buildings far
    private ArrayList<Building> list2 = new ArrayList<Building>();
    
    //list of trees
    private ArrayList<Tree> listTree = new ArrayList<Tree>();
    
    //list of destroyed trees, after meteor was destroyed
    private ArrayList<Stump> listStump = new ArrayList<Stump>();
    
    /**
     * Initializes all the above objects
     */
    
    public CityscapeComponent()
    {
        Random gen = new Random();
        
        for (int i = 0; i < 70; i++)
        {
            int genNum = gen.nextInt(8) + 9;
            Building b0 = new Building (800 - 20 * i, 500 - genNum * 20, 20, 20, 3, genNum, colQ, colW);
            list1.add(b0);
        }
        
        for (int i = 0; i < 40; i++)
        {
            int genNum = gen.nextInt(7) + 2;
            Building b0 = new Building (800 - 40 * i, 500 - genNum * 40, 40, 40, 3, genNum, colQ, colW);
            list2.add(b0);
        }    
        
        for (int i = 0; i < 30; i++)
        {
            Tree tar = new Tree(800 - 50 * i, 540, 30, brown, Color.green);
            listTree.add(tar);
        }
        
        for (int i = 0; i < 30; i++)
        {
            Stump tar = new Stump(800 - 50 * i, 520, 30, 20, Color.black);
            listStump.add(tar);
        }
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */ 
    public void paint(Graphics g)
    {   
        Graphics2D g_ = (Graphics2D) g;
        
        g_.setColor(skyCol);
        g_.fillRect(0, 0, 800, 600);
        
        moon.draw(g_);
        
        for (int i = 0; i < 70; i++)
        {
            list1.get(i).draw(g_);
        }
        
        met.draw(g_);
        
        for (int i = 0; i < 40; i++)
        {
            list2.get(i).draw(g_);
        }
        
        g_.setColor(Color.lightGray);
        Rectangle2D.Double road = new Rectangle2D.Double(0, 500, 800, 100);
        g_.draw(road);
        g_.fillRect(0, 500, 800, 100);
        
        if (!hasHit)
        {
            for (int i = 0; i < 30; i++)
            {
                listTree.get(i).draw(g_);
            }
        }
        
        else
        {
            for (int i = 0; i < 30; i++)
            {
                listStump.get(i).draw(g_);
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
        
        frames++;
        
        if(frames % 2 == 0)
        {
            skyCol = skyCol.darker();
        }
        
        if (met.getMeteorY() >= 500 && met.getMeteorY() <= 516)
        {
            for (int i = 0; i < 10; i++)
            {
                skyCol = skyCol.brighter();
            }
            
            hasHit = true;
            for (int i = 0; i < 70; i++)
            {   
                list1.get(i).setColor(Color.black);
                list1.get(i).setWind(Color.white);
            }
        
            for (int i = 0; i < 40; i++)
            {
                list2.get(i).setColor(Color.black);
                list2.get(i).setWind(Color.white);
            }    
        }
        
        for (int i = 0; i < 70; i++)
        {
            list1.get(i).move();
        }
        
        for (int i = 0; i < 40; i++)
        {
            list2.get(i).move();
        }
        
        for (int i = 0; i < 30; i++)
        {
            listTree.get(i).move();
            listStump.get(i).move();
        }
        
        met.move();
        moon.setMeteorX((int)(10 * frames) + 200);
        moon.setMeteorY((int)((10 * frames) * (10 * frames - 380) / 400) + 100);
        moon.setMeteorTrail(skyCol);
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    /**/
}
