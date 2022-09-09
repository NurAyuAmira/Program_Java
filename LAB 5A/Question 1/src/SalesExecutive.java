public class SalesExecutive extends Staff{

    //sales in arrayfield -> store the sales of the staff 
    double sales [];
    //peerReview in array -> store point of peer review, the point range 1-5
    int peerReview [];

    double avgSales;
    double avgReview;

    public SalesExecutive(String name, String ID, double basicPay, double sales [], int peerReview [], double avgSales, double avgReview)
    {
        super(name, ID, basicPay);
        this.sales = sales;
        this.peerReview = peerReview;
        this.avgSales = avgSales;
        this.avgReview = avgReview;

    }

    public void setSales( double sales []){
       this.sales = sales;
    }

    public void setPeerReview (int peerReview[]){
        this.peerReview = peerReview;
    }

    public double getAverageSales(){

        //calculate and return the average sales for the staff
        double totalAvg = 0;

        for(int i=0; i<sales.length; i++){

            totalAvg = totalAvg + sales[i];
        }

        avgSales = totalAvg / sales.length;

        return avgSales;
    }

    public double getCommissionRate(){
        double commission = 0;

        if(avgSales < 7000){
            commission = 0;
        }
        else if(avgSales >= 7000 && avgSales < 10000){
            commission = 0.10;
        }
        else if(avgSales >= 10000 && avgSales < 15000){
            commission = 0.15;
        }
        else{
            commission = 0.20;
        }

        return commission;
    }

    public double getAveragePeerReview(){
        double Reviewtot = 0;

        for(int i=0; i<3; i++){
            Reviewtot = Reviewtot + peerReview [i];
        }

        avgReview = Reviewtot / 3;

        return avgReview;
    }

    public double getPeerReviewRate(){
        double assessment = 0;


        if(avgReview >= 4.00 && avgReview <= 5.00){
            assessment = 0.05;
        }
       else if(avgReview >=3.00 && avgReview <= 3.99){
            assessment = 0.025;
        }
        else if(avgReview >= 2.50 && avgReview <= 2.99){
            assessment = 0.01;
        }
        else if(avgReview <2.50){
            assessment = 0;
        }

        return assessment;
    }

    @Override
    public double getSalary(){
        return super.getSalary();
    }
    
}
