import java.util.Scanner;
public class AboutNumbersV2 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
            for(int i=0; i<5; i++)
            {
                System.out.print("Enter a number: ");
                int num = input.nextInt();
                
                //calling a method
                checking(num);
            }
    }

    //method definition
    public static void checking(int num) //method prototype
    {
        if(num>0)
            System.out.println(num+" is a positive number.");
       else if(num<0)
             System.out.println(num+" is a negative number.");
       else
             System.out.println(num+" is a zero number.");
    }

}
