import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;

public class Car
{
    // instance variables - replace the example below with your own
    private int x, y;

    /**
     * Constructor for objects of class Car
     */
    public Car(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics2D g_)
    {
        Rectangle body = new Rectangle (x, y + 10, 60, 10);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(x + 40, y + 20, 10, 10);
        
        Point2D.Double r1 = new Point2D.Double(x + 10, y + 10);
        Point2D.Double r2 = new Point2D.Double(x + 20, y);
        Point2D.Double r3 = new Point2D.Double(x + 40, y);
        Point2D.Double r4 = new Point2D.Double(x + 50, y + 10);
        
        Line2D.Double front = new Line2D.Double(r1, r2);
        Line2D.Double roof = new Line2D.Double(r2, r3);
        Line2D.Double rear = new Line2D.Double(r3, r4);
        
        g_.draw(body);
        g_.draw(frontTire);
        g_.draw(rearTire);
        g_.draw(front);
        g_.draw(roof);
        g_.draw(rear);
    }
}
