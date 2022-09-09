/*Nur Ayu Amira Binti Idris
1201200722, , TL3L*/
import java.util.Scanner;
public class question1 {
    public static int getTotal(int s) {
        int sum = 0;
        sum = sum + s;
        return sum;
    }

    public static double getAverage(double a){
        double average;
        average = a/3;
        return average;
    }

    public static void printAll(double a, double av){
        System.out.printf("\nThe total score of the quizzes is = %.0f", a);
        System.out.printf("\nThe average of score is = %.2f", av);
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        for(int i=0; i<3; i++)
        {
            System.out.print("Enter score for Quiz " + (i+1) + ":");
            int quiz = input.nextInt();
            
            sum = sum +getTotal(quiz);
        }
        average = getAverage(sum);
        printAll(sum, average);
    }

   
}
