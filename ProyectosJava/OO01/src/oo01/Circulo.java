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
public class Circulo {   
    private int cantLados;
    private float pi;
    private char letra;
    private boolean recto;
    private int radios[]; //extiendo Circulo a Ovalo
    
    //metodo constructor
    public Circulo(){
    letra = 'c';
    cantLados = 0;
    pi = 3.14f;
    recto = false;
    radios = new int[2]; //tamaño del arreglo es 3 elementos
    radios[0] = 5;
    radios[1] = 6;
    }
    
    //Getter de circulo
    public char getletra (){
        return letra;
    }
    public int getcantLados(){
        return cantLados;
    }
    public float getpi(){
        return pi;
    }
    public boolean getrecto(){
        return recto;
    }
    public int getradio(){
        return radios[0]; //Para consultar como se gettean arrays.
    }
// Setters de circulo
    public void setletra (char letra){
        this.letra = letra;
    }
    public void setcantLados(int cantLados){
        this.cantLados = cantLados;
    }
    public void setpi(float pi){
        this.pi = pi;
    }
    public void setrecto(boolean recto){
        this.recto = recto;
    }
    public void setradio(int[] radios){
        this.radios = radios; //Para consultar como se gettean arrays.
    }

    //Devuelve la circunferencia del circulo según el rádio setteado.
    public float circunferencia(){
        return (2*pi*radios[0]);
    }
}
