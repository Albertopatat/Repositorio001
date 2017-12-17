package oo02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class OO02 extends JFrame {
	private static Graph panelGrafico;
		
        // * Modificar la clase Circulo de forma que ademas de la posicion, el color sea distinto en casa instancia.
	// * Agregar 2 botones mas que agreguen tanto rectanculos como triangulos.
	// * validar que no se dibuje nada fuera de la pantalla.
	// * Agregar un boton que elimine el ultimo objeto insertado.
	// * Agregar 3 botones que elimines segun corresponda el ultimo objeto insertado.
        
        // Todo funciona, excepto la reimpresion en pantalla ya que siguen apareciendo los objetos borrados hasta que se redimenciona, min o max, la vantana
	
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
                        Circulo q = new Circulo(x, y, dx, dy, color); 
			panelGrafico.addCirculo(q);
                        repaint();                        
                        }
		});
               
		JButton crearImagen2 = new JButton("Cuadrado");
		crearImagen2.setSize(60, 60);
		crearImagen2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
			int dx = 50;
			int dy = 50;
			int x = (int)((panelGrafico.getWidth() - dx) * Math.random()); // Restando ancho aparezca dentro de ventana
			int y = (int)((panelGrafico.getHeight() - dy) * Math.random()); // Restando ancho aparezca dentro de ventana
			Color color = new Color( (int)(Math.random() * 255), (int)(Math.random()* 255), (int)(Math.random()* 255));
                        Cuadrado j = new Cuadrado(x, y, dx, dy, color); 
			panelGrafico.addCuadrado(j);
                        repaint();
                        }
		});
               
		JButton crearImagen3 = new JButton("Triangulo");
		crearImagen3.setSize(60, 60);
		crearImagen3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
			int lados = 3; //Cantidad de lados
                        int dx = 50; //Ancho del triangulo
                        int dy = (int) Math.sqrt ((Math.pow(dx, 2) - Math.pow((dx/2), 2)));
			int xaux = (int)((panelGrafico.getWidth() - dx) * Math.random()); // Coordenada x primer punto, abajo a la izq.
                        int yaux = (int)(((panelGrafico.getHeight() - dy) * Math.random())+43); // Coordenada y primer punto, abajo a la izq.
                        int x[] = {xaux, xaux + 50, xaux + 25}; 
			int y[] = {yaux, yaux, yaux - dy}; // Restando un diametro y sumando un radio valido que aparezca dentro de ventana
			Color color = new Color( (int)(Math.random() * 255), (int)(Math.random()* 255), (int)(Math.random()* 255));
                        Triangulo m = new Triangulo(x, y, lados, color); 
                        panelGrafico.addTriangulo(m);
                        repaint();
                        }
                });
               
                JButton borraImagenes = new JButton("Borrar ultima");
		borraImagenes.setSize(60, 60);
		borraImagenes.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
			panelGrafico.borraultimo();
                        revalidate();
                        repaint();
                        }
		});
                
                JButton borracirculo = new JButton("Borrar circulo"); // NO LOS ACTIVO PORQUE SE SUPERPONEN LOS BOTONES
		borracirculo.setSize(60, 60);
		borracirculo.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
			panelGrafico.borracirculo();
                        revalidate();
                        repaint();
                        }
		});
		
                JButton borracuadrado = new JButton("Borrar cuadrado");
		borracuadrado.setSize(60, 60);
		borracuadrado.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
			panelGrafico.borracuadrado();
                        revalidate();
                        repaint();
                    }
		});
                
                JButton borratriangulo = new JButton("Borra triangulo");
		borratriangulo.setSize(60, 60);
		borratriangulo.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
			panelGrafico.borratriangulo();
                        revalidate();
                        repaint();
                    }
		});
                
                add(panelGrafico); // Imprime en pantalla los objetos
                // Envia a la ventana los botones.
                
                JPanel panelBotones = new JPanel(new GridLayout(10, 100, 1, 1));
                panelBotones.add(crearImagen);
                panelBotones.add(crearImagen2);
                panelBotones.add(crearImagen3);
                
                panelBotones.add(borracirculo);
                panelBotones.add(borracuadrado);
                panelBotones.add(borratriangulo);
                panelBotones.add(borraImagenes);
    
		add(panelBotones, BorderLayout.WEST); //boton a la region oeste
                add(panelGrafico, BorderLayout.CENTER);
                
                /*add(crearImagen,BorderLayout.NORTH);
                add(crearImagen2,BorderLayout.SOUTH);
                add(crearImagen3,BorderLayout.EAST);
                add(crearImagen4,BorderLayout.WEST);
                add(crearImagen5,BorderLayout.WEST);
                add(crearImagen6,BorderLayout.WEST);
                add(crearImagen7,BorderLayout.WEST);*/
                
                
                
	}    
	
        public static void main(String[] args) {
		JFrame ventana = new OO02();
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setSize(1000,600);
		ventana.setVisible(true);
                ventana.setBackground(Color.yellow);
                }              
    }
