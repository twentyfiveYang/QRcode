package notebook;

import java.util.ArrayList;

public class Notebook {
	private ArrayList<String> notes = new ArrayList<String>();
	public void add(String s)
	{
		notes.add(s);
	}
	
	public int getSize()
	{
		return notes.size();
	}

	public String getNote(int index)
	{
		return notes.get(index);
	}
	public void removeNote(int index)
	{
		notes.remove(index);
	}
	
	public String[] list()
	{
		String[] a = new String[notes.size()];
		for(int i = 0;i<notes.size();i++)
		{
			a[i] = notes.get(i);
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> notes = new ArrayList<String>();
		String a = new String("first");
		notes.add(a);
		a = a.substring(1);
		System.out.println(a);
		for(int i = 0;i<notes.size();i++) {
		System.out.println(notes.get(i));
		}
	}

}
