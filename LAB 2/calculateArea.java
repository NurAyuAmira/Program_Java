import java.util.Scanner;

public class calculateArea {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.142;

        System.out.println("Choose the calculation");
        System.out.println("1.Calculate Area of Rectangle");
        System.out.println("1.Calculate Area of Circle");
        System.out.println("3.Exit the program");

        System.out.print("Please enter your choice: ");
        int choose =input.nextInt();
          
        double area;
        while(choose !=3) //kalau pilih no 3 dan keatas dia akan execute 
        {
            switch(choose)
            {
                case 1:
                System.out.print("Enter width: ");
                double width = input.nextDouble();
                System.out.print("Enter length: ");
                double length = input.nextDouble();
                
                area = width * length;
                break;

                case 2:
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();

                area = PI*radius*radius;
                break;

                default: 
                System.out.println("Invalid input ");
                area = 0;
            }

            
            System.out.printf("The area is: %.2f", area);
            System.out.print("\nPlease enter your choice: ");
            choose = input.nextInt();
        }
            System.out.println("Program End");
    }
}
