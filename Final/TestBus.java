import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class TestBus extends JFrame implements ActionListener{
    private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10;
    private JTextField tfRegNum, tfDepart, tfArrive, tfDist;
    private JButton calculate;
    private JPanel p1,p2,p3,p4;

    public static void main(String[] args) {
        TestBus frm = new TestBus("BUS TICKET");
        //frm.setTitle("BUS TICKET");
        frm.setSize(700,350);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public TestBus(String t){
        setTitle(t);
        lb1 = new JLabel("Bus Reg.Num: ");
        tfRegNum = new JTextField(10);
        lb2 = new JLabel("Departure Station: ");
        tfDepart = new JTextField(10);
        lb3 = new JLabel("Arriving Station: ");
        tfArrive = new JTextField(10);
        lb4 = new JLabel("Total Dist. (KM): ");
        tfDist = new JTextField(10);

        p1 = new JPanel(new GridLayout(4,2));
        p1.setBackground(Color.GREEN);
        p1.add(lb1);p1.add(tfRegNum);
        p1.add(lb2);p1.add(tfDepart);
        p1.add(lb3);p1.add(tfArrive);
        p1.add(lb4);p1.add(tfDist);

        lb5 = new JLabel(new ImageIcon("welcome.png"));

        p2 = new JPanel();
        p2.add(lb5);

        lb6 = new JLabel("======BUS DETAILS======");
        lb7 = new JLabel();
        lb8 = new JLabel();
        lb9 = new JLabel();
        lb10 = new JLabel();

        lb6.setForeground(Color.LIGHT_GRAY);
        lb7.setFont(new Font("Verdana", Font.ITALIC, 12));
        lb8.setFont(new Font("Verdana", Font.ITALIC, 12));
        lb9.setFont(new Font("Verdana", Font.ITALIC, 12));
        lb10.setFont(new Font("Verdana", Font.ITALIC, 12));

        p3 = new JPanel(new GridLayout(5,1));
        p3.setBackground(Color.CYAN);
        p3.add(lb6);
        p3.add(lb7);
        p3.add(lb8);
        p3.add(lb9);
        p3.add(lb10);

        calculate = new JButton("Calculate");
        calculate.setBackground(Color.PINK);
        calculate.addActionListener(this);
        calculate.setHorizontalAlignment(JButton.CENTER);

        p4 = new JPanel();
        p4.setBackground(Color.PINK);
        p4.add(calculate);

        setLayout(new BorderLayout());
        add(p1,BorderLayout.WEST);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.EAST);
        add(p4,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==calculate){
            lb5.setIcon(new ImageIcon("tour-bus.png"));
            String regNum = tfRegNum.getText();
            String departStat = tfDepart.getText();
            String arriveStat = tfArrive.getText();
            double distKM = Double.parseDouble(tfDist.getText());

            Bus b = new Bus(regNum, departStat, arriveStat);
            b.setDist(distKM);
            b.calcTicPric();
            lb7.setText(regNum);
            lb8.setText("FROM : "+departStat);
            lb9.setText("TO : "+arriveStat);
            b.getDistKM();
            DecimalFormat df = new DecimalFormat("0.00");
            lb10.setText("RM "+String.valueOf(df.format(b.calcTicPric())));
        }
    }
}
