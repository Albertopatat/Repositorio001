/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alberto
 */
public class CuadradoGraph extends JPanel {
	private List<Cuadrado> cuadrados;
	
	public CuadradoGraph(){
		cuadrados = new ArrayList<Cuadrado>();
	}
	
	public void addCuadrado(Cuadrado c){
		cuadrados.add(c);
		repaint();
	}
	
	protected void paintComponent(Graphics g){ //NO SE COMO RECIBE EL PARAMETRO NI QUE HACE super...
		super.paintComponents(g);
		for(Cuadrado q: cuadrados){
			q.Dibujar(g);
		}
	}    
}
