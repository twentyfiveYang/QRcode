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
	        j1.setText("   1����ͼ��ʹ��������ͼ�ΰ�ť���϶����ɻ�ͼ�����һ���Ҽ�ֹͣ��ͼ");
	        j2.setText("   2���ƶ��ͱ��Σ�ʹ���Ҽ�ѡ��ͼ�Σ�ͼ�α�Ϊ��ɫ���Ҽ��϶��ɸı�λ��");
	        j3.setForeground(Color.red);
	        j3.setText("   ע�⣺��Ҫ�ٴ��Ҽ�ѡ�б�죬���̡�+������-���Ųſ��Ըı�ͼ�δ�С");
	        j4.setForeground(Color.black);
	        j4.setText("   3����ɫ���Ҽ�ѡ��ͼ�Σ�ͼ�α�����������ɫ���Ըı���ɫ");
	        j5.setForeground(Color.red);
	        j5.setText("   ע�⣺��ѡ��ģʽ�£�ͼ�εĺ�ɫ�Ḳ�Ǹı�����ɫ����ѡ�б��ͼ����ɫ������");
	        j6.setForeground(Color.black);
	        j6.setText("   4������ʹ򿪣����save��open��ť���Ա��浱ǰ�������ٴδ򿪿ɼ�������");
	        
	        
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
	        setTitle("ʹ�÷���");
	        setSize(550, 500);
	        setLocationRelativeTo(null);
	        setAlwaysOnTop(true);
	        setVisible(true);
	        
	    }
	    public static void main(String[] args) {
			Notice n = new Notice();
		}
	    }

