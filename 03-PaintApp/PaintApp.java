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
    Rect r1;
    Rect r2;
    Rect r3;

    PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Painting Figures");
        this.setSize(350, 350);
        this.getContentPane().setBackground(Color.WHITE);
        this.r1 = new Rect(100,100, 200,60,71,71,209,255,0,0,0);
        this.r2 = new Rect(50,150, 60,200,255,255,0,0,0,0,0);
        this.r3 = new Rect(250,150, 100,120,255,255,255,0,102,34,20);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;
    int r, g, b;
    int rl, gl, bl;
    int u;

    Rect (int x, int y, int w, int h, int r, int g, int b, int rl, int gl, int bl, int u) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
        this.rl = rl;
        this.gl = gl;
        this.bl = bl;
        this.u = u;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.rotate(Math.toRadians(this.u));
        g2d.setStroke(new BasicStroke(4));
        g2d.drawRect(this.x,this.y, this.w,this.h);
        
        g.setColor(new Color(this.r,this.g,this.b));
        g2d.fillRect(this.x,this.y, this.w,this.h);
        
    }
}
