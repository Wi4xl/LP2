import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Triangulo t1;
    Triangulo t2;
    Triangulo t3;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Triângulo");
        this.setSize(350, 350);
        this.getContentPane().setBackground(Color.WHITE);
        this.t1 = new Triangulo(100, 80, 280, 105, 100, 200,71,71,209,255,0,0);
        this.t2 = new Triangulo(260, 240, 200, 205, 260, 320,255,255,0,0,0,0);
        this.t3 = new Triangulo(320, 200, 290, 150, 320, 100,255,255,255,0,102,34);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.t1.paint(g);
        this.t2.paint(g);
        this.t3.paint(g);
    }
}

class Triangulo {
    int x1, y1, x2, y2, x3, y3;
    int r, g, b;
    int rl, gl, bl;
    
    Triangulo (int x1, int y1, int x2, int y2, int x3, int y3, int r, int g, int b, int rl, int gl, int bl) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.r = r;
        this.g = g;
        this.b = b;
        this.rl = rl;
        this.gl = gl;
        this.bl = bl;
    }


    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        Polygon tr = new Polygon();
	tr.addPoint(this.x1, this.y1);
	tr.addPoint(this.x2, this.y2);
	tr.addPoint(this.x3, this.y3);
	
	g2d.setStroke(new BasicStroke(4));
	
	g.setColor(new Color(this.rl,this.gl,this.bl));
	g.drawPolygon(tr);
	
	g.setColor(new Color(this.r,this.g,this.b));
	g.fillPolygon(tr);
        
    }
}
