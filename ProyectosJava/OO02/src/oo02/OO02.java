package oo02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;


public class OO02 extends JFrame {
	private static Graph panelGrafico;
	
	// * Modificar la clase Circulo de forma que ademas de la posicion, el color sea distinto en casa instancia.
	// * Agregar 2 botones mas que agreguen tanto rectanculos como triangulos.
	// * validar que no se dibuje nada fuera de la pantalla.
	// - Agregar un boton que elimine el ultimo objeto insertado.
	// - Agregar 3 botones que elimines segun corresponda el ultimo objeto insertado.
	
	public OO02(){
		panelGrafico = new Graph();
                 
               // panelGrafico2 = new Graph();
               // panelGrafico3 = new Graph();
                
		JButton crearImagen = new JButton("Circulo");
		crearImagen.setSize(60, 60);
		crearImagen.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
			int dx = 50;
			int dy = 50;
			int x = (int)((panelGrafico.getWidth() - dx) * Math.random()); // Restando un diametro y sumando un radio valido que aparezca dentro de ventana
			int y = (int)((panelGrafico.getHeight() - dy) * Math.random()); // Restando un diametro y sumando un radio valido que aparezca dentro de ventana
			Color color = new Color( (int)(Math.random() * 255), (int)(Math.random()* 255), (int)(Math.random()* 255));
                        System.out.println(color);
                        System.out.println("X: " + x +" Y:" + y);
                        Circulo q = new Circulo(x, y, dx, dy, color); 
			panelGrafico.addCirculo(q);
                    }
		});
               // panelGrafico2 = new Graph();
		JButton crearImagen2 = new JButton("Cuadrado");
		crearImagen2.setSize(60, 60);
		crearImagen2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
			int dx = 50;
			int dy = 50;
			int x = (int)((panelGrafico.getWidth() - dx) * Math.random()); // Restando ancho aparezca dentro de ventana
			int y = (int)((panelGrafico.getHeight() - dy) * Math.random()); // Restando ancho aparezca dentro de ventana
			Color color = new Color( (int)(Math.random() * 255), (int)(Math.random()* 255), (int)(Math.random()* 255));
                        System.out.println(color);
                        System.out.println("X: " + x +" Y:" + y);
                        Cuadrado j = new Cuadrado(x, y, dx, dy, color); 
			panelGrafico.addCuadrado(j);
                    }
		});
                //panelGrafico3 = new Graph();
		JButton crearImagen3 = new JButton("Triangulo");
		crearImagen3.setSize(60, 60);
		crearImagen3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
			int lados = 3; //Cantidad de lados
                        int dx = 50; //Ancho del triangulo
                        int dy = (int) Math.sqrt ((Math.pow(dx, 2) - Math.pow((dx/2), 2)));
			System.out.println(dy);
                        int xaux = (int)((panelGrafico.getWidth() - dx) * Math.random()); // Coordenada x primer punto, abajo a la izq.
                        int yaux = (int)(((panelGrafico.getHeight() - dy) * Math.random())+43); // Coordenada y primer punto, abajo a la izq.
                        
                        int x[] = {xaux, xaux + 50, xaux + 25}; 
			int y[] = {yaux, yaux, yaux - dy}; // Restando un diametro y sumando un radio valido que aparezca dentro de ventana
			Color color = new Color( (int)(Math.random() * 255), (int)(Math.random()* 255), (int)(Math.random()* 255));
                        Triangulo m = new Triangulo(x, y, lados, color); 
			panelGrafico.addTriangulo(m);
                    }
		});
		add(panelGrafico);
		add(crearImagen,BorderLayout.NORTH);
                add(crearImagen2,BorderLayout.SOUTH);
                add(crearImagen3,BorderLayout.EAST);
                
	}
	
	
	 public static void main(String[] args) {
		JFrame ventana = new OO02();
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setSize(600,600);
		ventana.setVisible(true);
}       }
