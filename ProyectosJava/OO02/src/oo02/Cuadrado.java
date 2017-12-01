/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alberto
 */
public class Cuadrado {
    private int x;
	private int y;
	private int dx;
	private int dy;
	private Color color = new Color(0,0,0,0);
                
	public Cuadrado(int x,int y,int dx,int dy, Color color){
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
                this.color = color; //PREGUNTA, POR QUÉ CAMBIA EL TONO DE LOS CIRCULOS CADA VEZ QUE REIMPRIME.
	}

	public void Dibujar(Graphics g){
		g.setColor(color);
                System.out.println(color);
		g.fillRect(x, y, dx, dy);
	}   
}
