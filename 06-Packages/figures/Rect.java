package figures;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rect {
    int x, y;
    int w, h;
    int r, g, b;
    int rl, gl, bl;

    public Rect (int x, int y, int w, int h, int r, int g, int b, int rl, int gl, int bl) {
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
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g.setColor(new Color(this.rl,this.gl,this.bl));
        g2d.setStroke(new BasicStroke(4));
        g2d.drawRect(this.x,this.y, this.w,this.h);
        
        g.setColor(new Color(this.r,this.g,this.b));
        g2d.fillRect(this.x,this.y, this.w,this.h);
        
    }
}
