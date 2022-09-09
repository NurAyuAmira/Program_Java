import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeShapes extends JFrame implements ActionListener
{
    private JButton btnRect, btnOval, btnArc, btnPoly;
    private JPanel p1;

    static int choice;
    public static void main(String[] args)
    {
        ChangeShapes frm = new ChangeShapes();
        frm.setSize(550,250);
        frm.setTitle("Buttons and Shapes");
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ChangeShapes()
    {
        btnRect = new JButton("Show Rectangle");
        btnOval = new JButton("Show Oval");
        btnArc = new JButton("Show Arc");
        btnPoly = new JButton("Show Polygon");

        p1 = new JPanel(); 
        p1.add(btnRect); p1.add(btnOval);
        p1.add(btnArc); p1.add(btnPoly);

        setLayout(new BorderLayout());
        add(new DisplayPanel(), BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);

        btnRect.addActionListener(this);
        btnOval.addActionListener(this);
        btnArc.addActionListener(this);
        btnPoly.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== btnRect)
        {
            choice = 1;
        }
        else if(e.getSource()== btnOval)
        {
            choice = 2;
        }
        else if(e.getSource()== btnArc)
        {
            choice = 3;
        }
        else if(e.getSource()== btnPoly)
        {
            choice = 4;
        }

        //to cleaar the surface and to call the paint method again
        repaint();
    }
}

class DisplayPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int[]x={200,225,275,300,300, 375,225,200};
        int[]y={80,50,50,80,100,130,130,100};

        switch(ChangeShapes.choice)
        {
            case 1:
                g.setColor(Color.GREEN);
                g.fillRect(200, 50,100, 70);
                break;

            case 2:
                g.setColor(Color.RED);
                g.drawOval(200, 50, 100, 70);
                break;

            case 3:
                g.setColor(Color.ORANGE);
                g.fillArc(200, 50, 100, 100, 0, 275);
                break;

            case 4:
                g.setColor(Color.BLUE);
                g.drawPolygon(x,y,x.length);
                break;
        }
    }
}
