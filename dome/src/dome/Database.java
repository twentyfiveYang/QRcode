package dome;

import java.util.ArrayList;

public class Database {
	ArrayList<Item> listItem = new ArrayList<Item>();

	public void add(Item item)
	{
		listItem.add(item);
	}
	public void list()
	{
		for(Item item : listItem)
		{
			item.print();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database test = new Database();
		DVD dvd = new DVD("abc","yby",60,"...");
		CD cd = new CD("abc","yby",12,60,"...");
		MP3 mp3 = new MP3("abc","jayChou",2011,3,"very good");
		test.add(dvd);
		test.add(cd);
		test.add(mp3);
		test.list();
	}

}
