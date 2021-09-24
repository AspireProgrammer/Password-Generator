
/**
 * Generates random passwords with custom length and sets.
 *
 * @author Rebekah Shi
 * @version (1/12/2020)
 */
import java.util.Scanner;

public class PasswordGenerator
{
    public static void main(String []args)
    {
        //Menu output
        System.out.println("Menu Password Generation");
        System.out.println();
        System.out.println("[1] Lowercase Letters ");
        System.out.println("[2] Lowercase & Uppercase Letters");
        System.out.println("[3] Lowercase, Uppercase, and Numbers");
        System.out.println("[4] Lowercase, Uppercase, Numbers, & Punctuation");
        System.out.println();
        
        //User input
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a number corresponding to the menu to pick the set for you password: ");
        int setNum = in.nextInt();
        System.out.println("Please enter the length of your password: ");
        int length = in.nextInt();
        
        String passwordA = "";
        
        for(int l = 0; l < length; l++)
        {
            if(setNum == 1)
            {
                char random = (char)((int)(Math.random()*(25) + 97)); 
                passwordA += random;
            }
            else if(setNum == 2)
            {
                char random;
                if(Math.random() >= 0.5)
                {
                random = (char)((int)(Math.random()*(25)+65));
                }
                else
               {
                random = (char)((int)(Math.random()*(25)+97));
               }
               passwordA += random;
            }
            else if(setNum == 3)
            {
                char random;
                int randomList = (int)(Math.random()*(62));
                if(randomList >= 0 && randomList <= 9)
                {
                   random = (char)(randomList + 48);
                }
                else if(randomList >= 10 && randomList <= 35)
                {
                    random = (char)(randomList + 55);
                }
                else
                {
                    random = (char)(randomList + 61);
                }
                passwordA += random;    
            }
            else 
            {
                 char random =  (char)((int)(Math.random()*94)+33);
                 passwordA += random;
            }
        }
        //Output
        System.out.println(passwordA);
        
    }
}
