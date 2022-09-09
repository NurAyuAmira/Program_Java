import java.util.Scanner;
public class TestPayroll {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String emp_name = input.nextLine();

        System.out.print("Enter employee ID: ");
        String emp_ID = input.nextLine();

        System.out.print("Enter the pay rate:$ ");
        double rate = input.nextDouble();

        System.out.print("Enter the hours worked: ");
        int work = input.nextInt();

        Payroll object = new Payroll(emp_name,emp_ID);
        object.setPayRate(rate);
        object.setHoursWork(work);

        System.out.println("----------------------------------");
        System.out.println("Employee name: " +object.getName());
        System.out.println("Employee ID: " +object.getID());
        System.out.printf("Pay Rate:$ %.2f" ,object.getPayRate());
        System.out.println("\nHours Worked: " +object.getHoursWork());
        System.out.printf("Gross Pay(a week):$ %.2f" ,object.getGrossPay());

    }
}

class Payroll
{
    private String name,ID;
    private double payRate;
    private int hoursWork;

    public Payroll() {}

    //constructor
    public Payroll(String name, String ID)
    {   
        this.name = name;
        this.ID = ID;
    }
    //get= access
    //set=mutator
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getID()
    {
        return ID;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public double getPayRate()
    {
        return payRate;
    }
    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }
    public int getHoursWork()
    {
        return hoursWork;
    }
    public void setHoursWork(int hoursWork)
    {
        this.hoursWork = hoursWork;
    }
    public double getGrossPay()
    {
        return hoursWork * payRate;
    }
}
