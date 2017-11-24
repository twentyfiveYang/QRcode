import java.util.Scanner;

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	//��hour, minute��second��ʼ��ʱ�䡣
	public Clock(int hour, int minute, int second)
	{
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);		
	}
    
	 //����ડ�һ�£�ʱ����1�롣
	public void tick()
	{
		 {
			
			second.increase();
			if(second.getValue()==0)
			{
				minute.increase();
				if(minute.getValue()==0)
				{
					hour.increase();
				}
			}
				
			}
		}
	
	//����һ��String��ֵ���ԡ�hh:mm:ss������ʽ��ʾ��ǰʱ�䡣
	//����ÿ����ֵ��ռ����λ��������λʱ��0���硰00:01:22"��
	//ע�����е�ð�������ĵģ��������ĵġ�
	public String toString()
	{
		return String.format("%02d:%02d:%02d\n",hour.getValue(),minute.getValue(),second.getValue());
	}
	//��ʾ��String.format()�����ú�printfһ���ķ�ʽ����ʽ��һ���ַ�����


}

class Display {

	private int limit;
	private int value=0;
	
	
	Display(int limit)
	{
		this.limit = limit;
	}
	
	public void increase()
	{
		value++;
		if(value == limit)
		{
			value = 0;
		}
	}
	public void setValue(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}



public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}
