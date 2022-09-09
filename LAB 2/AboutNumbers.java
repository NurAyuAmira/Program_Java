import java.util.Scanner;
public class AboutNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        for(int i=0; i<5; i++) //repeat program 5 numbers 
        {
            System.out.print("Enter a number: ");
            int n = input.nextInt();

            if(n>0) //when the val is +
            {
                System.out.println(n+ " is a positive number");
            }
            else if(n<0)  //when the val is -
            {
                System.out.println(n+ " is a negative number");
            }
            else if(n==0)  //when the val is 0
            {
                System.out.println(n+ " is a zero number");
            }


        }
    }
}
