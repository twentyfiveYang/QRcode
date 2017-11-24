package dome;

public class CD extends Item{
	
	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}
	
	@Override
	public void print()
	{
		System.out.println("CD");
		super.print();
		System.out.println("Item artist is: "+artist);
		System.out.println("Item numofTracks is: "+numofTracks);
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CD cd = new CD("abc","yby",12,60,"...");
		System.out.println(cd);
	}

}
