/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

/**
 *
 * @author Alberto
 */
public class Cuadrado {
    int cantLados;
    float base;
    char letra;
    boolean recto;
    int dimensiones[];
    
    //metodo constructor
    public Cuadrado(){
    letra = 'b';
    cantLados = 4;
    base = 10;
    recto = false;
    dimensiones = new int[3]; //tamaño del arreglo es 3 elementos
    dimensiones[0] = 1;
    dimensiones[1] = 2;
    dimensiones[2] = 3;
    }  
}
