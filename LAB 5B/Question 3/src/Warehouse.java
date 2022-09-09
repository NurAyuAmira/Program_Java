public class Warehouse extends Sales {
    int totOfDay;
    int booksPerDay [];
    

    public Warehouse(String sID, int totalOfDay){
        super(sID);
        totOfDay = totalOfDay ;
    }

    public void setBQuantPerDay(int ArraybooksPerDay []){
        booksPerDay = ArraybooksPerDay;
    }

    public int getTotalDay(){
        return totOfDay;
    }

    @Override
    public double getSalesAchieve(){
        double totalSales = 0.0;

        for(int i = 0; i<totOfDay; i++){
            if(booksPerDay[i] <= 500){
                totalSales = totalSales + 2000;
            }
            else if(booksPerDay[i] > 500){
                totalSales += (booksPerDay[i] * 40);
            }
            
        }

        return totalSales;

    }

    public String getScoreCard()
    {
        String status;

        if (getSalesAchieve() >= 3100)
        {
            status = "Awesome";
        } 

        else 
        {
            status = "Insufficient";
        }

        return status;
   }
}
