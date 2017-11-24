package exceptionTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class streamTest {
	public static void main(String[] args)
	{
		System.out.println("hello world");
		byte[] buffer = new byte[10];
		for(int i = 0;i<buffer.length;i++)
		{
			buffer[i] = (byte)i;
		}
		try {
//			DataOutputStream out = new DataOutputStream(
//										new BufferedOutputStream(
//													new FileOutputStream("b.dat")));
			
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
										new FileOutputStream("a.txt"))));
			byte i =99;
			byte a = 97;
			byte b =110;
			out.println(i);
			out.println(a);
			out.println(b);
			//out.writeInt(i);
//			out.writeByte(i);
//			out.writeByte(a);
//			out.writeByte(b);
			//System.out.println(out.size()+" bytes have been written");
			out.close();
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("a.txt")));
			
//			LineNumberReader in = new LineNumberReader(
//										new InputStreamReader(
//												new FileInputStream("a.txt")));

			//FileReader in = new FileReader("a.txt");
			
			
			Scanner inns = new Scanner(in);
			int aa;
			
			while((aa=inns.nextInt())!=110)
			{
				System.out.println(aa);
			}
			BufferedReader inm = new BufferedReader(
							new FileReader("a.txt"));
			String line;
			int aaa;
			while((line = inm.readLine())!=null )
			{
				System.out.println(line);
			}
			
			Scanner ccc = new Scanner(
							new BufferedReader(
										new FileReader("a.txt")));
			int eee;
			while((eee = ccc.nextInt())!=110)
			{
				System.out.println(eee);
			}
//			while((aaa =inm.read())!=-1 )
//			{
//				System.out.println(aaa);
//			}
			
			
			
			//			String line;
//			while((line=in.readLine())!=null)
//			{
//				System.out.print(line);
//			}
			//String line;
//			while((line = in.readLine())!=null)
//			{
//				System.out.println("The line number is : "+in.getLineNumber()+" : "+line);
//			}
			
			int number;
			in.read();
			
			while((number = in.read())!=-1)
				{
					System.out.println(number);
				}
//			FileInputStream in = new FileInputStream("a.txt");
			
//			System.out.println(in.read()+in.read()+in.read());
			
//			DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("b.dat")));
//			int j = in.readInt();
//			System.out.println(j);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
