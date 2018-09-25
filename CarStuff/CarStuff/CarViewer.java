import javax.swing.JFrame;
/**
 * Write a description of class CarViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarViewer
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CarComponent component = new CarComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
