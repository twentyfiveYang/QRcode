import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class MyItemListener implements ItemListener {
//��ѡ�������
	DrawingBoard db;
	MyItemListener(DrawingBoard Drb)
	{
		db=Drb;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println(""+e.getItem().toString());
		String str=e.getItem().toString();
		 if(str.equals("��ɫ"))
		 {
			 db.c=Color.BLACK;
		 }else if(str.equals("��ɫ"))
		 {
			 db.c=Color.RED;
		 }
		 else if(str.equals("��ɫ"))
		 {
			 db.c=Color.BLUE;
		 }
		 else if(str.equals("��ɫ"))
		 {
			 db.c=Color.GREEN;
		 }
	}

}
