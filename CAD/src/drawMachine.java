import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class drawMachine extends JFrame{
	int width,height;
	ArrayList<Shape> shapes = new ArrayList<Shape>();
//	ArrayList<Shape> drawnShapes = new ArrayList<Shape>();
	int startX,startY,endX,endY,r;
	int rstartX,rstartY,rendX,rendY;
	int movedX1,movedX2,movedY1,movedY2;
	int circleMovedX,circleMovedY,RecMovedX,RecMovedY;
	int flag = 0;
	int selectedShape = 0;
	static int changeScale = 0;
	boolean buttonC = false;
	int changeColor = 0;
	int colorFlag = 0;
	String sentence;
	ArrayList<Shape> allShapes = new ArrayList<Shape>();
	int lineNum,circleNum,recNum,wordNum;
	
	
	
	public drawMachine(int width,int height) {
		this.width = width;
		this.height = height;
		
	}
	//*********************************************************************************
		private class ColorsPanel extends JPanel {
			
			
			public ColorsPanel() {
				setLayout(new GridLayout(0,3));
				setLocation(150,800);
				
				JButton green = new JButton("");
				green.setBackground(new Color(0, 125, 0));
				green.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 1;
						
					}
				});
				
				JButton magenta = new JButton("");
				magenta.setBackground(Color.magenta);
				magenta.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 2;
						
					}
				});
				
				JButton blue = new JButton("");
				blue.setBackground(Color.blue);
				blue.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 3;
						
					}
				});

				JButton gray = new JButton("");
				gray.setBackground(Color.gray);
				gray.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 4;
						
					}
				});
				
				
				JButton cyan = new JButton("");
				cyan.setBackground(Color.cyan);
				cyan.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 5;
						
					}
				});
				
				JButton orange = new JButton("");
				orange.setBackground(Color.orange);
				orange.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 6;
						
					}
				});
				
				JButton pink = new JButton("");
				pink.setBackground(Color.pink);
				pink.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 7;
						
					}
				});
				
				JButton yellow = new JButton("");
				yellow.setBackground(Color.yellow);
				yellow.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 8;
						
					}
				});
				
				JButton lightGray = new JButton("");
				lightGray.setBackground(Color.lightGray);
				lightGray.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						colorFlag = 9;
						
					}
				});
				
				this.add(blue);
				this.add(lightGray);
				this.add(yellow);
				this.add(pink);
				this.add(orange);
				this.add(magenta);
				this.add(cyan);				
				this.add(gray);				
				this.add(green);
				
			}
			
		}
	//*********************************************************************************
	private class ButtonsPanel extends JPanel {
		JButton btnLine = new JButton();
		JButton btnCir = new JButton();
		JButton btnWord = new JButton();
		JButton btnRect = new JButton();
		JButton btnHelp = new JButton("help");
		JButton btnSave = new JButton("Save");
		JButton btnOpen = new JButton("Open");
		 
		
		
		public ButtonsPanel() {
			 this.setSize(150, 800);
			 this.setLocation(650, 0);
			 this.setLayout(new GridLayout(12, 0));

			 btnLine.setIcon(new ImageIcon("Line.png"));
			 btnLine.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					flag = 1;
					buttonC = true;
				}
			});
			btnCir.setIcon(new ImageIcon("Circle.png"));
			btnCir.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					flag = 2;
					buttonC = true;
				}
			});
			btnRect.setIcon(new ImageIcon("Rec.png"));
			btnRect.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					flag = 3;
					buttonC = true;
					
				}
			});
			btnWord.setIcon(new ImageIcon("word.png"));
			btnWord.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					flag = 4;
					buttonC = true;
					
				}
			});
			
			btnHelp.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

					Notice notice = new Notice();
					
					
				}
			});
			btnSave.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String fileName = JOptionPane.showInputDialog("请输入保存文件名：");
					ObjectOutputStream out;
					lineNum = 0;
					circleNum = 0;
					recNum = 0;
					wordNum = 0;
					
					
					for(Shape s : Line.lines)
					{
						allShapes.add(s);
						lineNum = lineNum + 1;
					}
					for(Shape s : Circle.circles)
					{
						allShapes.add(s);
						circleNum = circleNum + 1;
					}
					for(Shape s : Rectangle.Rectangles)
					{
						allShapes.add(s);
						recNum = recNum + 1;
					}
					for(Shape s : Word.Words)
					{
						allShapes.add(s);
						wordNum = wordNum + 1;
					}

					try {
						out = new ObjectOutputStream(new FileOutputStream(fileName));
						out.writeObject(allShapes);
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
				}
			});
			btnOpen.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String fileName = JOptionPane.showInputDialog("请输入要打开的文件名：");
					flag = 5;
					try {
						ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
					
						try {
							allShapes =  (ArrayList<Shape>) in.readObject();
							

							
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
				}
			});
			this.add(btnLine);
			this.add(btnCir);
			this.add(btnRect);
			this.add(btnWord);
			this.add(btnHelp);
			this.add(btnSave);
			this.add(btnOpen);
			this.add(new ColorsPanel());
			this.setBackground(new Color(250, 250, 250));
			
		}
	}
		
	//*********************************************************************************
	
	private class ShapesPanel extends JPanel {
		
		
		int time = 0;
		int clickedX,clickedY;
		int mouseAct = 0;
		
		public ShapesPanel() {
			this.setBackground(new Color(200, 200, 200));
			this.setSize(650, 800);
			this.setLocation(0, 0);
			this.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
		
					if(e.getKeyChar() == '+') {
						changeScale = 1;
						System.out.println("+++++++++ ");
					}
						
					if(e.getKeyChar() == '-') {
						changeScale = 2;
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
			
			this.addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					
					if(mouseAct == 1)
								{
									endX = e.getX();  
								    endY = e.getY(); 
								    System.out.println("DRAGGED  "+startX+" "+startY+" "+endX+" "+endY+" flag = "+flag);
								    if(flag==1) {
								          shapes.add(new Line(startX, startY, endX, endY));
								            			}
								    if(flag==2) {
										  r = (int)Math.sqrt((endX-startX)*(endX-startX)+(endY-startY)*(endY-startY));
										  shapes.add(new Circle(startX, startY,r));
								            			}
								    if(flag==3) {
										 
										  shapes.add(new Rectangle(startX, startY, Math.abs(endX-startX), Math.abs(endY-startY)));
								            			}
								    if(flag==4) {
								    	shapes.add(new Word(startX, startY)); 
								            			}
			            
								}
					
					if(mouseAct == 3) {
						 rendX = e.getX();
						 rendY = e.getY();
						 System.out.println("RIGHT DRAGGED  " + "rstartX = " + rstartX + "rstartY = " + rstartY + "rendX = " + rendX + "rendY = " + rendY);
						
						 if(selectedShape == 1) {
//							 for(Shape s : Circle.circles) {
//									s.changeColor(Color.black);
//								}
										 for(int i = 0;i < Line.lines.size();i++) 
									 	 {
											 Line l = Line.lines.get(i);
											 if(l.getMove()) {
												 if(rendX!=0 && rstartX!=0)
												 {
													 if((rendX - rstartX) == 0) {System.out.println("break ");
													 System.out.println("X1 = "+ l.getX1() + " X2 = "+ l.getX2() + " Y1 = "+ l.getY1() +" Y2 = "+ l.getY2()+" (rendX - rstartX) = " + (rendX - rstartX));
													 break;}
													 else {
															  movedX1 = (l.getX1()+(rendX - rstartX));
															  movedX2 = (l.getX2()+(rendX - rstartX));
															  movedY1 = (l.getY1()+(rendY - rstartY));
															  movedY2 = (l.getY2()+(rendY - rstartY));
													 }
												
												 	 }
												
												 
											 }
											 shapes.add(new Line(movedX1,movedY1,movedX2,movedY2));
										 }
						 }
						 
						 if(selectedShape == 2) {
//							 for(Shape s : Line.lines) {
//									s.changeColor(Color.black);
//								}
											 for(int i = 0;i < Circle.circles.size();i++) 
										 	 {
												 Circle c = Circle.circles.get(i);
												 if(c.getMove()) {
													 if(rendX!=0 && rstartX!=0)
													 {
														 if((rendX - rstartX) == 0) {System.out.println("break ");
														 System.out.println("X = "+ c.getX() + " Y = "+ c.getY() + " R = "+ c.getR() + " (rendX - rstartX) = " + (rendX - rstartX));
														 break;}
														 else {
					//											  circleMovedX = (c.getX()+(rendX - rstartX));
					//											  circleMovedY = (c.getY()+(rendX - rstartX));
															 circleMovedX = rendX;
															  circleMovedY = rendY;
															  
														 }
													
													 	 }
													 c.setX(circleMovedX);
													 c.setY(circleMovedY);
													
													 
												 }
												// shapes.add(new Circle(circleMovedX,circleMovedY,c.getR()));
											 } 
										}
						 if(selectedShape == 3) {

											 for(int i = 0;i < Rectangle.Rectangles.size();i++) 
										 	 {
												 Rectangle rec = Rectangle.Rectangles.get(i);
												 if(rec.getMove()) {
													 if(rendX!=0 && rstartX!=0)
													 {
														 if((rendX - rstartX) == 0) {System.out.println("break ");
														 break;}
														 else {

															 RecMovedX = rendX;
															 RecMovedY = rendY;
															  
														 }
													
													 	 }
													 rec.setX(RecMovedX);
													 rec.setY(RecMovedY);
													
													 
												 }

											 } 
										}
						 if(selectedShape == 4) {

							 for(int i = 0;i < Word.Words.size();i++) 
						 	 {
								 Word w = Word.Words.get(i);
								 if(w.getMove()) {
									 if(rendX!=0 && rstartX!=0)
									 {
										 if((rendX - rstartX) == 0) {System.out.println("break ");
										 break;}
										 else {

											 RecMovedX = rendX;
											 RecMovedY = rendY;
											  
										 }
									
									 	 }
									 w.setX(RecMovedX);
									 w.setY(RecMovedY);
									
									 
								 }

							 } 
						}
					}
				}
				
				
			});
			
			this.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					if(mouseAct == 1)
					{
						endX = e.getX();  
						endY = e.getY(); 
		         
						System.out.println("LEFT RELEASED  "+startX+" "+startY+" "+endX+" "+endY+" flag = "+flag);
							if(flag==1) { 
											Line.lines.add(new Line(startX, startY, endX, endY));
											shapes.clear();
									}
							if(flag==2) { 
											Circle.circles.add(new Circle(startX, startY,r));
											shapes.clear();
									}
							if(flag==3) {
								 
								  Rectangle.Rectangles.add(new Rectangle(startX, startY, Math.abs(endX-startX), Math.abs(endY-startY)));
								  shapes.clear();
								  }
							 if(flag==4) {
								
								  Word.Words.add(new Word(startX, startY));
								  shapes.clear();
						            			}
			          }
					if(mouseAct == 3) {
						
								rendX = e.getX();
								rendY = e.getY();
								System.out.println("RIGHT RELEASED  " + "rstartX = " + rstartX + "rstartY = " + rstartY + "rendX = " + rendX + "rendY = " + rendY);
								shapes.clear();
								if(selectedShape == 1) {
//										for(Shape s : Circle.circles) {
//											s.changeColor(Color.black);
//										}
										 for(int i = 0;i < Line.lines.size();i++) 
									 	 {
											 Line l = Line.lines.get(i);
											 if(l.getMove()) {
												 if(rendX!=0 && rstartX!=0)
												 {
													 if((rendX - rstartX) == 0) {System.out.println("break ");
													 System.out.println("X1 = "+ l.getX1() + " X2 = "+ l.getX2() + " Y1 = "+ l.getY1() +" Y2 = "+ l.getY2()+" (rendX - rstartX) = " + (rendX - rstartX));
													 break;}
													 else {
															  movedX1 = (l.getX1()+(rendX - rstartX));
															  movedX2 = (l.getX2()+(rendX - rstartX));
															  movedY1 = (l.getY1()+(rendY - rstartY));
															  movedY2 = (l.getY2()+(rendY - rstartY));
													 }
												
												 	 }
												 l.setX1(movedX1);
												 l.setX2(movedX2);
												 l.setY1(movedY1);
												 l.setY2(movedY2);
												 
											 }
											 
										 }
								}
								if(selectedShape == 2) {
//									for(Shape s : Line.lines) {
//										s.changeColor(Color.black);
//									}
											 for(int i = 0;i < Circle.circles.size();i++) 
										 	 {
												 Circle c = Circle.circles.get(i);
												 if(c.getMove()) {
													 if(rendX!=0 && rstartX!=0)
													 {
														 if((rendX - rstartX) == 0) {System.out.println("break ");
														 System.out.println("X = "+ c.getX() + " Y = "+ c.getY() + " R = "+ c.getR() + " (rendX - rstartX) = " + (rendX - rstartX));
														 break;}
														 else {
			//													  circleMovedX = (c.getX()+(rendX - rstartX));
			//													  circleMovedY = (c.getY()+(rendX - rstartX));
															 circleMovedX = rendX;
															  circleMovedY = rendY;
														 }
													
													 	 }
													 c.setX(circleMovedX);
													 c.setY(circleMovedY);
													
													 
												 }
												 
											 }
								}
								if(selectedShape == 3) {

									 for(int i = 0;i < Rectangle.Rectangles.size();i++) 
								 	 {
										 Rectangle rec = Rectangle.Rectangles.get(i);
										 if(rec.getMove()) {
											 if(rendX!=0 && rstartX!=0)
											 {
												 if((rendX - rstartX) == 0) {System.out.println("break ");
												 break;}
												 else {

													 RecMovedX = rendX;
													 RecMovedY = rendY;
													  
												 }
											
											 	 }
											 rec.setX(RecMovedX);
											 rec.setY(RecMovedY);
											
											 
										 }

									 } 
								}
								if(selectedShape == 4) {

									 for(int i = 0;i < Word.Words.size();i++) 
								 	 {
										 Word w = Word.Words.get(i);
										 if(w.getMove()) {
											 if(rendX!=0 && rstartX!=0)
											 {
												 if((rendX - rstartX) == 0) {System.out.println("break ");
												 break;}
												 else {

													 RecMovedX = rendX;
													 RecMovedY = rendY;
													  
												 }
											
											 	 }
											 w.setX(RecMovedX);
											 w.setY(RecMovedY);
											
											 
										 }

									 } 
								}
								rstartX = rendX;
								rstartY = rendY;
								shapes.clear();
					}
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getButton() == MouseEvent.BUTTON1) {
						mouseAct = 1;
					}
					if(e.getButton() == MouseEvent.BUTTON3) {
						mouseAct = 3;
					}
					
					if(mouseAct == 1) {
						System.out.println("LEFT PRESSED");
						startX = e.getX();  
						startY = e.getY();  
		             }
					if(mouseAct == 3) {
			             
					
			             flag = 0;
			             rstartX = e.getX();  
						 rstartY = e.getY();  
						  System.out.println("RIGHT PRESSED  " + "rstartX = " + rstartX + "rstartY = " + rstartY + "rendX = " + rendX + "rendY = " + rendY);
					}
					
				
				}
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					 //System.out.println("ENTERED "+"X = "+e.getX()+" Y = "+e.getY());
					 
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if(mouseAct == 3) {
					clickedX = e.getX();
					clickedY = e.getY();
					 
					System.out.println(" right Clicked! "+ "clickedX = " + clickedX +" clickedY = "+clickedY); }
					
				 
					
				}
			});
			
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			 super.paintComponent(g);
			 g.setColor(new Color(0,0,0));
			 if(buttonC) {
					this.requestFocus();
				}
			if( shapes.size()>0 )
			{
				shapes.get(shapes.size()-1).draw(g);
			}
			
			 Line.render(g);
			 Circle.render(g);
			 Rectangle.render(g);
			 Word.render(g);
			 for(int i = 0;i < Line.lines.size();i++) 
		 	 {
				 
				 Line l = Line.lines.get(i);
				 double k1 =  (double)(l.getY1()-l.getY2())/ (double)(l.getX1()-l.getX2());
				 double k2 = (double)(clickedY-l.getY2())/ (double)(clickedX-l.getX2());
				 if(k1>0 && k2>0 && Math.abs(k1-k2)<0.1) {

					 for(Shape s : Circle.circles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Rectangle.Rectangles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Word.Words) {
						 if(s.isSelected()) {
							 
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 l.setSelected();
					 if( l.isSelected())
					 { l.changeColor(Color.RED);}
					 l.isMove();
					 selectedShape = 1;
					// System.out.println(" x1 = " + l.getX1() + " x2 = " + l.getX2() + " y1 = " + l.getY1() + " y2 = " + l.getY2());
					 for(int j = 0;j < i;j++)
					  {
						 Line.lines.get(j).isMoveFalse();
						 Line.lines.get(j).setSelectedFalse();
						 
						 
						 System.out.println("hello world1");
					 }
					 for(int j = i+1;j < Line.lines.size();j++)
					  {
						 Line.lines.get(j).isMoveFalse();
						 Line.lines.get(j).setSelectedFalse();
						
						 System.out.println("hello world11");
					 }
					 if(changeScale == 1) {
						 System.out.println("bigger");
						l.bigger();
						changeScale = 0;
					 }
					 if(changeScale == 2) {
						 System.out.println("smaller");
						 l.smaller();
						 changeScale = 0;
						 }
					 if(colorFlag == 1) {
						 System.out.println("change color green");
						 l.changeOriginalColor(new Color(0, 125, 0));
						// l.setSelectedFalse();
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 2) {
						 System.out.println("change color magenta");
						 l.changeOriginalColor(Color.MAGENTA);
						// l.setSelectedFalse();
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 3) {
						 
						 l.changeOriginalColor(Color.blue);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 4) {
						
						 l.changeOriginalColor(Color.gray);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 5) {
						
						 l.changeOriginalColor(Color.cyan);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 6) {
						 
						 l.changeOriginalColor(Color.orange);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 7) {
						 
						 l.changeOriginalColor(Color.pink);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 8) {
						
						 l.changeOriginalColor(Color.yellow);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 9) {
						
						 l.changeOriginalColor(Color.lightGray);
						
						 colorFlag = 0;
					 }
				 }
				 
				 if(k1<0 && k2<0 && Math.abs(k1-k2)<0.1) {
					
					 for(Shape s : Circle.circles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Rectangle.Rectangles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 l.setSelected();
					 if( l.isSelected())
					 { l.changeColor(Color.RED);}
					 { l.changeColor(Color.RED);}
					 l.isMove();
					 selectedShape = 1;
					 for(int j = 0;j < i;j++)
					  {
						 Line.lines.get(j).isMoveFalse();
						 Line.lines.get(j).setSelectedFalse();
						
						 System.out.println("hello world2");
					 }
					 for(int j = i+1;j < Line.lines.size();j++)
					  {
						 Line.lines.get(j).isMoveFalse();
						 Line.lines.get(j).setSelectedFalse();

						 System.out.println("hello world22");
					 }
					 for(Shape s : Word.Words) {
						 if(s.isSelected()) {
							 
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 if(changeScale == 1) {
						 System.out.println("bigger");
						l.bigger();
						changeScale = 0;
						
					 }
					 if(changeScale == 2) {
						 System.out.println("smaller");
						 l.smaller();
						 changeScale = 0;
						 }
					 if(colorFlag == 1) {
						 System.out.println("change color green");
						 l.changeOriginalColor(new Color(0, 125, 0));
						 //l.setSelectedFalse();
						 
						 colorFlag = 0;
						 
					 }
					 if(colorFlag == 2) {
						 System.out.println("change color magenta");
						 l.changeOriginalColor(Color.MAGENTA);
						// l.setSelectedFalse();
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 3) {
						 
						 l.changeOriginalColor(Color.blue);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 4) {
						
						 l.changeOriginalColor(Color.gray);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 5) {
						
						 l.changeOriginalColor(Color.cyan);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 6) {
						 
						 l.changeOriginalColor(Color.orange);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 7) {
						 
						 l.changeOriginalColor(Color.pink);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 8) {
						
						 l.changeOriginalColor(Color.yellow);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 9) {
						
						 l.changeOriginalColor(Color.lightGray);
						
						 colorFlag = 0;
					 }
				 }
				
				
				
		 	 }
			 
			 for(int i = 0;i < Circle.circles.size();i++) {
				
				 Circle c = Circle.circles.get(i);
				 
				 if(c.contains(clickedX,clickedY)) {

					 for(Shape s : Line.lines) {
						 if(s.isSelected()) {
							 
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Rectangle.Rectangles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Word.Words) {
						 if(s.isSelected()) {
							 
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 c.setSelected();
					 if( c.isSelected())
					 { c.changeColor(Color.RED);}
					 c.isMove();
					 selectedShape = 2;
					 for(int j = 0;j < i;j++)
					  {
						 Circle.circles.get(j).isMoveFalse();
						 Circle.circles.get(j).setSelectedFalse();
						 System.out.println("hello world3");
					 }
					 for(int j = i+1;j < Circle.circles.size();j++)
					  {
						 Circle.circles.get(j).isMoveFalse();
						 Circle.circles.get(j).setSelectedFalse();
						 System.out.println("hello world33");
					 }
					 if(changeScale == 1) {
						 System.out.println("bigger");
						c.bigger();
						changeScale = 0;
						
					 }
					 if(changeScale == 2) {
						 System.out.println("smaller");
						 c.smaller();
						 changeScale = 0;
						 }
					 if(colorFlag == 1) {
						 System.out.println("change color green");
						 c.changeOriginalColor(new Color(0, 125, 0));
						 //l.setSelectedFalse();
						 
						 colorFlag = 0;
						 
					 }
					 if(colorFlag == 2) {
						 System.out.println("change color magenta");
						 c.changeOriginalColor(Color.MAGENTA);
						// l.setSelectedFalse();
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 3) {
						 
						 c.changeOriginalColor(Color.blue);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 4) {
						
						 c.changeOriginalColor(Color.gray);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 5) {
						
						 c.changeOriginalColor(Color.cyan);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 6) {
						 
						 c.changeOriginalColor(Color.orange);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 7) {
						 
						 c.changeOriginalColor(Color.pink);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 8) {
						
						 c.changeOriginalColor(Color.yellow);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 9) {
						
						 c.changeOriginalColor(Color.lightGray);
						
						 colorFlag = 0;
					 }
				 }
				 
				 

			 }
			 
			 for(int i = 0;i < Rectangle.Rectangles.size();i++) {
					
				 Rectangle rec = Rectangle.Rectangles.get(i);
				 
				 if(rec.contains(clickedX,clickedY)) {

					 for(Shape s : Line.lines) {
						 if(s.isSelected()) {
							 
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Circle.circles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Word.Words) {
						 if(s.isSelected()) {
							 
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 rec.setSelected();
					 if( rec.isSelected())
					 { rec.changeColor(Color.RED);}
					 rec.isMove();
					 selectedShape = 3;
					 for(int j = 0;j < i;j++)
					  {
						 Rectangle.Rectangles.get(j).isMoveFalse();
						 Rectangle.Rectangles.get(j).setSelectedFalse();
						 System.out.println("hello world4");
					 }
					 for(int j = i+1;j < Rectangle.Rectangles.size();j++)
					  {
						 Rectangle.Rectangles.get(j).isMoveFalse();
						 Rectangle.Rectangles.get(j).setSelectedFalse();
						 System.out.println("hello world44");
					 }
					 if(changeScale == 1) {
						 System.out.println("bigger");
						rec.bigger();
						changeScale = 0;
						
					 }
					 if(changeScale == 2) {
						 System.out.println("smaller");
						 rec.smaller();
						 changeScale = 0;
						 }
					 if(colorFlag == 1) {
						 System.out.println("change color green");
						 rec.changeOriginalColor(new Color(0, 125, 0));
						 //l.setSelectedFalse();
						 
						 colorFlag = 0;
						 
					 }
					 if(colorFlag == 2) {
						 System.out.println("change color magenta");
						 rec.changeOriginalColor(Color.MAGENTA);
						// l.setSelectedFalse();
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 3) {
						 
						 rec.changeOriginalColor(Color.blue);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 4) {
						
						 rec.changeOriginalColor(Color.gray);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 5) {
						
						 rec.changeOriginalColor(Color.cyan);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 6) {
						 
						 rec.changeOriginalColor(Color.orange);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 7) {
						 
						 rec.changeOriginalColor(Color.pink);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 8) {
						
						 rec.changeOriginalColor(Color.yellow);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 9) {
						
						 rec.changeOriginalColor(Color.lightGray);
						
						 colorFlag = 0;
					 }
				 }
				 
				 

			 }
			 for(int i = 0;i < Word.Words.size();i++) {
					
				 Word w = Word.Words.get(i);
				 
				 if(w.contains(clickedX,clickedY)) {

					 for(Shape s : Line.lines) {
						 if(s.isSelected()) {
							 
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Rectangle.Rectangles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 for(Shape s : Circle.circles) {
						 if(s.isSelected()) {
							 s.changeColor(s.getOriginalColor());
						 }
					 }
					 w.setSelected();
					 if( w.isSelected())
					 { w.changeColor(Color.RED);}
					 w.isMove();
					 selectedShape = 4;
					 for(int j = 0;j < i;j++)
					  {
						 Word.Words.get(j).isMoveFalse();
						 Word.Words.get(j).setSelectedFalse();
						 System.out.println("hello world5");
					 }
					 for(int j = i+1;j < Word.Words.size();j++)
					  {
						 Word.Words.get(j).isMoveFalse();
						 Word.Words.get(j).setSelectedFalse();
						 System.out.println("hello world55");
					 }
					 if(changeScale == 1) {
						 System.out.println("bigger");
						w.bigger();
						changeScale = 0;
						
					 }
					 if(changeScale == 2) {
						 System.out.println("smaller");
						 w.smaller();
						 changeScale = 0;
						 }
					 if(colorFlag == 1) {
						 System.out.println("change color green");
						 w.changeOriginalColor(new Color(0, 125, 0));
					
						 colorFlag = 0;
						 
					 }
					 if(colorFlag == 2) {
						 System.out.println("change color magenta");
						 w.changeOriginalColor(Color.magenta);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 3) {
						 
						 w.changeOriginalColor(Color.blue);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 4) {
						
						 w.changeOriginalColor(Color.gray);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 5) {
						
						 w.changeOriginalColor(Color.cyan);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 6) {
						 
						 w.changeOriginalColor(Color.orange);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 7) {
						 
						 w.changeOriginalColor(Color.pink);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 8) {
						
						 w.changeOriginalColor(Color.yellow);
						
						 colorFlag = 0;
					 }
					 if(colorFlag == 9) {
						
						 w.changeOriginalColor(Color.lightGray);
						
						 colorFlag = 0;
					 }
					 
					
				 }
				 
				 

			 }

			 
			 if(flag == 5)
			 {
				 Line.lines.clear();
				 for(int j = 0;j < lineNum;j++) {
					 Line.lines.add((Line) allShapes.get(j));
				 }
				 Circle.circles.clear();
				 for(int k = lineNum;k < lineNum+circleNum;k++) {
					 Circle.circles.add((Circle) allShapes.get(k));
				 }
				 Rectangle.Rectangles.clear();
				 for(int m = lineNum+circleNum;m < lineNum+circleNum+recNum;m++) {
					 Rectangle.Rectangles.add((Rectangle) allShapes.get(m));
				 }
				 Word.Words.clear();
				 for(int p = lineNum+circleNum+recNum;p < lineNum+circleNum+recNum+wordNum;p++) {
					 Word.Words.add((Word) allShapes.get(p));
				 }
				 
			 
			 }

			 repaint();
			 
		}

		
		
	}

	//*********************************************************************************
	
	
	public void draw()
	{
		this.setTitle("CAD");
		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().createImage("a.jpg"));
		this.setLayout(null);
		this.add(new ShapesPanel());
		this.add(new ButtonsPanel());
		this.setLocationRelativeTo(null);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	//*********************************************************************************
	
	
	public static void main(String[] args) {
		drawMachine cad = new drawMachine(800, 800);
		cad.draw();
	}

}
