//NUR AYU AMIRA BINTI IDRIS
//1201200722
//LAB 5A

//class Staff
public class Staff{
    private String staffName;
    private String staffID;
    private double salary;

    public Staff(String name, String ID, double basicPay)
    {
        staffName = name;
        staffID = ID;
        salary = basicPay;
    }

    public String getName(){
        return staffName;
    }

    public String getID(){
        return staffID;
    }

    public double getSalary(){
        return salary;
    }
}