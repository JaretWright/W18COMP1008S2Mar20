package w18comp1008s2mar20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JWright
 */
public class FileReader
{
    public static void displayFile() throws FileNotFoundException
    {
        File fileToRead = new File("build.xml");
        Scanner scanner = new Scanner(fileToRead);
        
        while(scanner.hasNext())
        {
            System.out.println(scanner.nextLine());
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            displayFile();
        } catch (FileNotFoundException ex)
        {
            System.err.println(ex);
        }
    }
}
