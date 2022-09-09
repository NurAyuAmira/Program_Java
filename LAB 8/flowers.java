//NUR AYU AMIRA 1201200722
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
public class flowers extends JFrame implements ActionListener{
    private JLabel typeF,qty,totalText;
    private JTextField qtyText,Total;
    private JRadioButton RB,CB;
    private JPanel p1,p2,p3;
    private JButton btnCal;
    
    public static void main(String[] args) {
        

        flowers frm=new flowers("");
        frm.pack();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public flowers(String t){
        setTitle(t);
        typeF=new JLabel("Type of flowers:");
        
        //radio button
        RB=new JRadioButton("Roses bouquet $ 30");
        CB=new JRadioButton("Carnations bouquet $ 38");
        ButtonGroup bg=new ButtonGroup();
        bg.add(RB);bg.add(CB);

        //text field
        qty=new JLabel("Quantity");
        qtyText=new JTextField(10);

        //POSITION
        p1=new JPanel();
        p1.add(typeF);p1.add(RB);p1.add(CB);
        p2=new JPanel();
        p2.add(qty);p2.add(qtyText);
        
        //calculation
        btnCal=new JButton("Calculate");
        totalText=new JLabel(" Total Payment Amount:");
        Total=new JTextField(10);
        Total.setEditable(false);

        p3=new JPanel();
        p3.add(btnCal);p3.add(totalText);p3.add(Total);

        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);

        btnCal.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        Double flowerRB=30.00;
        Double flowerCB=38.00;
        Double delivery=5.00;
        Double total=0.0;
        Double QTY= Double.parseDouble(qtyText.getText());

        if(RB.isSelected()){
            total=(flowerRB*QTY)+delivery;
        }else if(CB.isSelected()){
            total=(flowerCB*QTY)+delivery;
        }

        DecimalFormat f=new DecimalFormat("0.00");
        Total.setText(String.valueOf("$"+f.format(total)));
    }

}
