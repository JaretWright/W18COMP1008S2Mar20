package w18comp1008s2mar20;

/**
 *
 * @author JWright
 */
public class W18COMP1008S2Mar20
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        firstMethod();
        Thread.dumpStack();
    }
    
    public static void firstMethod()
    {
        secondMethod();
        Thread.dumpStack();
    }
    
    public static void secondMethod()
    {
        Thread.dumpStack();
    }
    
}
