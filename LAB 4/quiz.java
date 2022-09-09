//NUR AYU AMIRA BINTI IDRIS
//1201200722
//LAB4 TL3l

import java.util.Scanner;
public class quiz {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

    System.out.print("How many students in the class? ");
    int stud = input.nextInt();

    double [] quizs = new double[stud];

    System.out.println("Enter the score of quiz for the class");
    for(int i=0; i<stud; i++)
    {
        System.out.print("Student " +(i+1)+":");
        quizs[i] = input.nextDouble();
    }

    QuizScores q = new QuizScores(quizs);

    System.out.printf("Average score: %.1f",q.getAverage());
    System.out.println("\n Average grade: "+q.getGrade());
    System.out.printf("Maximum score: %.1f ",q.getMaxScore());
    }
}

class QuizScores{
    private double [] quizz;

    public QuizScores(double [] quizz){
        this.quizz=quizz;
    }

    public double getAverage(){
        double totalScore = 0;
       
        for(int i=0; i<quizz.length; i++){
            totalScore= totalScore + quizz[i];
        }

        double average = totalScore / quizz.length;

        return average;
    }

    public char getGrade(){
        double average = getAverage();
        char grade;

        if(average>=17){
            grade='A';
        }
        else if(average>=15){
            grade='B';
        }
        else if(average>=10){
            grade='C';
        }
        else if(average>=5){
            grade='D';
        }
        else{
            grade='F';
        }
        
        return grade;
    }

    public double getMaxScore(){

        double max = 0;
        for(int i=0;i<quizz.length; i++){
            if(quizz[i] > max){
                max =quizz[i];
            }
        }
        return max;
    }
    
}
