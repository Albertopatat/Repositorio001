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
public class Triangulo implements Dibujar {
    
    private int tipo;
    private int[] x = new int[3];
    private int[] y = new int[3];
    private int dx;
    private Color color = new Color(0,0,0,0);
                
    public Triangulo (){
    }
    
    public Triangulo(int tipo, int[] x, int[] y, int dx, Color color){
	this.tipo = tipo;
        this.x = x;
	this.y = y;
	this.dx = dx;
	this.color = color; //PREGUNTA, POR QUÉ CAMBIA EL TONO DE LOS CIRCULOS CADA VEZ QUE REIMPRIME.
    }

    public void setColor (Color color){
            this.color = color;
        }
    
    public int getTipo(){
        return tipo;
    }
    
    public void Dibujar(Graphics g){ 
	g.setColor(color);
        g.fillPolygon(x, y, dx);
        ;
    }    
}
