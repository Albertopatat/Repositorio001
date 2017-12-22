package oo02;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo implements Dibujar {
        
        private int tipo;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private Color color = new Color(0,0,0,0);

	public Circulo(){
        }
        
        public Circulo(int tipo, int x, int y, int dx, int dy, Color color){
		this.tipo = tipo;
                this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
                this.color = color;
        }
        
        public void setColor(Color color){
        this.color = color;
        }
        
        public int getTipo(){
            return tipo;
        }
        
	public void Dibujar(Graphics g){
		g.setColor(color);
                g.fillOval(x, y, dx, dy);
	}
	
}
