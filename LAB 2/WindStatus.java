import java.util.Scanner;

public class WindStatus {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String cat;
        Boolean wish;

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
            System.out.print("Do you wish to continue?[true/false]: ");
            wish = input.nextBoolean();
        }while(wish==true);
}
}
