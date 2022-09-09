//Lab 6 eg 2: Numbers2.java
import java.util.Scanner;
import java.util.InputMismatchException;
public class Numbers2
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
                    System.out.print("\nType your name:");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Hello "+ name);
                    contLoop = false;
                }



                catch(InputMismatchException e)
                {
                    //You may delete the // to see how the object of the exception (e) is displayed

                    //System.out.println("Exception type is:" + e);
                    System.out.println("Wrong input.You must enter a number. Please try again.");
                }
        }while(contLoop);
   }
}
