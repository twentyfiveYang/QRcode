package rectangle;

public class Rectangle {
	private int m;
	private int n;
	Rectangle(int a,int b)
	{
		super();
		m = a;
		n = b;
	}
	public int mianji()
	{
		return m*n;
	}

	
	//@Override
	 boolean equals(Object arg0,int i) {
		// TODO Auto-generated method stub
		Rectangle aa = (Rectangle)arg0;
		return (m==(aa.m));
	}
	@Override
	public String toString() {
		return "Rectangle [m=" + m + ", n=" + n + ", mianji()=" + mianji() + ", toString()=" + super.toString() + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		Rectangle r = new Rectangle(5,7);
		System.out.println(r.toString());
		Rectangle r1 = new Rectangle(5,7);
		System.out.println(r.equals(r1));
	}

}
