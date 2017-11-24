package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> cityNames = new ArrayList<String>();
		int cityNumber;
		int index1,index2,distance;
		String city1="";
		String city2="";
		String a = new String();
		a = in.next();
		while(a.equals("###")==false)
		{
			cityNames.add(a);
			a = in.next();
		}
		cityNumber = cityNames.size();
		int[][] distances = new int[cityNumber][cityNumber];
		for(int i = 0;i<cityNumber;i++)
		{
			for(int j = 0;j<cityNumber;j++)
			{
				distances[i][j] = in.nextInt();
			}
		}
		
		HashMap<String,Integer> table = new HashMap<String,Integer>();
		for(int k = 0;k<cityNumber;k++)
		{
			table.put(cityNames.get(k), k);
		}
		
		city1 = in.next();
		city2 = in.next();
		
		index1 = table.get(city1);
		index2 = table.get(city2);
		
		distance = distances[index1][index2];
		System.out.println(distance);
		
		
	}
	
}


	

