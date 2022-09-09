import java.util.Scanner;
public class part {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Title: ");
        String title = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Marks: ");
        double score = input.nextDouble();

        Participants object = new Participants(name, age, title, score);

        System.out.println("\n= Result =");
        System.out.println("Title: " + object.getTitle());
        System.out.println("Participants: " + object.getName());
        System.out.println("Age: " + object.getAge());
        System.out.println("Group: " + object.getGroup());
        System.out.println("Marks: " + object.getScore());
        System.out.println("Status: " + object.getStatus());
    }
}

class Participants
{
    private String name;
    private int age;
    private String title;
    private double score;
    private String status;

    public Participants()
    {}

    public Participants(String name, int age, String title, double score)
    {
        this.name = name;
        this.age = age;
        this.title = title;
        this.score = score;
    }

    public void setMarks(double score)
    {
        this.score = score;
    }

    public String getName()
    { 
        return name; 
    }

    public int getAge()
    { 
        return age; 
    }

    public String getTitle()
    { 
        return title; 
    }

    public double getScore()
    { 
        return score; 
    }

    public String getGroup()
    {
        if(age >= 15)
            return "Senior";

        else
            return "Junior";
    }

    public String getStatus()
    {
        if(age < 15 && score >= 50 && score <= 100)
        {
            status = "Advanced";
        }

        else if(age < 15 && score >= 0 && score <= 49.99)
        {
            status = "Eliminated";
        }

        else if(age >= 15 && score >= 80 && score <= 100)
        {
            status = "Advanced";
        }

        else if(age >= 15 && score >= 0 && score <= 79.99)
        {
            status = "Eliminated";
        }

        return status;
    }   
}
