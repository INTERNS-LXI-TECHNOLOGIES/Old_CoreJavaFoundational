import java.awt.BasicStroke;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class DashedLinesApplet extends Applet
 {
            public static void main(String[] args)
       {
                 DashedLinesApplet DashesLines = new DashedLinesApplet();
                 Frame DLApplet = new Frame("Draw Dashed Line in Applet Window Example");
           DLApplet.add(DashesLines);
                DLApplet.setSize(350, 250);
                DLApplet.setVisible(true);
               DLApplet.addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent e) {System.exit(0); }
                                                                        });
      }
          public void paint(Graphics g)
           {
                g.setColor(Color.darkGray);
                g.setFont(new Font("Arial",Font.BOLD,14));
                g.drawString("Draw Dashed Line in Applet Window Example", 10, 40);
                g.setFont(new Font("Arial",Font.BOLD,10));
                g.drawString("http://ecomputernotes.com", 200, 205);
               Graphics2D Gr2D = (Graphics2D) g;
   
              // Array of a dash pattern 40-pixel line, 10-pixel gap, 20-pixel line, 10-pixel gap
              float[] d1 = { 40, 10, 20, 10 };
             //The Syntax for BasicStroke(float width, int cap, int join, float miterlimit, float[] dash, float dash_phase) ;
          BasicStroke BasicS = new BasicStroke(1, BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL, 10, d1,0);
             Gr2D.setStroke(BasicS);
             Gr2D.setPaint(Color.red);
             Gr2D.drawLine(60, 80, 250, 80);
BasicStroke BasicS1 = new BasicStroke(1, BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER, 10, d1,0);
             Gr2D.setStroke(BasicS1);
             Gr2D.setPaint(Color.green);
             Gr2D.drawLine(60, 100, 250, 100);
BasicStroke BasicS2 = new BasicStroke(1, BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND, 10, d1,0);
             Gr2D.setStroke(BasicS2);
             Gr2D.setPaint(Color.blue);
             Gr2D.drawLine(60, 120, 250, 120);
        }
    }