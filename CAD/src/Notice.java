import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Notice extends JFrame {
	
	    JLabel j0,j1,j2,j3,j4,j5,j6;
	    public Notice() {
	    	j0 = new JLabel();
	        j1 = new JLabel();
	        j2 = new JLabel();
	        j3 = new JLabel();
	        j4 = new JLabel();
	        j5 = new JLabel();
	        j6 = new JLabel();
	        j0.setHorizontalAlignment(SwingConstants.LEFT);
	        j1.setHorizontalAlignment(SwingConstants.LEFT);
	        j2.setHorizontalAlignment(SwingConstants.LEFT);
	        j3.setHorizontalAlignment(SwingConstants.LEFT);
	        j4.setHorizontalAlignment(SwingConstants.LEFT);
	        j5.setHorizontalAlignment(SwingConstants.LEFT);
	        j6.setHorizontalAlignment(SwingConstants.LEFT);
	        j1.setText("   1、画图：使用左键点击图形按钮，拖动即可画图，点击一次右键停止画图");
	        j2.setText("   2、移动和变形：使用右键选中图形，图形变为红色，右键拖动可改变位置");
	        j3.setForeground(Color.red);
	        j3.setText("   注意：需要再次右键选中变红，键盘“+”、“-”号才可以改变图形大小");
	        j4.setForeground(Color.black);
	        j4.setText("   3、颜色：右键选中图形，图形变红后，左键点击颜色可以改变颜色");
	        j5.setForeground(Color.red);
	        j5.setText("   注意：在选中模式下，图形的红色会覆盖改变后的颜色，需选中别的图形颜色可显现");
	        j6.setForeground(Color.black);
	        j6.setText("   4、保存和打开：点击save和open按钮可以保存当前画作，再次打开可继续操作");
	        
	        
	        this.setLayout(new GridLayout(9, 0));
	        add(j0);
	        add(j1);
	        add(j2);
	        add(j3);
	        add(j4);
	        add(j5);
	        add(j6);
	        JPanel jp = new JPanel();
	        add(jp,BorderLayout.SOUTH);
	        setTitle("使用方法");
	        setSize(550, 500);
	        setLocationRelativeTo(null);
	        setAlwaysOnTop(true);
	        setVisible(true);
	        
	    }
	    public static void main(String[] args) {
			Notice n = new Notice();
		}
	    }

