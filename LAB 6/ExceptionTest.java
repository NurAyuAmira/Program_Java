import java.util.Scanner;
public class ExceptionTest
{
  public static void main(String [] args)
  {
  try {
    getChildAge();
    System.out.println("Enter your annual income?"); double 
    income = new Scanner(System.in).nextDouble();
    if(income<0)
    throw new RuntimeException("Cannot be negative");
    System.out.println("Enter the given security code:"); 
    String code = new Scanner(System.in).next(); 
    System.out.println("Code:"+ Integer.parseInt(code));
  }
  catch(NumberFormatException e)
  { System.out.println("Error format:" +e.getMessage()); }
  catch(Exception e)
  { System.out.println("Error: "+e.getMessage()); }
  }
  public static void getChildAge()
  {
  Try
  {
  System.out.println("How many children you have?"); 
  int child = new Scanner(System.in).nextInt();
  int [] ageMyChild = new int[child];
  System.out.println("Enter your children's age:"); 
  for(int i=0;i<=ageMyChild.length;i++)
  ageMyChild[i]=new Scanner(System.in).nextInt();
  }
  catch(ArrayIndexOutOfBoundsException e)
  { 
   System.out.println("Something is wrong");
  }
  catch(InputMismatchException e)
  { 
   System.out.println("Wrong data input");
  }
   }
}
