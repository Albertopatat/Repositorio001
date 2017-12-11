/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author Alberto
 */

public class Graph extends JPanel {
	private ArrayList<Circulo> circulos = new ArrayList<Circulo>();
        private ArrayList<Cuadrado> cuadrados = new ArrayList<Cuadrado>();
        private ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
        private ArrayList<Integer> ultimoelemento = new ArrayList<Integer>();
        
        
	public void Graph(){
        
        ultimoelemento.add(0);
        
        //circulos = new ArrayList<Circulo>(); No funciona aquí, tienen que ser declaradas e iniciadas fuera de los metodos de la clase.
        //cuadrados = new ArrayList<Cuadrado>();
        //triangulos = new ArrayList<Triangulo>();
              
        }
        	
	public void addCirculo(Circulo c){
		circulos.add(c);
		ultimoelemento.add(1);
                }
	
        public void addCuadrado(Cuadrado j){
		cuadrados.add(j);
		ultimoelemento.add(2);
                }
	
        public void addTriangulo(Triangulo m){
		triangulos.add(m);
                ultimoelemento.add(3);
                }
        
        public void borracirculo(){
            if (ultimoelemento != null && !ultimoelemento.isEmpty()){
                if (circulos != null && !circulos.isEmpty()){
                    circulos.remove(circulos.size()-1);
                    ultimoelemento.remove(ultimoelemento.size()-1);
            
                }
            }
        }
        
        public void borracuadrado(){
            if (ultimoelemento != null && !ultimoelemento.isEmpty()){
                if (cuadrados != null && !cuadrados.isEmpty()){
                    cuadrados.remove(cuadrados.size()-1);
                    ultimoelemento.remove(ultimoelemento.size()-1);
                    }
            }
        }
        
        public void borratriangulo(){
            if (ultimoelemento != null && !ultimoelemento.isEmpty()){
                if (triangulos != null && !triangulos.isEmpty()){
                    triangulos.remove(triangulos.size()-1);
                    ultimoelemento.remove(ultimoelemento.size()-1);
                    }
                }
        }
        public void borraultimo(){
        
            if (ultimoelemento != null && !ultimoelemento.isEmpty()){
                switch (ultimoelemento.get(ultimoelemento.size() - 1)) {
                
                    case 1:
                        borracirculo();
                        break;       
                    case 2:
                        borracuadrado();
                        break;
                    case 3:
                        borratriangulo();
                        break;
                };
                }
            else {
                Avisos Aviso = new Avisos();
                JLabel texto = new JLabel();
                texto.setText ("No hay mas elementos");
                Aviso.add(texto);
                Aviso.setVisible(true);
            }
        }
        
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
                
                for(Circulo q: circulos){
                    System.out.println("Tamaño de ListArray circulos: " + circulos.size());
                    q.Dibujar(g);
		}
                for(Cuadrado w: cuadrados){
                    System.out.println("Tamaño de ListArray cuadrados: " + cuadrados.size());
                    w.Dibujar(g);
		}
                for(Triangulo z: triangulos){
                    System.out.println("Tamaño de ListArray triangulos: " + triangulos.size());
                    z.Dibujar(g);
		}
                System.out.println("Cantidad de objetos dentro del array elementos: " + ultimoelemento.size() + " y es un: " + (ultimoelemento.get(ultimoelemento.size() - 1)));
        }
                
}  

