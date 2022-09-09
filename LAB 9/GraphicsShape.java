import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Font;

public class GraphicsShape extends JFrame 
{
    public static void main(String [] args)
    {
        GraphicsShape frm = new GraphicsShape();
        frm.setTitle("Drawing");
        frm.setSize(400,320);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    
    public GraphicsShape ()
    {
        add(new DisplayPanel());
    }
}

class DisplayPanel extends JPanel
{
    public void paintComponent (Graphics g)
    {
        //THis is to ensure that components are properly displayed
        super.paintComponent(g);

        //draw a line
        g.setColor(Color.RED);
        g.drawLine(5, 30, 380,30);

        //draw a rectangle
        g.setColor(Color.BLUE);
        g.drawRect(5, 40, 90, 55);
        g.fillRect(100, 40, 90, 55);

        //draw an oval
        g.setColor(Color.YELLOW);
        g.drawOval(5, 100,90, 55);
        g.fillOval(100,100, 90, 55);

        //draw an arc
        g.setColor(Color.GREEN);
        g.fillArc(5, 165, 80,40, 0, -270);
        g.drawArc(100, 165, 80, 80, 0, 110);

        // draw a polygom
        g.setColor(Color.ORANGE);

       Polygon p = new Polygon ();
       p.addPoint(195, 165);
       p.addPoint(233, 238);
       p.addPoint(300, 210);
       g.fillPolygon(p);

       int[]x2 = {295,340,345};
       int[]y2 = {165,255,223};

       g.setColor(Color.ORANGE);
       g.drawPolyline(x2, y2, x2.length);


       //draw string
       g.setColor(Color.PINK);
       Font f = new Font ("Arial", Font.BOLD, 30);
       g.setFont(f);
       g.drawString("Java", 50, 250);

    }
}
