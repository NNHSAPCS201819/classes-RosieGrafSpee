import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @Admiral Leberecht Maass
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int no_frames = 120;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        
        frame.setSize(800/* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        
        System.gc();
        frame.setVisible(true);
        
        System.out.println("We are at war with Audrey Mendrys;");
        System.out.println("Be prepared.");
        
        System.out.println("");
        System.out.println("Heir dir im Siegerkranz!!!");
        
        // animate the cityscape
        
        for( int seconds = 0; seconds < no_frames; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 500 /*time per frame, .5 seconds*/ );
        }
        
    }

}
