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
public class TrianguloGraph extends JPanel { //POR QUE EXTIENDE A JPANEL?
	private List<Triangulo> triangulos;
	
	public TrianguloGraph(){
		triangulos = new ArrayList<Triangulo>();
	}
	
	public void addTriangulo(Triangulo c){ //CUANDO LLAMA A ADDTRIANGULO REIMPRIME TODA LA PANTALLA?
		triangulos.add(c);
		repaint();
	}
	
	protected void paintComponent(Graphics g){ //EN QUE MOMENTO LLAMA AL METODO PAINTCOMPONENT? Y ESTE A SU VEZ TIENE SUPER.PAINTCOMPES
		super.paintComponents(g);
		for(Triangulo q: triangulos){
			q.Dibujar(g);
		}
	}    
}
