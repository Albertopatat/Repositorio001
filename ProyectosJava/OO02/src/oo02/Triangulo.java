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
public class Triangulo {
    private int[] x = new int[3];
    private int[] y = new int[3];
    private int dx;
    private Color color = new Color(0,0,0,0);
                
    public Triangulo(int[] x, int[] y, int dx, Color color){
	this.x = x;
	this.y = y;
	this.dx = dx;
	this.color = color; //PREGUNTA, POR QUÉ CAMBIA EL TONO DE LOS CIRCULOS CADA VEZ QUE REIMPRIME.
    }

    public void Dibujar(Graphics g){ 
	System.out.println(color);
        for (int i = 0; i < 3; i++){
            System.out.println("X: " + x[i] + " Y: " + y[i]);
        }
        g.setColor(color);
        g.fillPolygon(x, y, dx);
        ;
    }    
}
