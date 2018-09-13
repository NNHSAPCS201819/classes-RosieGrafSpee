import org.junit.Assert;
/**
 * This class models a car
 *
 * @author Rosiegrafspee
 * @version 0.0.00
 */
public class Car
{
    /* instance variables - replace the example below with your own
     * 
     * specify the visibility of instance variables
     * public : accessible by anyone
     * private: only accessible by class. The entire one.
     * 
     * Don't forget to specify type and name!
     */
    private double fuelEff; // in units of liters per kilometer
    private double fuelTank; // in units of liters
    private String plate; 

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        fuelEff = 1 / 30;
        fuelTank = 0;
    }
    
    public Car(int fuel, int fuel_eff)
    {
        this.fuelEff = fuel_eff;
        this.fuelTank = fuel;
    }
    
    /*
     * When defining a method, specify
     *  The visibility
     *  The return type
     *  The method name
     *  The parameters and their types
     *
     */
    
    /**
     * Drives the car the specified distance, in kilometers, consuming fuel
     * 
     * @param dist the distance im km car drives
     */
    
    public void drive (double dist)
    {
        
    }
    
    /**
     * Add some fuel to the car's tank
     * 
     * @param amount, in liters, to add to the car's tank
     */
    
    public void addFuel(double amount)
    {
        
    }
    
    /**
     * Returns the amout of fuel in this car's tank
     * 
     * @return the amount of fuels in liters, in this car's tank    
     */
    
    public double getFuel()
    {
        return fuelTank;
    }
    
    /**
     * Sets the license plate to the specified value
     * 
     * @param plate the license plate for this car
     */
    
    public void setPlate (String plate)
    {
        
    }
    
    public String getPlate (String plate)
    {
        return this.plate;
    }
    
    public void testAddFuel()
    {
        Car testCar = new Car(0, 50);
        testCar.addFuel(10);
        double amount = testCar.getFuel();
        org.junit.Assert.assertEquals(10, amount, 1e-6);
    }
}
