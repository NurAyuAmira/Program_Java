public class Vehicle {
    private String regNum;
    private String departStat;
    private String arriveStat;
    
    public Vehicle()
    {
        regNum = "XXX0000";
        departStat = "No Where";
        arriveStat = "No Where";
    }
    public Vehicle(String departStat, String arriveStat)
    {
        this.departStat = departStat;
        this.arriveStat = arriveStat;
    }
    public void setRegNum(String regNum)
    {
        this.regNum = regNum;
    }
    public String getRegNum()
    {
        return regNum;
    }
    public String getDepartStat()
    {
        return departStat;
    }
    public String getArriveStat()
    {
        return arriveStat;
    }
}
