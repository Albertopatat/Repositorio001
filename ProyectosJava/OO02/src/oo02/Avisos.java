/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author Pc 3
 */
public class Avisos extends JFrame {
        
        private String mensaje = "No hay figura para borrar";  //Al crear un nuevo objeto, el mismo tendra esto como valor inicial de mensaje
        private JLabel texto;
        
        //Al crear un instancia de una clase, un objeto, lo hace según el método constructor que se llame. 
        // a su vez inicializa los atributos con los valores seteados en ese momento. En este caso siempre utiliza el valor
        // original del atributo mensaje. Por esta razón en el mismo setter debe asignarse al objeto texto el nuevo valor de la variable o atributo.
               
        public Avisos(String mensaje){ // Metodo constructor recibe como parametro el mensaje del aviso.
                super("Aviso de Figuras"); //setea el titulo
                setSize(300, 120); //setea tamaño
                setLocation(200, 200); //setea la ubicacion
                getContentPane().setBackground(Color.YELLOW); //setea el color de fondo
                texto = new JLabel();
                texto.setFont(new Font("Stylus BT", 1, 20));
                texto.setForeground(Color.BLUE);
                texto.setText (mensaje);
                this.add(texto);
        }
        
        public Avisos(){ // Metodo constructor MISMO NOMBRE QUE LA CLASE!!, define el valor inicial de la variable mensaje.
                super("Aviso de Figuras"); //setea el titulo
                
                setSize(300, 120); //setea tamaño
                setLocation(200, 200); //setea la ubicacion
                getContentPane().setBackground(Color.YELLOW); //setea el color de fondo
                texto = new JLabel();
                texto.setFont(new Font("Stylus BT", 1, 20)); //Setea la fuente, el tipo y el tamaño según disponiblesn en Windows.
                texto.setForeground(Color.BLUE); //Setea el color de la fuente del objeto texto de la clase JLabel.
                texto.setText (mensaje); //Setea el texto del objeto.
                this.add(texto);
        }
        
        
        public void setAviso (String mensaje){
                this.mensaje = mensaje;
                texto.setText (mensaje); //setter en objeto creado y setter dentro del objeto anidado.
        }    
        
        public String getAviso (){
                return mensaje;
        }
           
        
    
}
    

