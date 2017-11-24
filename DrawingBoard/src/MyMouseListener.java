import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyMouseListener implements MouseListener{
    DrawingBoard db;
    MyMouseListener(DrawingBoard Drb)
    {
    	db=Drb;
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Press");
		if(db.isMove.equals("MOV"))
		{  //当前处于移动图形的状态
			db.MovStartX=e.getX();
			db.MovStartY=e.getY();
		}else
		{
			//画图状态
			db.startX=e.getX();
			db.startY=e.getY();
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Release");
		if(db.isMove.equals("MOV"))
		{
			
		}else
		{
			db.endX=e.getX();
			db.endY=e.getY();
		}
		
		db.repaint();
		//db.update( );
		///db.isMove=" ";
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
