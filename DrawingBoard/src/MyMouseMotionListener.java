import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMouseMotionListener  implements MouseMotionListener{
	DrawingBoard db;
	MyMouseMotionListener(DrawingBoard Drb)
	{
	   db=Drb;
    }
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(db.isMove.equals("MOV"))
		{
			//��ǰ�����ƶ�ͼ�ε�״̬
			db.startX=db.startX+(e.getX()-db.MovStartX);//�ƶ����µ�����
			db.startY=db.startY+(e.getY()-db.MovStartY);
			db.endX=db.endX+(e.getX()-db.MovStartX);
			db.endY=db.endY+(e.getY()-db.MovStartY);
			db.MovStartX=e.getX();
			db.MovStartY=e.getY();
			
		}else
		{ // ��ǰ�����ƻ�ͼ�ε�״̬
	     	db.endX=e.getX();
		    db.endY=e.getY();
		
		}
		db.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("MouseMov");
	}
	
	
	
	
	
}