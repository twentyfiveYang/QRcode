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
			//��ֱ�߰�ť������
			db.DrawStyle="LINE";
			//db.repaint(); 
			db.isMove=" ";
			System.out.println("��ֱ��");
			
		}
		else if(e.getActionCommand().equals("DrawTriangle"))
		{
			//�����ΰ�ť������
			db.isMove=" ";
			db.DrawStyle="TRIANGLE";
		}
		else if(e.getActionCommand().equals("DrawRectangle"))
		{
			//���� �ΰ�ť������
			db.isMove=" ";
			db.DrawStyle="RECTANGLE";
		}
		else if(e.getActionCommand().equals("Mov"))
		{
			//mov��ť������
		///.DrawStyle="MOV";
			db.isMove="MOV";
			System.out.println("....."+e.getSource().toString());
			
		}
	}

}
