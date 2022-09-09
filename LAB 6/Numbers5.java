//Lab 6 e.g. 5: Numbers5.java
public class Numbers5
{
public static void main (String [] arg)
{
    int [] arrayNo = {40,67,21,34};
    try
    {
        displayArray(arrayNo); //call method
        //change value
        arrayNo[0]= arrayNo[0]+arrayNo[1]; System.out.println("First number is"+arrayNo[0]);
    }
   
    finally
    {
        System.out.println("Thank you.");}
    }
    public static void displayArray(int [] list)
    {
        System.out.println("The list of numbers:");
        try
        {
            for(int i=0;i<=4; i++) 
            System.out.println(list[i]);
        }
        catch(NullPointerException e) //not a good example
        {
         System.out.println("Catched!");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Could not print the array of the index.");
            System.out.println(e);
        }
    }
}
