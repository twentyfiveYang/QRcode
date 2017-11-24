package dome;

public class Item {
	
	private String title;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
	
	public Item()
	{
		
	}
	
    
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getComment()
	{
		return comment;
	}



	public void print() {
		
		System.out.println("Item title is: "+title);
		System.out.println("Item playingTime is: "+playingTime);
		System.out.println("gotIt? "+gotIt);
		System.out.println("Item comment is: "+comment);
	}
}
