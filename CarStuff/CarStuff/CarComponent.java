import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class CarComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarComponent extends JComponent
{
    // instance variables - replace the example below with your own
    public void paint(Graphics g)
    {
        Graphics2D g_ = (Graphics2D) g;
        Car car = new Car(0,0);
        
        car.draw(g_); 
    }
}
