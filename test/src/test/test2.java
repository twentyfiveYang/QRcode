package test;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length>0) {
	            System.out.println("test2类main方法收到参数："+Arrays.toString(args));
	        }else{
	        //下面调用LDC2中的main方法    
	        String[] test2 ={"我","是","L","D","C","2","类"};
	        test1.main(test2);
	        }
	}

}
