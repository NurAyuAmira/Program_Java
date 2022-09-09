public class Bus extends Vehicle{
    private double distKM, ticPrice;

    public Bus(String regNum, String departStat, String arriveStat){
        super(departStat, arriveStat);
        setRegNum(regNum);
    }
    public void setDist(double dist){
        distKM = dist;
    }
    public double getDistKM(){
        return distKM;
    }
    public double calcTicPric(){
        if(distKM<=10){
            ticPrice = 5.00;
        }
        else if(distKM>=11&&distKM<=20){
            ticPrice = 10.00;
        }
        else if(distKM>20){
            ticPrice = 10.00 + (0.30*(distKM-20));
        }
        return ticPrice;
    }
}
