import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyActionListener implements ActionListener {

	 DrawingBoard db;
	 MyActionListener(DrawingBoard Drb)
	 {
		 db=Drb;
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("DrawLine") )
		{
			//画直线按钮被触发
			db.DrawStyle="LINE";
			//db.repaint(); 
			db.isMove=" ";
			System.out.println("画直线");
			
		}
		else if(e.getActionCommand().equals("DrawTriangle"))
		{
			//三角形按钮被触发
			db.isMove=" ";
			db.DrawStyle="TRIANGLE";
		}
		else if(e.getActionCommand().equals("DrawRectangle"))
		{
			//矩形 形按钮被触发
			db.isMove=" ";
			db.DrawStyle="RECTANGLE";
		}
		else if(e.getActionCommand().equals("Mov"))
		{
			//mov按钮被触发
		///.DrawStyle="MOV";
			db.isMove="MOV";
			System.out.println("....."+e.getSource().toString());
			
		}
	}

}
