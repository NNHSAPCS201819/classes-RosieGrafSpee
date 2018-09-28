        import java.util.Scanner;

/**
 * Write a description of class Thing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thing
{
    public static void main (String[] args)
    {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a number: ");
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    System.out.println(n);
    
    reader.close();
    }
}
