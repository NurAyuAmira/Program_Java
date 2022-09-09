import java.util.Scanner;
public class que1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            

        //prompt user to enter name
        System.out.print("Enter Customer Name: ");
        String custname = input.nextLine();

        //prompt total meal
        System.out.print("Enter total meal charge: RM ");
        double meal = input.nextDouble();
        final double TAX = 0.0675;
        final double DISC = 0.10;
        
        double a = meal * TAX;
        double d = meal * DISC;
        double totalbill = meal + a - d;

        System.out.println("Bill Details");
        System.out.println("Customer Name: "+ custname);
        System.out.printf("Total meal charge:  RM%.2f\n", meal);
        System.out.printf("Tax Amount: RM%.2f\n", a);
        System.out.printf("Discount: RM%.2f\n", d);
        System.out.printf("Total Bill: RM%.2f\n", totalbill);
    }
    
}

