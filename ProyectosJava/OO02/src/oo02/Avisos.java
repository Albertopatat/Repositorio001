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
        
        private String mensaje = "No hay figura para borrar";
        private JLabel texto;
        
        public void setAviso (String mensaje){
                this.mensaje = mensaje;
        }    
        
        public String getAviso (){
                return mensaje;
        }
        
        public Avisos(){
                super("Aviso de Figuras"); //setea el titulo
                this.setSize(300, 120); //setea tamaño
                this.setLocation(200, 200); //setea la ubicacion
                this.getContentPane().setBackground(Color.YELLOW); //setea el color de fondo
                this.texto = new JLabel();
                this.texto.setFont(new Font("Stylus BT", 1, 20)); //Setea la fuente, el tipo y el tamaño según disponiblesn en Windows.
                this.texto.setForeground(Color.BLUE); //Setea el color de la fuente del objeto texto de la clase JLabel.
                this.texto.setText (mensaje); //Setea el texto del objeto.
                add(texto);
        }
    
        public Avisos(String mensaje){ 
                super("Aviso de Figuras"); //setea el titulo
                this.setSize(300, 120); //setea tamaño
                this.setLocation(200, 200); //setea la ubicacion
                this.getContentPane().setBackground(Color.YELLOW); //setea el color de fondo
                this.texto = new JLabel();
                this.texto.setFont(new Font("Stylus BT", 1, 20));
                this.texto.setForeground(Color.BLUE);
                this.texto.setText (mensaje);
                add(texto);
                System.out.println(mensaje);
        }
    
}
    

