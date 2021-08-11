import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(640, 540);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
       
        Graphics2D g2d = (Graphics2D) g;
        
        int w = 640;
        int h = 540;

      
        g2d.setFont(new Font("Arial",Font.BOLD,20));
        g2d.setPaint(Color.BLACK);
        
        g2d.drawString("Bandeira da Inglaterra", 200, 70);
        
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0,100,640,440);
        
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(70));
        g2d.drawLine(0,112, w,h);
        g2d.drawLine(0,h, w,112);
        
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(20));
        g2d.drawLine(0,112, w,h);
        g2d.drawLine(0,h, w,112);
        
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(20));
        g2d.drawLine(0,112, w,h);
        
        
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(120));
        g2d.drawLine(320,160, 320,h);
        
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,246,640,120);
        
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(85));
        g2d.drawLine(0,305, 640,305);
        
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(85));
        g2d.drawLine(320,143, 320,h);
        
        
    }
}
