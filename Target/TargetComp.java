import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Scanner;

/**
 * Write a description of class TargetComp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TargetComp extends JComponent
{
    // instance variables - replace the example below with your own
    public void paint(Graphics g)
    {
        /**
        System.out.print("Please input the radius of the innermost circle and the number of circles: ");
        Scanner s = new Scanner(System.in);
        
        //int x = s.nextInt();
        //int y = s.nextInt();*/
        
        Graphics2D g_ = (Graphics2D) g;
        Target tar = new Target(30, 5);
        tar.draw(g_);
    }
}
