/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

/**
 *
 * @author Diego
 */
public class OO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        
        System.out.print("cantidad de Lados: " + circulo.cantLados + "\n");
        //Imprimir el resto de las propiedades del objeto Circulo.
        System.out.println("Radio del círculo: " + circulo.radios[1] + circulo.radios[0]);
        System.out.println("Pi tiene un valor de: " + circulo.pi);
        System.out.println("La letra de circulo es " + circulo.letra);
        
        //Crear una clase Cuadrado, con 6 propiedades
              
        //Instanciar la clase
        Cuadrado cuadrado = new Cuadrado();
        //Imprimir sus propiedades
        System.out.print("cantidad de Lados: " + cuadrado.cantLados + "\n");
        System.out.println("Base del cuadrado: " + cuadrado.base);
        System.out.print("Dimensiones del cuadrado: " + cuadrado.dimensiones[2] + "\n");
        System.out.println("La letra de cuadrado es " + cuadrado.letra);
        
        
        //Crear una clase Triangulo, con 6 propiedades
        //Instancia la clase. 
        //La clase triangulo, debe poder construirse pasandole los 6 paramentros. O sea, el contructor de la clase debe poder recibir 6 paramentro.
        Triangulo triangulo;
        triangulo = new Triangulo(3, 10, 20, 1, 1);
        
        //Crear los setter y getter en Circulo. (comentar donde se imprimen las propiedades directamente).
        //Crear otra instancia de circulo.
        //Crear un metodo Circunferencia en Circulo, que retorne la Circunferencia del Objeto circulo (dos veces el radio (r) por π).
        //setiar el radio de los circulos en 10 y 20 (Ambos radios en cada circulo).
        
        
    }
    
}
