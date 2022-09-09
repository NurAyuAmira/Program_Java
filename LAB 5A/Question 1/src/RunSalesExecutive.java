import java.util.Scanner;
public class RunSalesExecutive  {
    public static void main(String [] args){

        double sales [] = new double [0];
        int peerReview [] = new int [3];
        double avgSales = 0, avgReview = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Staff Name: ");
        String name = input.nextLine();

        System.out.print("Enter Staff ID: ");
        String ID = input.nextLine();

        System.out.print("Enter basic pay: $ ");
        double basicPay = input.nextDouble();

        SalesExecutive s = new SalesExecutive(name, ID, basicPay, sales, peerReview, avgSales, avgReview);

        System.out.println("\n\n\nPart 1: Sales Collections");
        System.out.print("How many months? ");
        int months = input.nextInt();

        double salescollect [] = new double [months];

        System.out.println("Enter the collection of sales for each month: ");
        for(int i=0; i<salescollect.length; i++){
            System.out.print("Month " + (i+1) + " = $ ");

            //call method setSales() and pass array of sales entered by user earlier
            salescollect [i] = input.nextInt();
            s.setSales(salescollect);

        }
        System.out.printf("Average sales: $%.2f", s.getAverageSales());


        System.out.println("\n\n\nPart 2: Peer Review (3 peers) ");
        System.out.println("Enter the assessment point from 3 peers: [1-5] ");

        for(int i=0; i<peerReview.length; i++){
            System.out.print("Peer "+(i+1)+ " = ");
            peerReview[i] = input.nextInt();
            s.setPeerReview(peerReview);
        }
        System.out.printf("Average Review Points from Peers: %.2f", s.getAveragePeerReview());

        System.out.println("\n\n\nCalculating Bonus & Total Salary of Sales Executive ");
        System.out.println("Staff ID: "+ s.getID());
        System.out.println("Staff Name: "+ s.getName());
        System.out.printf("Staff Salary: $ %.2f", s.getSalary());
        System.out.printf("\nPercentage of the sales commission: %.1f%%",(s.getCommissionRate()*100));
        System.out.printf("\nBonus percentage from peer reviews: %.1f%%", (s.getPeerReviewRate()*100));

        System.out.printf("\nBonus amount from peer reviews: $%.2f",(s.getCommissionRate()*basicPay));
        System.out.printf("\nBonus amount from sales collection: $%.2f",(s.getPeerReviewRate()*basicPay));

        System.out.printf("\nTotal Salary: $%.2f",(s.getSalary()+(s.getCommissionRate()*basicPay + s.getPeerReviewRate()*basicPay)));

        
    }
}
