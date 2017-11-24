import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;

public class Rectangle extends Shape implements java.awt.Shape, Serializable  {

	
	
	private int x,y;            
	private int width,height;
	public boolean move = false; 
	public boolean selected = false;
	private Color c = Color.BLACK;
	private Color originalColor = Color.BLACK;
	static ArrayList<Rectangle> Rectangles = new ArrayList<Rectangle>();
	static int tag = 3;
	
	public Rectangle(int x,int y,int w,int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
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
	public int getW() {
	   return width;
	}
	public int getH() {
		   return height;
		}
	
	public void setX(int x) {
		this.x = x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	public void setW(int w) {
		
		width = w;
	}
	public void setH(int h) {
		
		height = h;
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
		double k = (double)width/(double)height;
		height = height + 10;
		width = width + (int)(10*k);
	}

	public void smaller() {
		double k = (double)width/(double)height;
		height = height - 10;
		width = width - (int)(10*k);
		
	}
	
	@Override
	public void draw(Graphics g) {
		
			if(this.isSelected()) {
			
				g.setColor(c);
		}
		else{g.setColor(originalColor);}
		g.drawRect(x, y, width, height);;
		
	}
//	@Override
//	public void render1(Graphics g) {
//		render(g);
//	}
	static void render(Graphics g) {
		for(Shape rec : Rectangles) {
			rec.draw(g);
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
	
	if(arg0>x && arg1>y && arg0-x<width && arg0-x>5 && arg1 - y<height && arg1 - y>5)
		return true;
//	if(arg0<x && arg1>y && x-arg0<width && arg1 - y<height)
//		return true;
//	if(arg0<x && arg1<y && x-arg0<width && y-arg1<height)
//		return true;
//	if(arg0>x && arg1<y && arg0-x<width && y-arg1<height)
//		return true;
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

