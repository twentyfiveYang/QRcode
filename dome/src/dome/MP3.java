package dome;

public class MP3 extends Item {
	
	private String singer;
	private int releasedYear;
	
	public MP3(String title,String singer,int releasedYear, int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.singer = singer;
		this.releasedYear = releasedYear;
	}

	public void play()
	{
		System.out.println("play the song");
	}
	
	

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("MP3:");
		super.print();
		System.out.println("Item singer is: "+singer);
		System.out.println("Item releasedYear is: "+releasedYear);
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		MP3 cc = (MP3)obj;
		return singer.equals(cc);
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MP3 [singer=" + singer + ", releasedYear=" + releasedYear + ", comment=" + this.getComment() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3 mp3 = new MP3("abc","jayChou",2011,3,"very good");
		mp3.print();
		System.out.println(mp3.toString());
	}

}
