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
 * 作者：李亚楠
 * 时间：2013。12。23
 * 名称：画板小程序 实现了画直线，矩形，三角形以及拖动图形功能
 */


public class DrawingBoard extends Frame{
     int  startX,startY,endX,endY;//起点、终点坐标
     int  MovStartX,MovStartY;//移动图形时对鼠标的第一次点击的坐标进行记录
     String DrawStyle=" ";//LINE TRIAGNEL RECTANGLE 
     String isMove="";//判断是否可以移动
     Color  c= Color.BLACK;//声明一个颜色对象 
     public void DrawingBoardFrame()
     {
    	Button  bLine=new Button("DrawLine");
    	Button  bTraAngle=new Button("DrawTriangle");
    	Button  bReAngle=new Button("DrawRectangle");
    	Button  bMov=new Button("Mov");
    	bLine.addActionListener(new MyActionListener(this));//注册监听器
    	bTraAngle.addActionListener( new MyActionListener(this));
    	bReAngle.addActionListener(new MyActionListener(this));
    	bMov.addActionListener(new MyActionListener(this));
    	
    	Choice chc=new Choice();//复选框
    	chc.add("黑色");
    	chc.add("红色");
    	chc.add("蓝色");
    	chc.add("绿色");
    	chc.addItemListener(new MyItemListener(this));
    	//this.setLayout();
    	/*
    	this.add(bLine);
    	this.add(bTraAngle);
    	this.add(bReAngle);
    	this.add(bMov);
    	*/
    	this.setTitle("画图板--李亚楠");
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
    	this.addMouseListener(new MyMouseListener(this));//注册鼠标事件监听器
    	this.addWindowListener(new WindowAdapter(){ //注册windows 开关监听器用来控制窗体的关闭合扩大，缩小
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
    	 //System.out.println("......直线");
    	 g.drawString("Please Click the Button ",100,100);
    	 if(DrawStyle.equals("LINE"))
    	 {
    		 //画直线
    		/// g.drawLine(x1, y1, x2, y2)
    		 g.drawLine(startX,startY,endX,endY);
    		 System.out.println("画直线");
    	 }
    	 else if(DrawStyle.equals("TRIANGLE"))
    	 {
    		 //画三角形
    		//根据矩形得到三角形的三个点 ，第三个点是鼠标终点 ，第一个点是矩形上方的条边的中点，第二个点是矩形的左下角点
    		 //此三角形为等腰三角形
    		 System.out.println("画三角形");
    		 int width=endX-startX;
    		 int heitght=endY-startY;
    		 int firstPointX=startX+width*1/2,firstPointY=startY;
    	     int secPointX=startX,secPointY=endY;
    	     int thirdPointX=endX,thirdPointY=endY;
    	     int xPoints[ ]={0,0,0};
    	     int yPoints[ ]={0,0,0};
    	     xPoints[0]=firstPointX;xPoints[1]=secPointX;xPoints[2]=thirdPointX;
    	     yPoints[0]=firstPointY;yPoints[1]=secPointY;yPoints[2]=thirdPointY;
    		 g.drawPolygon(xPoints, yPoints, 3);//画三角形
    		 
    	 }
    	 else if(DrawStyle.equals("RECTANGLE"))
    	 { 
    		 //画矩形
    		// int width ,height;
    		 g.drawRect(startX, startY, Math.abs(endX-startX), Math.abs(endY-startY));
    		// System.out.println("画矩形");
    	 } 
    	 else{
    		 g.drawString("Please Click the Button ",100,100);
    	 }
     }
	
	
	
	
	
}
