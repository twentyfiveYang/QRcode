package exceptionTest;

public class test {
	

	
	
	public static void f()
	{
		int[] a = new int[10];
		a[10] = 10;
	}
	public static void g()
	{
		f();
	}
	public static void h()
	{
		int i = 10;
		if(i<100)
		{
			g();
		}
	}
	public static void k()
	{
		try {
			h();
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("k()");
			throw e;
		}
	}
	

	public static void main(String[] args) {
		try {
			k();
		}catch(NullPointerException e)
		{System.out.println("NullPointerException");}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("111ArrayIndexOutOfBoundsException");}
		finally {
			System.out.println("finally");
			}
	}
	
}


