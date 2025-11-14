package pack;

import java.io.DataInputStream;
import java.io.IOException;

public class User1 {
	public static void main(String[] args) {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter your name :");
		String name="";
		try {
			name=dis.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Hai "+name);
		}
	}


