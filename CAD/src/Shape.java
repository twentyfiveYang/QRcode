import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	public abstract void draw(Graphics g);
	//public abstract void render(Graphics g);
	public abstract void changeColor(Color color);
	public abstract void isMove();
	public abstract void isMoveFalse(); 
	public abstract boolean getMove();
	public abstract boolean isSelected();
	public abstract Color getOriginalColor();
	public abstract int getTag();
}
