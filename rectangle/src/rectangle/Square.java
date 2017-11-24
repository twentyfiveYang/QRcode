package rectangle;

public class Square extends Rectangle {
	private int a;
	
	Square(int a)
	{
		super(a,a);
		this.a = a;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(2);
		System.out.println(s.mianji());
		Rectangle r = new Rectangle(2,3);
		System.out.println(r.mianji());
	}

}
