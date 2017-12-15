/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
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
        private ArrayList<Dibujar> varios = new ArrayList<Dibujar>();
        private ArrayList<Integer> ultimoelemento = new ArrayList<Integer>();
        private Avisos Avisoelemento = new Avisos();
        private Avisos Avisocirculo = new Avisos();
        private Avisos Avisocuadrado = new Avisos();
        private Avisos Avisotriangulo = new Avisos();
        
	public void Graph(){
                //circulos = new ArrayList<Circulo>(); No funciona aquí, tienen que ser declaradas e iniciadas fuera de los metodos de la clase.
                //cuadrados = new ArrayList<Cuadrado>();
                //triangulos = new ArrayList<Triangulo>();
                }
        
        // Agrega las figuras a sus ArrayList.
	public void addCirculo(Circulo c){
		circulos.add(c);
                varios.add(c);
                System.out.print("cantidad en varios " + varios.size());
		ultimoelemento.add(1);
                }
	
        public void addCuadrado(Cuadrado j){
		cuadrados.add(j);
                varios.add(j);
                System.out.print("cantidad en varios " + varios.size());
		ultimoelemento.add(2);
                }
	
        public void addTriangulo(Triangulo m){
		triangulos.add(m);
                varios.add(m);
                ultimoelemento.add(3);
                }
        
        //Borra las figuras de sus arraylist y de la lista de elementos.
        public void borracirculo(){
            if (ultimoelemento != null && !ultimoelemento.isEmpty()){
                if (circulos != null && !circulos.isEmpty()){
                    circulos.remove(circulos.size()-1);
                    ultimoelemento.remove(ultimoelemento.size() - ultimocirculo());
                }
                else {
                    Avisocirculo = new Avisos();
                    Avisocirculo.setAviso("No hay mas Circulos (desde le setter)");
                    Avisocirculo.setVisible(true);
                }
            }
            else {
                Avisoelemento.setVisible(true);
            }
        }
        
        public void borracuadrado(){
            if (ultimoelemento != null && !ultimoelemento.isEmpty()){
                if (cuadrados != null && !cuadrados.isEmpty()){
                    cuadrados.remove(cuadrados.size()-1);
                    ultimoelemento.remove(ultimoelemento.size() - ultimocuadrado());
                }
                else {
                Avisocuadrado = new Avisos("No hay mas Cuadrados"); // En esta opción asigno el valor directamente al metodo constructor a través de un parametro que en el mismo constructor envia al objeto anidado, texto.
                Avisocuadrado.setVisible(true);
                }
            }
            else {
                Avisoelemento.setVisible(true);
            }
        }
        
        public void borratriangulo(){
            if (ultimoelemento != null && !ultimoelemento.isEmpty()){
                if (triangulos != null && !triangulos.isEmpty()){
                    triangulos.remove(triangulos.size()-1);
                    ultimoelemento.remove(ultimoelemento.size() - ultimotriangulo());
                    }
                else {
                Avisotriangulo = new Avisos();
                Avisotriangulo.setAviso("No hay mas Triangulos");
                Avisotriangulo.setVisible(true);
                }
            }
            else {
                Avisoelemento.setVisible(true);
            }
        }
        
        
        // Obtiene la posición del ultimo circulo, triangulo o cuadrado dentro del ArrayList.
        public int ultimocirculo(){
            int i = 1;
            while (ultimoelemento.get(ultimoelemento.size() - i) != 1){
                i ++; 
                }
            System.out.println("valor de i: " + i);
            return i;
        }
        
        public int ultimocuadrado(){
            int i = 1;
            while (ultimoelemento.get(ultimoelemento.size() - i) != 2){
                i ++; 
                }
            System.out.println("valor de i: " + i);
            return i;
        }
        
        public int ultimotriangulo(){
            int i = 1;
            while (ultimoelemento.get(ultimoelemento.size() - i) != 3){
                i ++; 
                }
            System.out.println("valor de i: " + i);
            return i;
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
                //Avisoelemento.setAviso("No hay elementos"); Se asigna al atributo mensaje por defecto "No hay elementos" por si se presiona al inicio borrar alguna figura.
                Avisoelemento.setVisible(true);
            }
        }
        
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
                for(Dibujar q: varios){
                    System.out.println("Tamaño de ListArray varios: " + varios.size());
                    q.Dibujar(g);
		}
//                for(Circulo q: circulos){
//                    System.out.println("Tamaño de ListArray circulos: " + circulos.size());
//                    q.Dibujar(g);
//		}
//                
//                for(Cuadrado w: cuadrados){
//                    System.out.println("Tamaño de ListArray cuadrados: " + cuadrados.size());
//                    w.Dibujar(g);
//		}
//                
//                for(Triangulo z: triangulos){
//                    System.out.println("Tamaño de ListArray triangulos: " + triangulos.size());
//                    z.Dibujar(g);
//		}
//                System.out.println("Cantidad de objetos dentro del array elementos: " + ultimoelemento.size());
        }
                
}  

