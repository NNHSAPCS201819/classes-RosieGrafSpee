
/**
 * Write a description of class VendingMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VendingMachine
{
    // instance variables - replace the example below with your own
    private int cans;
    private int tokens;
    private int profit;

    public VendingMachine(int cans)
    {
        this.cans = cans;
        this.tokens = 0;
        this.profit = 0;
    }
    
    public void fill(int cans)
    {
        this.cans += cans;
    }
    
    public void insert(int tokens)
    {
        this.tokens += tokens;
        this.profit += tokens;
    }
    
    public void buy()
    {
        if (tokens > 0 && cans > 0)
        {
            cans--; tokens--;
        }
    }
    
    public int getTokens()
    {
        return this.tokens;
    }
    
    public int getCans()
    {
        return this.cans;
    }
    
    public int getProfit()
    {
        return this.profit;
    }
}
