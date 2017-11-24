package castle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;



public class View extends JPanel {

private Room theRoom;
	
	public View(Room theRoom) {
		this.theRoom = theRoom;
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(900, 600);
	}

	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
		arg0.fillRect(0, 300, 300, 300);
		arg0.drawRect(0, 0, 300, 300);
		arg0.drawRect(300, 0, 300, 300);
		arg0.drawRect(600, 0, 300, 300);
		arg0.drawRect(0, 300, 300, 300);
		arg0.drawRect(300, 300, 300, 300);
		arg0.drawRect(600, 300, 300, 300);
		arg0.drawString("�Ǳ���", 350, 50);
		arg0.drawString("С�ư�", 50, 50);
		arg0.drawString("����", 650, 50);
		arg0.drawString("�鷿", 350, 350);
		arg0.drawString("����", 650, 350);
		arg0.setColor(new Color(0, 0, 0));
		arg0.fillRect(0, 300, 300, 300);
		if(theRoom.toString().equals("�Ǳ���")) {
			arg0.setColor(new Color(255, 0, 0));
			arg0.drawOval(400, 100, 100, 100);
			arg0.fillOval(400, 100,  100, 100);
		}
		if(theRoom.toString().equals("С�ư�")) {
			arg0.setColor(new Color(255, 0, 0));
			arg0.drawOval(100, 100, 100, 100);
			arg0.fillOval(100, 100,  100, 100);
		}
		if(theRoom.toString().equals("����")) {
			arg0.setColor(new Color(255, 0, 0));
			arg0.drawOval(700, 100, 100, 100);
			arg0.fillOval(700, 100,  100, 100);
		}
		if(theRoom.toString().equals("�鷿")) {
			arg0.setColor(new Color(255, 0, 0));
			arg0.drawOval(400, 400, 100, 100);
			arg0.fillOval(400, 400,  100, 100);
		}
		if(theRoom.toString().equals("����")) {
			arg0.setColor(new Color(255, 0, 0));
			arg0.drawOval(700, 400, 100, 100);
			arg0.fillOval(700, 400,  100, 100);
		}
	}

	
}
