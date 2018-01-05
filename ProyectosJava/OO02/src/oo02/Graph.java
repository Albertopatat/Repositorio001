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
                if (ultimocirculo() != -1){// verifica si existen circulos, si es igual a -1 significa que no.
                    arrayFiguras.remove(ultimocirculo()); //Me da la ubicación de la ultima figura del tipo circulo
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
                if (ultimocuadrado() != -1){
                    arrayFiguras.remove(ultimocuadrado());
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
                if (ultimotriangulo() != -1) {
                arrayFiguras.remove(ultimotriangulo());
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
            int pos = arrayFiguras.size() - 1;
            boolean exist = false;
            do  {
                if (arrayFiguras.get(pos).getTipo() == 1){ // verifica que el elemento sea del tipo buscado.
                    exist = true;
                    }
                else {pos --; }
            System.out.println("valor de ultimo " + pos + " valor de exist: " + exist);
            }while (!exist && pos >= 0) ; // verifica todas las posiciones del array hasta que es menos 1.
            System.out.println("valor de ultimo: " + pos);
            if (!exist){pos = -1;} // si no se encuentra el tipo de figura en todo el array devuelve un numero mayor al del tamaño del arrayFiguras.
            return pos;
        }
        
        public int ultimocuadrado(){
            int pos = arrayFiguras.size() - 1;
            boolean exist = false;
            do  {
                if (arrayFiguras.get(pos).getTipo() == 2){ // verifica que el elemento sea del tipo buscado.
                    exist = true;
                    }
                else {pos --; }
            System.out.println("valor de ultimo " + pos + " valor de exist: " + exist);
            }while (!exist && pos >= 0) ; // verifica todas las posiciones del array hasta que es menos 1.
            System.out.println("valor de ultimo: " + pos);
            if (!exist){pos = -1;} // si no se encuentra el tipo de figura en todo el array devuelve un numero mayor al del tamaño del arrayFiguras.
            return pos;
        }
        
        public int ultimotriangulo(){
            int i = 0;
            int pos = -1;
            for(Dibujar q: arrayFiguras){ //AQUI USO LA SENTENCIA "FOR EACH" EL PROBLEMA ES QUE RECORRE TODO EL ARRAYLIST...
            if (q.getTipo() == 3){
                pos = i;
                }
            i++;
            }
            System.out.println("valor de i: " + i);
            return pos;
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

