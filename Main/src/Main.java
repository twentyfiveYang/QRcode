import java.util.Scanner;

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	//用hour, minute和second初始化时间。
	public Clock(int hour, int minute, int second)
	{
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);		
	}
    
	 //“嘀嗒”一下，时间走1秒。
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
	
	//返回一个String的值，以“hh:mm:ss“的形式表示当前时间。
	//这里每个数值都占据两位，不足两位时补0。如“00:01:22"。
	//注意其中的冒号是西文的，不是中文的。
	public String toString()
	{
		return String.format("%02d:%02d:%02d\n",hour.getValue(),minute.getValue(),second.getValue());
	}
	//提示：String.format()可以用和printf一样的方式来格式化一个字符串。


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
