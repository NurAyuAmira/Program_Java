import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class testacore {
   public static void main(String[]args){
      

       System.out.println ("Enter the test score for 5 students:");
       Scanner input = new Scanner(System.in);

       double [] test = new double [5]; //array

       for(int i=0; i<test.length; i++)
       {
           System.out.print("Student "+(i+1)+":");
           test[i]=input.nextDouble();

           if(test[i]<50){
               System.out.println("Result : Fail");
           }
           else if(test[i]>=50 && test[i]<=69){
            System.out.println("Result : Average");
           }
           else{
            System.out.println("Result : Good");
           }
       }
   } 
}
