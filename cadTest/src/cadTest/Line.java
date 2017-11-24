package cadTest;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Line implements Shape {

	private int x1,y1;
	private int x2,y2;
	static ArrayList<Line> lines = new ArrayList<Line>();
	
	public Line(int x1,int y1,int x2,int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	
		
	}
public void draw(Graphics g) {
		
		g.drawLine(x1, y1, x2, y2);	
		
	}
@Override
public boolean contains(Point2D p) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean contains(Rectangle2D r) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean contains(double x, double y) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean contains(double x, double y, double w, double h) {
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
public PathIterator getPathIterator(AffineTransform at) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public PathIterator getPathIterator(AffineTransform at, double flatness) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean intersects(Rectangle2D r) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean intersects(double x, double y, double w, double h) {
	// TODO Auto-generated method stub
	return false;
}
	
	
}
