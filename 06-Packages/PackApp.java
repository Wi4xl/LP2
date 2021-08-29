import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Triangle t1;
    //Rect r1;
    //Ellipse e1;

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(350, 350);
        this.t1 = new Triangle(100, 80, 200, 105, 100, 200);
        //this.r1 = new Rect(250,150, 100,120,255,255,255,0,102,34);
        //this.e1 = new Ellipse(100,50, 90,150,18,30,100,84,193,196);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.t1.paint(g);
        //this.r1.paint(g);
        //this.e1.paint(g);
    }
}
