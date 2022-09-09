//NUR AYU AMIRA BINTI IDRIS 1201200722

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
public class Courses extends JFrame implements ActionListener{
    private JLabel Name,Register,Total,Title,Sc,Line,Line2;
    private JTextField TfName,TfTotal;
    private JRadioButton Stud,Emply;
    private JCheckBox j1,j2,j3,j4;
    private JPanel p1,p2,parent,p4,pinner1,pinner2,pinner3,pinner4;
    private JButton btnCal;

    public static void main(String[] args) {
        Courses frm=new Courses("Short Courses");
        frm.setSize(700,200);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Courses(String t){
        setTitle(t);

        Title=new JLabel("Welcome to XO Short Courses Application");
        Font f=new Font("Verdana",Font.BOLD,15);
        Title.setFont(f);//panel 1

        Register=new JLabel("Registeration Type");
        Stud=new JRadioButton("Student");
        Emply=new JRadioButton("Employed");
        ButtonGroup bg=new ButtonGroup();
        bg.add(Stud);bg.add(Emply);
        Border border = new LineBorder(Color.black, 2, true);
        


        Name=new JLabel("   Name:");
        TfName=new JTextField(30);
        Sc=new JLabel("Short courses(Beginner):");
        j1=new JCheckBox("Facebook-RM150");
        j2=new JCheckBox("Twitter-RM100");
        j3=new JCheckBox("Email-RM80");
        j4=new JCheckBox("Four Square-RM100");
        btnCal=new JButton("Calculate");

        Total=new JLabel("Total Amount:");
        TfTotal=new JTextField(10);
        TfTotal.setEditable(false);

        p1=new JPanel();
        p1.add(Title);

        p2=new JPanel();
        p2.setLayout(new GridLayout(3,1));
        p2.add(Register);
        p2.add(Stud);p2.add(Emply);
        p2.setBorder(border);

        parent=new JPanel();
        parent.setLayout(new GridLayout(4,1));
        pinner1=new JPanel(new FlowLayout(FlowLayout.LEFT));
        pinner1.add(Name);
        pinner1.add(TfName);
        pinner2=new JPanel(new FlowLayout(FlowLayout.LEFT));
        pinner2.add(Sc);
        pinner3=new JPanel();
        pinner3.setLayout(new GridLayout(2,1));
        pinner3.add(j1);pinner3.add(j2);
        pinner3.add(j3);pinner3.add(j4);
        pinner4=new JPanel();
        pinner4.add(btnCal);
        parent.add(pinner1);
        parent.add(pinner2);
        parent.add(pinner3);
        parent.add(pinner4);

        
        p4=new JPanel();
        p4.setLayout(new GridLayout(4,1));
        p4.add(Total);
        p4.add(TfTotal);
        p4.setBorder(border);

        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.WEST);
        add(parent,BorderLayout.CENTER);
        add(p4,BorderLayout.EAST);

        btnCal.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        double student=99.00,Employee=299.00;
        double fb=0,em=0,Tt=0,fs=0,total=0;

        if(Stud.isSelected()){
            
            if(j1.isSelected()){
                fb=150;
            }
            if(j2.isSelected()){
                Tt=100;
            }
            if(j3.isSelected()){
                
                em=80;
            }
            if(j4.isSelected()){
                fs=100;
            }
            total=student+fb+em+Tt+fs;
            
        }else if(Emply.isSelected()){

            if(j1.isSelected()){
                fb=150;
            }
            if(j2.isSelected()){
                em=80;
            }
            if(j3.isSelected()){
                Tt=100;
            }
            if(j4.isSelected()){
                fs=100;
            }
            total=Employee+fb+em+Tt+fs;
            
        }
        DecimalFormat f=new DecimalFormat("0.00");
        TfTotal.setText(String.valueOf("$"+f.format(total)));
    }

    

}
