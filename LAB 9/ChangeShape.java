//NUR AYU AMIRA BINTI IDRIS

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChangeShape extends JFrame implements ActionListener{
    private JButton btnRect,btnOval,btnArc,btnPoly,btnPolyLine;
    private JPanel p1;
    static int choice;
    public static void main(String[] args) {
        ChangeShape frm=new ChangeShape();
        frm.setTitle("Button & Shapes");
        frm.setSize(650,350);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public ChangeShape(){
        btnRect=new JButton("Show Rectangle");
        btnOval=new JButton("Show Oval");
        btnArc=new JButton("Show Arc");
        btnPoly=new JButton("Show Polygon");
        btnPolyLine=new JButton("Show Polygon Line");

        p1=new JPanel();
        p1.add(btnRect);
        p1.add(btnOval);
        p1.add(btnArc);
        p1.add(btnPoly);
        p1.add(btnPolyLine);

        setLayout(new BorderLayout());
        add(new DrawPanel(),BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);
        
        btnRect.addActionListener(this);
        btnOval.addActionListener(this);
        btnArc.addActionListener(this);
        btnPoly.addActionListener(this);
        btnPolyLine.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==btnRect){
            choice=1;
        }else if(e.getSource()==btnOval){
            choice=2;
        }else if(e.getSource()==btnArc){
            choice=3;
        }else if(e.getSource()==btnPoly){
            choice=4;
        }else if(e.getSource()==btnPolyLine){
            choice=5;
        }
        //to clear surface and call paint method again
        repaint();
    }

}
class DrawPanel extends JPanel
{
    public void paintComponent(Graphics g){

        
        super.paintComponent(g);
        int[]x={200,225,275,300,300,275,225,200};
        int[]y={80,50,50,80,100,130,130,100};
        //call variable from another class
        //for polyline
        int[]x2={100,200,100};
        int[]y2={100,150,200};
        switch(ChangeShape.choice){
            case 1:
               g.setColor(Color.GREEN);
               g.fillRect(200, 50, 100, 70);
               break;
            case 2:
               g.setColor(Color.RED);
               g.drawOval(200,50, 100, 70);
               break;
            case 3:
               g.setColor(Color.orange);
               g.fillArc(200, 50, 100, 100, 0, 275);
               break;
            case 4:
                g.setColor(Color.BLUE);
                g.drawPolygon(x, y, x.length);
                break;
            case 5:
                g.setColor(Color.pink);
                g.drawPolyline(x2, y2, x2.length);
               

        }
    }

}
