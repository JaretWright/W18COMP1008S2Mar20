package w18comp1008s2mar20;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class DivideZeroExceptionHandling
{
    public static int quotient(int numerator, int denominator)
    {
        return numerator / denominator;
    }
    
    public static void main(String[] args)
    {
        try{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the numerator: ");
            int numerator = keyboard.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = keyboard.nextInt();

            System.out.printf("Result: %d/%d=%d%n", numerator, denominator, 
                                        quotient(numerator, denominator));
        }
        catch (InputMismatchException mismatchException)
        {
            System.err.println(mismatchException);
        }
    }
}
