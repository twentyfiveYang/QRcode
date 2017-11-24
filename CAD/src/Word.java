import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Word extends Shape implements java.awt.Shape, Serializable  {

	
	
	private int x,y;
	private int wordSize = 20;
	private String sentence;
	public boolean move = false; 
	public boolean selected = false;
	private Color c = Color.BLACK;
	private Color originalColor = Color.BLACK;
	static ArrayList<Word> Words = new ArrayList<Word>();
	static int tag = 4;
	
	public Word(int x,int y) {
		this.x = x;
		this.y = y;
		sentence = JOptionPane.showInputDialog("�����뵥��");
	}
	@Override
	public  int getTag() {
		return tag;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getString() {
		   return sentence;
		}
	
	public void setX(int x) {
		this.x = x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	
	public void setString(String s) {
		
		sentence = s;
	}
	
	
	@Override
	public void isMove() {
		move = true;
			
	}
	@Override
	public void isMoveFalse() {
		move = false;
			
	}
	@Override
	public boolean getMove() {
		return move;
			
	}
	
	public void bigger() {
			wordSize = wordSize+5;
	}

	public void smaller() {
		if(wordSize>0)
		wordSize = wordSize-5;
		
	}
	
	@Override
	public void draw(Graphics g) {
		
			if(this.isSelected()) {
			
				g.setColor(c);
		}
		else{g.setColor(originalColor);}
			
			g.setFont(new Font("Tahoma", Font.BOLD, wordSize));
			g.drawString(sentence, x, y);
			
	}
//	@Override
//	public void render1(Graphics g) {
//		render(g);
//	}
	static void render(Graphics g) {
		for(Shape s : Words) {
			s.draw(g);
		}
		
	}

	@Override
	public void changeColor(Color c) {
		this.c = c;
	}
	@Override
	public boolean isSelected() {
		return selected;
	}
	@Override
	public Color getOriginalColor() {
		return originalColor;
		
	}
	public void setSelected() {
		selected = true;
	}
	public void setSelectedFalse() {
		selected = false;
			
	}
public void changeOriginalColor(Color color) {
		
		originalColor = color;
		
		
	}

@Override
public boolean contains(Point2D arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean contains(Rectangle2D arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean contains(double arg0, double arg1) {
	int ww = (sentence.length()-1)*wordSize;
	int hh = wordSize;
	if(arg0>x && arg1>y && arg0-x<ww && arg1 - y<hh)
		return true;
	if(arg0<x && arg1>y && x-arg0<ww && arg1 - y<hh)
		return true;
	if(arg0<x && arg1<y && x-arg0<ww && y-arg1<hh)
		return true;
	if(arg0>x && arg1<y && arg0-x<ww && y-arg1<hh)
		return true;
	return false;
	
	
}

@Override
public boolean contains(double arg0, double arg1, double arg2, double arg3) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public java.awt.Rectangle getBounds() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Rectangle2D getBounds2D() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public PathIterator getPathIterator(AffineTransform arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public PathIterator getPathIterator(AffineTransform arg0, double arg1) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean intersects(Rectangle2D arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean intersects(double arg0, double arg1, double arg2, double arg3) {
	// TODO Auto-generated method stub
	return false;
}
	}
