import java.util.Scanner;
public class que2 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        final double SALARY = 2500.00;

        

        //promt user to enter sales
        System.out.print("Enter Sales Amount: RM ");
        double sales = input.nextDouble();
       
        double commission;
        


        if(sales <= 10000.00)
        {
          commission=sales * 5/100;
        }
        else if(sales >10000.00 && sales<= 14999.99)
        {
             commission=sales * 10/100;
        }
        else if(sales >15000.00 && sales<=19999.99)
        {
             commission=sales * 12/100;
        }
        else 
        {
             commission=sales * 15/100;
        }

        System.out.printf("Commission amount:  RM%.2f\n", commission);
        System.out.printf("Monthly Salary:  RM%.2f\n", SALARY + commission);
    }
}
