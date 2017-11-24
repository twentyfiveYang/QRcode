package test;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
	final int i;
	test1(){
		i = 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		        if (args.length>0){
//		        	 String[] test1 ={"我","是","L","D","C","1","类"};
//				        test2.main(test1);
//		            
//		        }else{
		        //下面调用LDC2中的main方法
//		        	System.out.println("test1类main方法收到参数："+Arrays.toString(args));
//		        }
		ArrayList<String> a = new ArrayList<>();
		a.add("aaa");
		a.add("bbb");
		a.add("ccc");
		a.add("ddd");
		int n = -1;
		
		for(int i = 0;i < a.size();i++) {
			if(a.get(i).equals("aaa")) {
				n = i;
				System.out.println(n);
			}
		}
		if(n!=-1)
		a.remove(n);
		
		for(String s : a) {
			System.out.println(s);
		}
	}

}
