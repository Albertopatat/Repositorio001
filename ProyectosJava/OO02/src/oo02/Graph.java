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
	//private ArrayList<Circulo> circulos = new ArrayList<Circulo>();
        //private ArrayList<Cuadrado> cuadrados = new ArrayList<Cuadrado>();
        //private ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
        private ArrayList<Dibujar> arrayFiguras = new ArrayList<Dibujar>();
        //private ArrayList<Integer> ultimoelemento = new ArrayList<Integer>();
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
		arrayFiguras.add(c);
                System.out.print("cantidad en arrayFiguras " + arrayFiguras.size());
		}
	
        public void addCuadrado(Cuadrado j){
		arrayFiguras.add(j);
                System.out.print("cantidad en arrayFiguras " + arrayFiguras.size());
                }
	
        public void addTriangulo(Triangulo m){
		arrayFiguras.add(m);
                }
        
        //Borra las figuras de sus arraylist y de la lista de elementos.
        public void borracirculo(){
            if (arrayFiguras != null && !arrayFiguras.isEmpty()){
                if (ultimocirculo() != arrayFiguras.size() - 1){
                    arrayFiguras.remove(arrayFiguras.size() - ultimocirculo()); //Me da la ubicación de la ultima figura del tipo circulo
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
            if (arrayFiguras != null && !arrayFiguras.isEmpty()){
                if (ultimocuadrado() != arrayFiguras.size() - 1){
                    arrayFiguras.remove(arrayFiguras.size() - ultimocuadrado());
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
            if (arrayFiguras != null && !arrayFiguras.isEmpty()){
                if (ultimotriangulo() != arrayFiguras.size() - 1){
                arrayFiguras.remove(arrayFiguras.size() - ultimotriangulo());
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
            while (arrayFiguras.get(arrayFiguras.size() - i).getTipo() != 1){
                i ++; 
                }
            System.out.println("valor de i: " + i);
            return i;
        }
        
        public int ultimocuadrado(){
            int i = 1;
            // IMPORTANTE cuando se genera un arrayList de interface de objetos, para utilizar los metodos es necesario que aparezcan en la interface.
            // en este caso getTipo está declarada dentro de la interface Dibujar
            while (arrayFiguras.get(arrayFiguras.size() - i).getTipo() != 2) { // tratando de comparar tipos de objetos.
                i ++; 
                }
            System.out.println("valor de i: " + i);
            return i;
        }
        
        public int ultimotriangulo(){
            int i = 1;
            while (arrayFiguras.get(arrayFiguras.size() - i).getTipo() != 3){
                i ++; 
                }
            System.out.println("valor de i: " + i);
            return i;
        }
        
        public void borraultimo(){
        
            if (arrayFiguras != null && !arrayFiguras.isEmpty()){
                switch (arrayFiguras.get(arrayFiguras.size() - 1).getTipo()) {
                
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
                for(Dibujar q: arrayFiguras){
                    System.out.println("Tamaño de ListArray arrayFiguras: " + arrayFiguras.size());
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

