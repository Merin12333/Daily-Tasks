package Interface;
//In this program,  created an abstract User class and implemented Admin and Guest classes with their own 
//authentication rules, then checked user login details using these methods.

import java.util.Scanner;

abstract class User{
	String username;
	String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	abstract boolean authenticate(String inputuser,String inputPass);
	
}
class Admin extends User{

	public Admin(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}
	
	boolean authenticate (String inputUser,String inputPass) {
		return this.username.equals(inputUser)&& this.password.equals(inputPass);	}
	
}
class Guest extends User{

	public Guest(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}
	boolean authenticate (String inputUser,String inputPass) {
		return this.username.equals(inputUser);	}
	
}

public class abstract1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String u=sc.nextLine();
		System.out.println("Enter Password");
		String p=sc.nextLine();
		User a=new Admin("AD001", "AD001");
		User g=new Guest("GU001","GU001");
		
		if(a.authenticate(u,p)) {
			System.out.println("Login Successful");
		}else if(g.authenticate(u, p)) {
			System.out.println("Login Successful");
			
		}else {
			System.out.println("Login Failed");
		}
	}

}
