import java.util.Scanner;
public class seriesofNumbers {
    public static void main(String[] args)
    {
        System.out.print("How many series of numbers you want to create? ");
        int size = new Scanner(System.in).nextInt();
        int [] numbers = new int [size];
        getValues(numbers);
        getTotal(numbers);
        int high = getHighest(numbers);
        System.out.print("\nThe highest value is: "+high);
        showValues(numbers);
    }

    public static void getValues(int [] values)
    {
        System.out.println("Enter a series of " + values.length +" numbers.");
        for(int j=0; j<values.length; j++)
        {
            values[j] = new Scanner(System.in).nextInt();
        }
    }

    public static void getTotal(int [] values)
    {
        int total = 0;
        for(int j=0; j<values.length; j++)
        {
            total += values[j];
        }
        System.out.println("Total of the numbers is "+total);
    }

    public static int getHighest(int [] values)
    {
        int highest = values[0];
        for(int j=0; j<values.length; j++)
        {
            if(values[j]>highest)
            highest = values[j];
        }
        return highest;
    }

    public static void showValues(int [] values)
    {
        System.out.print("\nThese are the numbers in the array: ");
        for(int j=0; j<values.length; j++)
        {
            System.out.print(values[j] +" ");
        }
    }
}
