
public class clock {
	private display hour = new display(24);
	private display minute = new display(60);
	private display temp = new display(0);

	
	public void start()
	{
		while(true) {
					
				minute.increase(hour);
			
//		if(minute.getValue()==0)
//		{
//			temp = minute;
//			minute = hour;
//			minute.increase();
//			minute = temp;
//			
//		}
//			hour.increase();
//			if(minute.increase())
//				hour.increase();
//			
			System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clock c = new clock();
		c.start();
				
	}

}
