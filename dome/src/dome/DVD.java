package dome;

public class DVD extends Item{

	private String director;
	
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.director = director;
	}

	@Override
	public void print()
	{
		
		System.out.println("DVD:");
		super.print();
		System.out.println("Item director is:"+ director);
	}
	

	public static void main(String[] args) {
		
		DVD dvd = new DVD("abc","yby",60,"...");
		dvd.print();
		dvd.setTitle("changed title");
		dvd.print();
		
	}

}
