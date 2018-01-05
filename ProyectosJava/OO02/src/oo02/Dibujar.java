/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// IMPORTANTE cuando se genera un arrayList de interface de objetos, para utilizar los metodos es necesario que aparezcan en la interface.
// en este caso getTipo está declarada dentro de la interface Dibujar
package oo02;

import java.awt.Graphics;

/**
 *
 * @author Pc 3
 */
public interface Dibujar {
   
    public void Dibujar(Graphics g);

    public int getTipo();
}
