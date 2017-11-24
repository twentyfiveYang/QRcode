import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * ���ߣ������
 * ʱ�䣺2013��12��23
 * ���ƣ�����С���� ʵ���˻�ֱ�ߣ����Σ��������Լ��϶�ͼ�ι���
 */


public class DrawingBoard extends Frame{
     int  startX,startY,endX,endY;//��㡢�յ�����
     int  MovStartX,MovStartY;//�ƶ�ͼ��ʱ�����ĵ�һ�ε����������м�¼
     String DrawStyle=" ";//LINE TRIAGNEL RECTANGLE 
     String isMove="";//�ж��Ƿ�����ƶ�
     Color  c= Color.BLACK;//����һ����ɫ���� 
     public void DrawingBoardFrame()
     {
    	Button  bLine=new Button("DrawLine");
    	Button  bTraAngle=new Button("DrawTriangle");
    	Button  bReAngle=new Button("DrawRectangle");
    	Button  bMov=new Button("Mov");
    	bLine.addActionListener(new MyActionListener(this));//ע�������
    	bTraAngle.addActionListener( new MyActionListener(this));
    	bReAngle.addActionListener(new MyActionListener(this));
    	bMov.addActionListener(new MyActionListener(this));
    	
    	Choice chc=new Choice();//��ѡ��
    	chc.add("��ɫ");
    	chc.add("��ɫ");
    	chc.add("��ɫ");
    	chc.add("��ɫ");
    	chc.addItemListener(new MyItemListener(this));
    	//this.setLayout();
    	/*
    	this.add(bLine);
    	this.add(bTraAngle);
    	this.add(bReAngle);
    	this.add(bMov);
    	*/
    	this.setTitle("��ͼ��--�����");
    	this.setLayout(new BorderLayout());
    	Panel pl=new Panel();
    	// pl.setSize(  ); 
    	pl.add(bLine);
    	pl.add(bTraAngle);
    	pl.add(bReAngle);
    	pl.add(bMov);
    	pl.add(chc);
    	this.add(pl,BorderLayout.NORTH);
    	this.setSize(750, 700);
    	this.addMouseListener(new MyMouseListener(this));//ע������¼�������
    	this.addWindowListener(new WindowAdapter(){ //ע��windows ���ؼ������������ƴ���Ĺرպ�������С
    		public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

    		
    	});
    	this.setVisible(true);
    	this.addMouseMotionListener(new MyMouseMotionListener(this));
     }
     public static void main(String[]args)
     {
    	 DrawingBoard db=new DrawingBoard();
    	db.DrawingBoardFrame();
    	 
     }
     /*
     public void update(Graphics g) {
         paint(g) ;
      }
      */
     public void paint(Graphics g)
     {
    	 g.setColor(c);
    	 //System.out.println("......ֱ��");
    	 g.drawString("Please Click the Button ",100,100);
    	 if(DrawStyle.equals("LINE"))
    	 {
    		 //��ֱ��
    		/// g.drawLine(x1, y1, x2, y2)
    		 g.drawLine(startX,startY,endX,endY);
    		 System.out.println("��ֱ��");
    	 }
    	 else if(DrawStyle.equals("TRIANGLE"))
    	 {
    		 //��������
    		//���ݾ��εõ������ε������� ����������������յ� ����һ�����Ǿ����Ϸ������ߵ��е㣬�ڶ������Ǿ��ε����½ǵ�
    		 //��������Ϊ����������
    		 System.out.println("��������");
    		 int width=endX-startX;
    		 int heitght=endY-startY;
    		 int firstPointX=startX+width*1/2,firstPointY=startY;
    	     int secPointX=startX,secPointY=endY;
    	     int thirdPointX=endX,thirdPointY=endY;
    	     int xPoints[ ]={0,0,0};
    	     int yPoints[ ]={0,0,0};
    	     xPoints[0]=firstPointX;xPoints[1]=secPointX;xPoints[2]=thirdPointX;
    	     yPoints[0]=firstPointY;yPoints[1]=secPointY;yPoints[2]=thirdPointY;
    		 g.drawPolygon(xPoints, yPoints, 3);//��������
    		 
    	 }
    	 else if(DrawStyle.equals("RECTANGLE"))
    	 { 
    		 //������
    		// int width ,height;
    		 g.drawRect(startX, startY, Math.abs(endX-startX), Math.abs(endY-startY));
    		// System.out.println("������");
    	 } 
    	 else{
    		 g.drawString("Please Click the Button ",100,100);
    	 }
     }
	
	
	
	
	
}
