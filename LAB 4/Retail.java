import java.util.Scanner;
public class Retail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String name = input.nextLine();
        System.out.print("Enter price per unit: RM ");
        double price = input.nextDouble();
        System.out.print("Quantity Sold: ");
        int qty = input.nextInt();

        RetailItem object = new RetailItem(name,price,qty);

        System.out.println("Item \t\t Quantity \t Price(RM) ");
        System.out.println("----------------------------------------");
        System.out.println(object.getItemName()+"\t"+object.getQuantity()+"\t"+object.getPrice());
        System.out.printf("Total price \t:\tRM %.2f", object.getTotalPrice());
        System.out.printf("Discount\t:\t %.1f",object.getDiscount()*100);
        System.out.printf("Total Payment\t:\t %.2f",object.getTotalPayment());
        
    }
}


 class RetailItem {
    private String itemName;
    private double price, totalPrice, discount, totalPayment;
    private int quantity;


    public RetailItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPrice(){
      return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getTotalPrice(){
        return (quantity*price);
    }

    public double getDiscount(){
        double discount = 0;

        if(quantity<10){
            
        }
        else if(quantity >=10 && quantity<20){
            discount=0.20;
        }
        else if(quantity >=20 && quantity <50){
            discount=0.30;
        }
        else if(quantity >=50 && quantity <100){
            discount=0.40;
        }
        else if(quantity>=100){
            discount=0.50;            
        }

        return discount;
    }

    public double getTotalPayment(){
      return(getTotalPrice()-(getTotalPrice()*getDiscount()));
    }
}
