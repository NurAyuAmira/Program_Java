import java.util.Scanner;
public class lab1 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final int YEAR = 2022; //constant variable = value

        //Prompt user to enter name //Klau print sahaja dia akan same line
        System.out.print("Please enter your name: ");
        String name = input.nextLine(); // Datatype variable = object scanner; kalau string value guna nextLine

        //Prompt user to enter age
        System.out.print("Please enter your age: ");
        int age = input.nextInt(); // kalau int value guna nextInt

        //calculate the year user was born
        int year = YEAR - age;

        //Prompt user CGPA
        System.out.print("Your CGPA?:");
        double cgpa = input.nextDouble();

        System.out.println("\nHello " + name);
        System.out.println("You were born in " + year);
        System.out.println("CGPA: " + cgpa);
        System.out.printf("CGPA:%.3f\n",cgpa); //f is format
    }
}
