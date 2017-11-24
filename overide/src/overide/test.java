package overide;



public class test {
//	private int num(int i,int j){  
//        return i+j; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test p = new Child();
		Child pp = (Child)p;
		System.out.println(p.num(1, 2));  
        System.out.println(pp.num(1, 2));  
	}

public int num(int i, int j) {
	// TODO Auto-generated method stub
	return i+j;
}

}

class Child extends test{  
    
	//@Override
    public int num(int x,int y){  
        return x-y;  
    }  
}  