import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;

public class Circle extends Shape implements java.awt.Shape, Serializable {

	
	
	private int x,y;
	private int r;
	public boolean move = false; 
	public boolean selected = false;
	private Color c = Color.BLACK;
	private Color originalColor = Color.BLACK;
	static ArrayList<Circle> circles = new ArrayList<Circle>();
	static int tag = 2;
	
	public Circle(int x,int y,int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public int getR() {
		return r;
	}
	public void setX(int x) {
		this.x = x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	public void setR(int r) {
		
		this.r = r;
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
		if(Math.pow(arg0 - this.getX(),2) + Math.pow(arg1 - this.getY(),2) < Math.pow(this.getR(), 2)) {
			return true;
		}
		else return false;
	}


	@Override
	public boolean contains(double arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Rectangle getBounds() {
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

	public void bigger() {
		r = r+10;
		
	}

	public void smaller() {
		r = r-10;
		
	}
	
	@Override
	public void draw(Graphics g) {
		
			if(this.isSelected()) {
			
				g.setColor(c);
		}
		else{g.setColor(originalColor);}
		g.drawOval((int)(x-r/2.0), (int)(y-r/2.0), r, r);
		
	}
//	@Override
//	public void render1(Graphics g) {
//		render(g);
//	}
	static void render(Graphics g) {
		for(Shape c : circles) {
			c.draw(g);
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
public int getTag() {
	// TODO Auto-generated method stub
	return tag;
}
	}

