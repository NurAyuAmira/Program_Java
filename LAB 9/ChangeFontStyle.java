//NUR AYU AMIRA BINTI IDRIS
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class ChangeFontStyle extends JFrame implements ItemListener{
    private JLabel lb;
    private JCheckBox cbBold,cbItalic;
    private JRadioButton G,O,R;
    private JPanel p1,p2;
    public static void main(String[] args) {
        ChangeFontStyle frm=new ChangeFontStyle();
        frm.setTitle("Wishing You...");
        frm.setSize(400,300);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public ChangeFontStyle(){
        lb=new JLabel("GONG XI FA CAI",JLabel.CENTER);
        Font f=new Font("Lucida Handwriting",Font.PLAIN,26);
        lb.setFont(f);
        lb.setForeground(Color.red);

        cbBold=new JCheckBox("Bold");
        cbBold.setForeground(Color.magenta);
        cbBold.setBackground(Color.cyan);

        cbItalic=new JCheckBox("Italic");
        cbItalic.setForeground(Color.blue);
        cbItalic.setBackground(Color.cyan);

        G=new JRadioButton("GREEN");
        O=new JRadioButton("ORANGE");
        R=new JRadioButton("RED");

        p2=new JPanel();
        p2.setLayout(new GridLayout(3,1));
        p2.add(G);p2.add(O);p2.add(R);

        p1=new JPanel();
        p1.setBackground(Color.cyan);
        p1.add(cbBold);
        p1.add(cbItalic);

        setLayout(new BorderLayout());
        add(lb,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);
        add(p2,BorderLayout.WEST);
        
        cbBold.addItemListener(this);
        cbItalic.addItemListener(this);
        G.addItemListener(this);
        O.addItemListener(this);
        R.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent e){
        int s=Font.PLAIN;
        if(cbBold.isSelected()){
            s=Font.BOLD;
        }
        if(cbItalic.isSelected()){
            s=s+Font.ITALIC;//font plain + italic 
        }
        Font f=new Font("Lucida Handwriting",s,26);
        lb.setFont(f);

        if(G.isSelected()){
            lb.setForeground(Color.green);
        }
        if(O.isSelected()){
            lb.setForeground(Color.ORANGE);
        }
        if(R.isSelected()){
            lb.setForeground(Color.red);
        }
    }

}
