package exceptionTest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class socket {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("localhost"),12345);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	

	}

}
