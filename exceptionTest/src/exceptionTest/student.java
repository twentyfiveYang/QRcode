package exceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Astudent implements Serializable{
	private String name;
	private int age;
	
	
	Astudent(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return (name + " " + age);
	}
}
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Astudent s = new Astudent("John",15);
			ObjectOutputStream out = new ObjectOutputStream(
											new FileOutputStream("obj.dat"));
		out.writeObject(s);
		out.close();
		ObjectInputStream in = new ObjectInputStream(
									new FileInputStream("obj.dat"));
		Astudent s2 = (Astudent)in.readObject();
		System.out.println(s2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
