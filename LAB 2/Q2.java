//Nur Ayu Amira Binti Idris 1201200722
//Lab 2, TL3L, Question 2
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //Prompt enter the number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        double totalBMI=0;

        for(int i=0; i<n; i++){
            System.out.println("Enter the weight and height for Student " + (i+1) + ":");
           
            System.out.print(" Weight (LBS): ");
            double w = input.nextDouble();

            System.out.print("Enter the Height (IN): ");
            double h = input.nextDouble();

           totalBMI = totalBMI + (w * 0.45359237) / (h * 0.0254 * h * 0.0254);
            //totalBMI = totalBMI + (w * 0.453592)/Math.pow(h*0.0254,2);
        }

        double avgBMI = totalBMI/n;

        System.out.printf("\n Average BMI: %.2f\n", avgBMI);

        if(avgBMI < 18.5){
            System.out.println("Majority of the students of this class are: Underweight");
        }
        else if(avgBMI >=18.5 && avgBMI<25){
            System.out.println("Majority of the students of this class are: Normal");
        }
        else if(avgBMI >=25 && avgBMI<30){
            System.out.println("Majority of the students of this class are: Overweight");
        }
        else{
            System.out.println("Majority of the students of this class are: Obese");
        }

    }
}
