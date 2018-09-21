

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VMTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VMTest
{
    public static void main(String[] args)
    {
        VendingMachine no = new VendingMachine(5);
        assertEquals(no.getCans(), 5);
        
        no.insert(5);
        assertEquals(no.getTokens(), 5);
        assertEquals(no.getProfit(), 5);
        
        no.fill(5);
        assertEquals(no.getCans(), 10);
        
        for (int i = 0; i < 6; i++)
        {
            no.buy();
        }
        
        assertEquals(no.getCans(), 5);
    }
}
