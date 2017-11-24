import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class MyItemListener implements ItemListener {
//多选框监听器
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
		 if(str.equals("黑色"))
		 {
			 db.c=Color.BLACK;
		 }else if(str.equals("红色"))
		 {
			 db.c=Color.RED;
		 }
		 else if(str.equals("蓝色"))
		 {
			 db.c=Color.BLUE;
		 }
		 else if(str.equals("绿色"))
		 {
			 db.c=Color.GREEN;
		 }
	}

}
