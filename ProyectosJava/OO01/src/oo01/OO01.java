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
        
        System.out.print("cantidad de Lados: " + circulo.getcantLados() + "\n");
        //Imprimir el resto de las propiedades del objeto Circulo.
        System.out.println("Radio del círculo: " + circulo.getradio());
        System.out.println("Pi tiene un valor de: " + circulo.getpi());
        System.out.println("La letra de circulo es " + circulo.getletra());
        
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
        triangulo = new Triangulo('a', 3, 10, 20, 2);
        System.out.print("cantidad de Lados: " + triangulo.cantLados + "\n");
        System.out.println("Base del triangulo: " + triangulo.base);
        System.out.print("Altura del triangulo: " + triangulo.altura + "\n");
        System.out.println("La letra de cuadrado es " + triangulo.letra);
        System.out.println("El triangulo tiene: " + triangulo.dimensiones + " dimensiones");
        
        //Crear los setter y getter en Circulo. (comentar donde se imprimen las propiedades directamente).
        
        //Crear otra instancia de circulo.
        Circulo circulo2 = new Circulo();
        circulo2.setletra('E');
        char letracirculo = circulo2.getletra();
        System.out.println("La letra de circulo es " + letracirculo);
        //Crear un metodo Circunferencia en Circulo, que retorne la Circunferencia del Objeto circulo (dos veces el radio (r) por π).
        
        //setiar el radio de los circulos en 10 y 20 (Ambos radios en cada circulo).
        int radio[];
        radio = new int[2];
        
        radio[0]=10;
        circulo.setradio(radio);
                
        radio[0]=20;        
        circulo2.setradio(radio); //No entiendo porque el circulo1 se setea con los radios que mando a circulo2.
        
        System.out.println("La circunferencia del circulo de radio 10 es: " + circulo.circunferencia());
        System.out.println("Radios circulo1 es: " + circulo.getradio());
        System.out.println("La circunferencia del circulo de radio 20 es: " + circulo2.circunferencia());
        System.out.println("Radios circulo2 es: " + circulo2.getradio());
    }
}
