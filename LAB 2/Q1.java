//Nur Ayu Amira Binti Idris 1201200722
//Lab 2, TL3L, Question 1
import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String cat =""; //Need to use string sebab "Yes/No". True/False for boolean only
        String wish;

        do{
            System.out.print("Enter the wind speed: ");
            double wind = input.nextDouble();

            if(wind<=38){
                cat = "Windy";
            }
            else if(wind>=39 && wind<=54){
                cat = "Gale";
            }
            else{
                cat ="Storm";
            }

            System.out.println("It is "+cat);
            System.out.print("Do you wish to continue?[Yes/No]: ");
            wish = input.next();

        }while(wish.equals("Yes")); /*(wish="Yes") it will not work
                                    sebab == untuk compare the memory location*/

}
}
