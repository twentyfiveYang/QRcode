package cadTest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class drawMachine extends JFrame{
	
		
		private class drawPanel extends JPanel {
			
			private int x,y;
			boolean buttonC = false;
			
			public drawPanel() {
				JButton b = new JButton("bbb");
				b.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						System.out.println("bbbbb~");
						buttonC = true;
					}
				});
				this.add(b);
				
				this.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
			
						if(e.getKeyChar() == '+') {
							
							System.out.println("+++++++++ ");
						}
							
						if(e.getKeyChar() == '-') {
							
							System.out.println("---------");
						}
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
					
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						
					}
					
				});
				 this.setFocusable(true);
				this.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						x = arg0.getX();
						y = arg0.getY();
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						System.out.println("pressed ");
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
				
				
			}
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
				if(buttonC) {
					this.requestFocus();
				}
				g.setColor(Color.BLUE);
				
				g.drawOval(x, y, 10, 10);
				g.drawLine(0, 0, 30, 100);
				repaint();
			}
		}
		
		public void draw()
		{		
			
			this.setTitle("cadTest");
			this.setSize(800, 800);
			this.add(new drawPanel());
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
		}
	public drawMachine() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
	
				if(e.getKeyChar() == '+') {
					
					System.out.println("+++++++++ ");
				}
					
				if(e.getKeyChar() == '-') {
				
					System.out.println("---------");
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			
		});
		 this.setFocusable(true);
	}

	
	
	
	public static void main(String[] args) {
		drawMachine d = new drawMachine();
		d.draw();
	}
}


