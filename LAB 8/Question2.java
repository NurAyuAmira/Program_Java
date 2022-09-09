//Nur Ayu Amira Binti Idris 1201200722

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Question2 extends JFrame implements ActionListener{
    private JLabel tolMarksQuizLab, tolMarkLabLab,midLab,finalELab,finalLab,courseLab,resultLab;
    private JTextField tolMarksQuixText,tolMarkLabText,midText,finalEText,finalText,courseText,resultText;
    private JButton calBut;
    private JPanel pNorth,pCenter,pSouth;
    public static void main(String[]args)
    {
        Question2 frame = new Question2("Question 2");

        frame.setSize(600,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public Question2(String t)
    {
        setTitle(t);
        //JLabel
        tolMarksQuizLab = new JLabel("Total Marks of Quizzes:");
        tolMarkLabLab = new JLabel("Total Marks of Lab:");
        midLab = new JLabel("Midterm Test:");
        finalELab = new JLabel("Final Exam Marks:");
        courseLab = new JLabel("Coursework (50%)");
        finalLab = new JLabel("Final (50%)");
        resultLab = new JLabel("Result (100%)");
        
        //JTextField
        tolMarkLabText = new JTextField(10);
        tolMarksQuixText = new JTextField(10);
        midText = new JTextField(10);
        finalEText = new JTextField(10);
        courseText = new JTextField(10);
        finalText = new JTextField(10);
        resultText = new JTextField(10);
        //Making certains non-editable
        courseText.setEditable(false);
        finalText.setEditable(false);
        resultText.setEditable(false);

        //JButton
        calBut = new JButton("Calculate");

        //Panel layout
        pNorth = new JPanel();
        pNorth.setLayout(new GridLayout(2,4));
        pNorth.add(tolMarksQuizLab);
        pNorth.add(tolMarksQuixText);
        pNorth.add(tolMarkLabLab);
        pNorth.add(tolMarkLabText);
        pNorth.add(midLab);
        pNorth.add(midText);
        pNorth.add(finalELab);
        pNorth.add(finalEText);
        
        pCenter = new JPanel();
        pCenter.add(calBut);

        pSouth = new JPanel();
        pSouth.setLayout(new GridLayout(3,2));
        pSouth.add(courseLab);pSouth.add(courseText);
        pSouth.add(finalLab);pSouth.add(finalText);
        pSouth.add(resultLab);pSouth.add(resultText);

        setLayout(new BorderLayout());

        add(pNorth, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
        add(pSouth, BorderLayout.SOUTH);
        
        //Listener
        calBut.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==calBut){
            double tolQuizMark = Double.parseDouble(tolMarksQuixText.getText());
            double tolLabMark = Double.parseDouble(tolMarkLabText.getText());
            double midTerm = Double.parseDouble(midText.getText());
            double finalExam = Double.parseDouble(finalEText.getText());

            double tolPerQuiz = tolQuizMark/30 * 10;  
            double tolPerLab = tolLabMark/50 *10;
            double tolPerMid = midTerm/50 * 30;
            double tolFinal = finalExam/100 * 50;
            double tolCourse = tolPerLab+tolPerQuiz+tolPerMid;
            double result = tolFinal+tolCourse; 
            DecimalFormat f = new DecimalFormat("0.00");
            courseText.setText(""+f.format(tolCourse));
            finalText.setText(""+f.format(tolFinal));
            resultText.setText(""+f.format(result));
        }
    }
}
