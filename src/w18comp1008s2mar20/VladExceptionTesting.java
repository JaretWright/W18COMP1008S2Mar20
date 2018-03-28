package w18comp1008s2mar20;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JWright
 */
public class VladExceptionTesting
{
    public static void main(String[] args)
    {
        try
        {
            firstMethod();
        } catch (VladException ex)
        {
            System.err.println(ex.getMessage());
        }
        secondMethod();
    }
    
    public static void firstMethod() throws VladException
    {
        throw new VladException();        
    }
    
    public static void secondMethod()
    {
        try
        {
            throw new VladException("Vlad is a good sport");
        } catch (VladException ex)
        {
            System.err.println(ex);
        }
    }
}
