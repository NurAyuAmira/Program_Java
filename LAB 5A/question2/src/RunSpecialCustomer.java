import java.util.Scanner;
public class RunSpecialCustomer {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter customer id: ");
        String ID = input.nextLine();

        System.out.print("Customer's Purchases for today : $ ");
        double amountPurchases = input.nextDouble();

        SpecialCustomer s = new SpecialCustomer(name, ID, amountPurchases);

        s.setName(name);
        s.setID(ID);

        //display the details using the toString method.
        
        System.out.println("--- Discounts & Points Statement ---");
        System.out.println(s.toString());
    }
   
}
