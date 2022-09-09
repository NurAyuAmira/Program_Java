//NUR AYU AMIRA BINTI IDRIS
//1201200722
//LAB3_Q1

import java.util.Scanner;
public class bookshop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //prompt user to enter the number of book purchased
        System.out.println("Enter the number of books purchased by: ");
        int Cust = 10;
        int[] noBook = new int[Cust];
        int[] point = new int[Cust];

        for(int i=0; i<Cust; i++){
            System.out.print("Customer #"+(i+1)+"=");
            noBook[i] = input.nextInt();
        }

        po(noBook,point);
        int bookTotal = totalBook(noBook);
        int maxPointNo = highestPointCustomer(point);
        int minPointNo = lowestPointCustomer(point);
        System.out.println("\n Total books purchased: "+bookTotal);
        System.out.println("\n Highest points: Customer "+maxPointNo);
        System.out.println("\n Lowest points: Customer "+minPointNo);

    }

    //to determine points based on the book purchased
    //nb is noBook
    //p is point
    public static void po (int[] nb, int[] p){
        System.out.println("\nReview for 10 Selected ");
        System.out.println("Points awarded: ");
        
        for(int i=0; i<10; i++){
            if(nb[i]>=1 && nb[i]<=3){
                p[i]=10;
            }
            else if(nb[i] >=4 && nb[i]<=6){
                p[i]=25;
            }
            else if(nb[i] >=7 && nb[i]<=9){
                p[i]=40;
            }
            else{
                p[i]=75;
            }
            System.out.println("Customer #"+(i+1)+"="+p[i]+" points");
        }
    }

    //to calculate and return the total books purchased
    public static int totalBook(int[] nb){
        int total = 0;
        for(int i=0; i<10; i++){
            total = total + nb[i];
        }
        return total;
    }

    //to return the customer with the highest point
    public static int highestPointCustomer(int[] p){
        int highPoint = p[0];
        int highCustomer = 0;
        
        for(int i=0; i<10; i++){
            if(p[i]> highPoint){
                highPoint = p[i];
                highCustomer = i+1;
            }
        }
        return highCustomer;
    }

    //to return the customer with the lowest point
    //problem sikit
    public static int lowestPointCustomer(int[] p){
        int lowerPoint = p[0];
        int lowCustomer = 0;
        for(int i=0; i<10; i++){
            if(p[i]< lowerPoint){
                lowerPoint = p[i];
                lowCustomer = i+1;
            }
        }
        return lowCustomer;
    }
}
