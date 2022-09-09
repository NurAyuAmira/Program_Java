//Lab 6 eg 3: Numbers3.java
import java.util.Scanner;
import java.util.InputMismatchException;
public class Numbers3
{
    public static void main (String [] arg)
    {
        boolean contLoop = true;
        do
        {
            try
            {
                System.out.print("\nType a number:");
                double n = new Scanner(System.in).nextDouble();

                if(n>0)
                System.out.println(n +" is a positive number");
                else if(n<0)
                System.out.println(n +" is a negative number");
                else
                System.out.println(n +" is a zero number");

                System.out.print("\nEnter an integer numerator:");
                int x = new Scanner(System.in).nextInt();

                System.out.print("Enter an integer denominator:");

                int y = new Scanner(System.in).nextInt();

                int result = x / y;
                System.out.printf("Result: %d / %d = %d\n", x,y,result);
                System.out.print("\nType your name:");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Hello "+ name);
                contLoop = false;
            }
            
            catch(InputMismatchException e)
            {
                System.out.println("Exception type:" + e);
                System.out.println("Wrong input.You must enter anumber.Please try again.");
            }

            catch(ArithmeticException e)
            {
                System.out.println("Exception type:" + e);
                System.out.println("Cannot divide by zero.Please try again.");

            }
        } while(contLoop);
    }
}
