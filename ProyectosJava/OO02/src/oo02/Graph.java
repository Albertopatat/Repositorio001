/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Alberto
 */

public class Graph extends JPanel {
	private ArrayList<Circulo> circulos = new ArrayList<Circulo>();
        private ArrayList<Cuadrado> cuadrados = new ArrayList<Cuadrado>();
        private ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
          
        
	public void Graph(){
            //circulos = new ArrayList<Circulo>();
            //   cuadrados = new ArrayList<Cuadrado>();
            //  triangulos = new ArrayList<Triangulo>();
              
	}
	
	public void addCirculo(Circulo c){
		circulos.add(c);
		repaint();
	}
	
        public void addCuadrado(Cuadrado j){
		cuadrados.add(j);
		repaint();
	}
	
        public void addTriangulo(Triangulo m){
		triangulos.add(m);
		repaint();
	}
        
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
                System.out.println("Numero de elementos en la lista: " + circulos.size());
                for(Circulo q: circulos){
                    q.Dibujar(g);
		}
                for(Cuadrado q: cuadrados){
                    q.Dibujar(g);
		}
                for(Triangulo q: triangulos){
                    q.Dibujar(g);
		}
                
                
        }
                
}  

