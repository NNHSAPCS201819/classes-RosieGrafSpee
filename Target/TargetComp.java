import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

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
        Graphics2D g_ = (Graphics2D) g;
        Target tar = new Target(50, 4);
        tar.draw(g_);
    }
}
