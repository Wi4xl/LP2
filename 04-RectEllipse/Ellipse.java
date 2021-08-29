import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class RectEllipseApp {
    public static void main (String[] args) {
        RectEllipseFrame frame = new RectEllipseFrame();
        frame.setVisible(true);
    }
}

class RectEllipseFrame extends JFrame {
    //Rect r1;
    Ellipse e1;
    Ellipse e2;
    Ellipse e3;

    RectEllipseFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Ellipse");
        this.setSize(350, 350);
        //this.r1 = new Rect(50,50, 100,30);
        this.e1 = new Ellipse(50,100, 200,60,80,140,52,255,0,0);
        this.e2 = new Ellipse(50,200, 100,80,100,100,100,249,145,67);
        this.e3 = new Ellipse(270,100, 60,60,18,30,100,84,193,196);
        
    }

    public void paint (Graphics g) {
        super.paint(g);
        //this.r1.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        g.drawRect(this.x,this.y, this.w,this.h);
    }
}

class Ellipse {
    int x, y;
    int w, h;
    int r, g, b;
    int rl, gl, bl;

    Ellipse (int x, int y, int w, int h, int r, int g, int b, int rl, int gl, int bl) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.g = g;
        this.b = b;
        this.rl = rl;
        this.gl = gl;
        this.bl = bl;
    }

    void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.setStroke(new BasicStroke(6));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        
        g.setColor(new Color(this.r,this.g,this.b));
        g2d.fill(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}
