//Chapter 3 Exercise

import java.util.Scanner;
import java.util.Arrays; //kalau nak guna sort method kena guna ni
public class exercise1 {
    public static void main(String[] args)
    {
        methodA();

        int[] arrayB = new int[5]; //declare array mcmni

        methodB(arrayB);
        double average = methodC(arrayB);
        System.out.printf("Average value = %.3f\n", average);
        //ni bila dia da sort
        System.out.print("\nArray values from main method : ");
        for(int i=0 ; i<5 ; i++)
        {
            System.out.print(arrayB[i] + " ");
        }
        
        methodD();
    }

    public static void methodA() 
    {
        System.out.println("All About Methods & Arrays :)");
    }

    public static void methodB(int [] b) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 values : \n");
        //
        for(int i=0 ; i<5 ; i++)
        {
            b[i] = input.nextInt(); //dia akan update
        }
        Arrays.sort(b); //susun increasing
        System.out.println("\nSmallest value = " + b[0]);
        System.out.println("Second largest value = " + b[3]);
        int sum04 = b[0] + b[4];
        System.out.println("Addition of smallest and largest values = " + sum04);



    }

    public static double methodC(int [] c) 
    {
        int totalSum=0;


        for(int i=0 ; i<5 ; i++)
        {
            totalSum = totalSum + c[i]; 
        }

        System.out.println("Sum of array values = " + totalSum);

        double avg = totalSum / 5.0;
        return avg;
    }
    public static void methodD() 
    {
        System.out.print("\n\nI Have Mastered Methods & Arrays :)");
    }
}
