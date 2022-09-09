//NUR AYU AMIRA BINTI IDRIS 1201200722
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GridLayout;

public class Question3 extends JFrame implements ActionListener{
    private JLabel leftLab,centerLab,rightLab;
    private JButton leftBut,centerBut,rightBut;
    private JPanel pCenter,pSouth;
    ImageIcon ball = new ImageIcon("images/ball.png");
    ImageIcon none = new ImageIcon("");
    public static void main (String[] args)
    {
        Question3 frame = new Question3("Question 3");

        frame.setSize(600,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public Question3(String t){
        setTitle(t);
        
        leftLab = new JLabel("");
        centerLab = new JLabel(ball);
        rightLab = new JLabel("");
        leftBut = new JButton("LEFT");
        centerBut = new JButton("CENTER");
        rightBut = new JButton("RIGHT");
        
        pCenter = new JPanel();
        
        pCenter.add(leftLab);pCenter.add(centerLab);pCenter.add(rightLab);
        pCenter.setLayout(new GridLayout(1,3));

        pSouth = new JPanel();
        pSouth.add(leftBut);pSouth.add(centerBut);pSouth.add(rightBut);

        add(pCenter, BorderLayout.CENTER);
        add(pSouth, BorderLayout.SOUTH);

        leftBut.addActionListener(this);
        centerBut.addActionListener(this);
        rightBut.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==leftBut){
            leftLab.setIcon(ball);
            centerLab.setIcon(none);
            rightLab.setIcon(none);
        }
        else if(e.getSource()==centerBut){
            leftLab.setIcon(none);
            centerLab.setIcon(ball);
            rightLab.setIcon(none);
        }
        else if(e.getSource()==rightBut){
            leftLab.setIcon(none);
            centerLab.setIcon(none);
            rightLab.setIcon(ball);
        }
    }
    
}
