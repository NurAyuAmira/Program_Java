//NUR AYU AMIRA BINTI IDRIS
//1201200722
//LAB4 TL3l

import java.util.Scanner;

class BankAccount{
    private double balance;

    BankAccount(){
        balance=0.0;
    }

    public BankAccount(double startBalance){
        this.balance= startBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance=balance-amount;
    }

    //mutator
    public void setBalance(double balance){
        this.balance = balance;
    }

    //accesor
    public double getBalance(){
        return balance;
    }
}

public class bank {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double balance,deposit,withdraw;

     


        System.out.println("What is your account's starting balance? (RM)");
        balance=  input.nextDouble();

        System.out.println("How much pay that has been deposited this month? (RM)");
        deposit= input.nextDouble();

           //object for class BankAccount
           BankAccount bk = new BankAccount(balance);
        bk.deposit(deposit);

        System.out.printf("Your current balance is RM %.2f ", (bk.getBalance()));

        System.out.println("\nHow much would you like to withdraw? (RM)");
        withdraw = input.nextDouble();
        bk.withdraw(withdraw);
        System.out.printf("Now your balance is RM %.2f ", (bk.getBalance()));

    }
}
