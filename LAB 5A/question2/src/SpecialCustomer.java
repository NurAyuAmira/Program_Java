public class SpecialCustomer extends Customer{
    private double amountPurchases;
    private double discount;
    private int points;

    public SpecialCustomer(String name, String ID, double amountPurchases){
        super(name, ID);
        this.amountPurchases = amountPurchases;
    }

    public double getDiscount(){
        if(amountPurchases >=2000){
            discount = 0.10;
        }
        else if(amountPurchases >=1500 && amountPurchases <2000){
            discount = 0.07;
        }
        else if(amountPurchases >= 1000 && amountPurchases <1500){
            discount = 0.06;
        }
        else{
            discount = 0.05;
        }
        
        return discount;
    }

    public int getPoints(){
    
        if(amountPurchases >=500)
        {
            points = 5;
            points += (amountPurchases -500) * 2;
        }
        else{
            points =0;
        }

        return points;
    }

    public String toString(){
        return "Customer Name: " + super.getName() + "\nEnter Customer ID: " + super.getID() +"\nDiscount Earned for next purchase: " + (int)(getDiscount()*100)+ "%" +"\nCustomer Points for today: " + getPoints();
    }
    
}
