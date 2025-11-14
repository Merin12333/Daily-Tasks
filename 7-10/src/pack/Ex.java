package pack;

public class Ex {
	public static void main(String[] args) {
		int x=22;
		int y=4;
		try {
		System.out.println("Welcome to  division program");
		System.out.println(x+" / "+y+ " is " +(x/y));
		
		}
		
		catch(Exception e) {
			System.out.println("enter non zero value"+e);
		}
		System.out.println("Bye....");
	}

}
