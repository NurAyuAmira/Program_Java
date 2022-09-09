import java.util.Scanner;
public class TestWareHouseSales {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String ID;
        int totalOfDay;

        System.out.print("Enter Warehouse Sales ID: ");
        ID = input.nextLine();

        System.out.print("How many Day of Sales Recorded: ");
        totalOfDay = input.nextInt();

        Warehouse w = new Warehouse(ID, totalOfDay);

        int [] qtyBooks = new int [totalOfDay];

        for(int i = 0; i<qtyBooks.length; i++){
            System.out.print("Sales Recorded on Day "+ (i+1)+ " (Books Quantity): ");
            qtyBooks [i] = input.nextInt();
        }

        w.setBQuantPerDay(qtyBooks);
        System.out.println("\n The Record of Warehouse Sales Perfomance");
        System.out.println("-------------------------------------------");
        System.out.println("Warehouse Sales ID: " + w.getID());
        System.out.println("Sales Recorder for: " + w.getTotalDay()+ " days");
        System.out.printf("Sales Achieved: RM %.2f", w.getSalesAchieve());
        System.out.println("\n Score Card: " + w.getScoreCard());

    }
}
