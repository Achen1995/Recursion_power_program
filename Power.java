/**
 * Addison Chen
 * The challenge question is called Recursive power method. In which the goal of the program is to write a method
 * using recursion to raise a number to a power.  By accepting two argument the base and the exponent.  The question
 * only asking for only positive integers.
*/
import java.util.Scanner;

public class Power

{
    public static void main(String[] args)

    {
        //Declaring the variables
        int base;
        int expon;
        int result;
        
        //Calling scanner object name Keyboard 
        Scanner Keyboard = new Scanner(System.in);
        
        //Printing these strings as the introduction when running the program
        System.out.print("This is the Recursive power program~");
        System.out.println("Use integers only.");

        //This will output the string and also get the base
        System.out.print("Enter the base you would like raised to a power: ");

        base = Keyboard.nextInt();

        //This will output the string and also get the exponent
        System.out.print("Enter the power you would like it raised to: ");

        expon = Keyboard.nextInt();

        result = pow (base,expon);

        System.out.println(base + " raised to the " + expon + " is " + result);
        Keyboard.close();
    }
    
    // Computes and returns to the formula of base^exp
    public static int pow(int base, int expon)
    {
        //In case the exponent is 0, then the if statement below will set the pow to 1
        if (expon == 0)

            return 1;

        //otherwise it will compute pow recursively
        return base * pow(base, expon-1);
  }
}
