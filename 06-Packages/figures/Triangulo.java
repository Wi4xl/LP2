package figures;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Triangulo {
    private int x1, y1, x2, y2, x3, y3;
    private int r, g, b;
    private int rl, gl, bl;

    public Triangulo (int x1, int y1, int x2, int y2, int x3, int y3, int r, int g, int b, int rl, int gl, int bl) {
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

    public void paint (Graphics g) {
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
