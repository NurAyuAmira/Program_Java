import java.util.Scanner;
public class test_Lab3 
{
    public static void display()
    {
        System.out.println("\n======================");
        System.out.println("MENU RM Converter");
        System.out.println("======================");
        System.out.println("\t1. Convert to Singapore Dollar [SGD]");
        System.out.println("\t2. Convert to Indonesian Rupiah [IDR]");
        System.out.println("\t3. Convert to Thai Bath [THB]");
        System.out.println("\t0. Exit Program");
    }

    public static double toSGD(double a) {
        return a * 0.32;
    }

    public static double toIDR(double a) {
        return a * 3422.85;
    }

    public static double toTHB(double a) {
        return a * 7.87;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double conversion = 0;
        String currency = "";


        int choice;
        do {
             display();

            System.out.print("\nPlease enter your choice : ");
            choice = input.nextInt();
            if (choice == 0)
            {
                System.out.println("Program end.");
                System.exit(0);
            }

            else
            {
                System.out.print("\nYour number is not in the menu!\n");

                System.out.print("\nPlease enter your choice : ");
                choice = input.nextInt();
            }

            System.out.print("Please enter the RM amount : ");
            int amount = input.nextInt();

            if (choice == 1) {
                currency = "SGD";
                conversion = toSGD(amount);
            }
            else if (choice == 2) {
                currency = "IDR";
                conversion = toIDR(amount);
            }
            else if (choice == 3) {
                currency = "THB";
                conversion = toTHB(amount);
            }

            System.out.printf("\nRM " + amount + " is equivalent to " + currency + " %.2f", conversion);

        }while (choice != 4);

    }

}

