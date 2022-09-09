//NUR AYU AMIRA BINTI IDRIS
//1201200722
//LAB3_Q2

import java.util.Scanner;
public class colleges {
    static String [] candidate ={"Anna","Kristy","Robin"};
    static String [] club ={"Chess","Archery","Badminton","Music"};

    public static void main(String[] args) 
    {
        int [][] vote = new int[3][4];
        int[] totalVote = new int[3];

        System.out.println("Enter the votes for the candidate : ");
        for(int j=0; j<vote.length; j++)
        {
            System.out.println("\nCandidate "+(j+1)+" : "+candidate[j]);
            for(int i=0; i<vote[j].length; i++)
            {
                System.out.print("From club "+club[i]+" = ");
                vote[j][i] = new Scanner(System.in).nextInt();
            }
        }
        getTotalVotes(vote,totalVote);
        getWinner(totalVote);
    }

    public static void getTotalVotes(int[][] votes, int[] totalVotes) 
    {
        System.out.println("\nThe Result");
        for(int j=0; j<votes.length; j++)
        {
            for(int i=0; i<votes[j].length; i++)
            {
                totalVotes[j] += votes[j][i];
            }
            System.out.println("Candidate "+(j+1)+" : "+candidate[j]+", Total Votes = "+totalVotes[j]);
        }
    }

    public static void getWinner(int [] ttlVotes)
    {
       int highest = ttlVotes[0], winnerIndex=0;
       for(int j=1; j<ttlVotes.length; j++)
       {
           if(ttlVotes[j] > highest)
           {
               highest = ttlVotes[j];
               winnerIndex = j;
           }
       } 
       System.out.println("\nThe winner is "+candidate[winnerIndex]);
    }

}
