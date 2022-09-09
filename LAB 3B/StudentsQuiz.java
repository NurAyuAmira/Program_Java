import java.util.Scanner;
public class StudentsQuiz {
    public static void main(String[]args){
        //declare and intialize
        double quiz[][]={{13,10,15.5}, {12.5,11,17.5}, {15,14,20} };
                        //student 1      student 2       student 3

        //call calc_avg- void
        calculate_avg(quiz);
    }

    public static void calculate_avg(double[][]marks){
        double totalScore, avg;

        //to traverse the rows
        //move from 1 student to another student
        for(int i=0; i<marks.length; i++){

            //set to 0 get new total for each student
            totalScore=0.0;

            //to traverse the columns
            //move from 1 mark to another mark
            for(int j=0; j<marks[i].length;j++){

                totalScore= totalScore + marks[i][j];
            }

            avg=totalScore/marks[i].length;
            
            System.out.println("Student no. "+(i+1));
            System.out.println("Average Score = "+avg);

        }
    }
}
