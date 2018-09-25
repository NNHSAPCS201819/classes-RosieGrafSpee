import javax.swing.JFrame;

/**
 * Write a description of class TargetView here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TargetView
{
    // instance variables - replace the example below with your own
    public static void main (String[] args)
    {
        JFrame view = new JFrame();
        view.setSize(600, 600);
        view.setTitle("target");
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComp component = new TargetComp();
        view.add(component);
        
        view.setVisible(true);
    }
}
