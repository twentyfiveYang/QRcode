package exceptionTest;

class OpenException extends Exception{
	
}
class CloseException extends OpenException{
	
}
class NewException extends Exception{
	
}




public class ArrayIndex {
	
	public static int open()
	{
//		int[] a = new int[10];
//		a[10] = 10;
		return -1;
	}

	public static void readFile() throws OpenException,CloseException
	{
		if(open()==-1)
		{
			throw new CloseException();
		}
	}
	public ArrayIndex() throws OpenException{}
	public void f() throws OpenException{}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile();
		}catch (CloseException e) {
			
			e.printStackTrace();
			System.out.println("close");
		}  
		catch (OpenException e) {
			
			e.printStackTrace();
			System.out.println("open");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Anything");
		} 
		
		
		
		
	}

}

class NewClass extends ArrayIndex{
	public NewClass() throws OpenException,NewException{}
	@Override
	public void f() throws OpenException{}
	public static void main(String[] args)
	{
		try {
		ArrayIndex p = new NewClass();
			p.f();
		} catch (OpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
