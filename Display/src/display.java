
public class display {

	private int limit;
	private int value=0;
	
	
	display(int limit)
	{
		this.limit = limit;
	}
	
	public void increase(display hour)
	{
		value++;
		if(value == limit)
		{
			value = 0;
			hour.increaseHour();
		}
	}
	public void increaseHour()
	{
		value++;
		if(value == limit)
		{
			value = 0;
			
		}
	}

//	public boolean increase()
//	{
//		boolean revert = false;
//		value++;
//		if(value == limit)
//		{
//			value = 0;
//			revert = true;
//		}
//		return revert;
//	}
	public int getValue()
	{
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		display a = new display(24);
//		while(true)
//		{
//			a.increase();
//			System.out.println(a.getValue());
//		}
//		
	}

}
