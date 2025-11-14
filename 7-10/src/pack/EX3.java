package pack;

public class EX3 {
	public static void div(int x,int y) {
		try
		{
			System.out.println(x+" / "+y+" is "+(x+y));
		}
		finally
		{
			System.out.println("Closing");
		}
	}
	public static void main(String[] args) {
		int x=22;
		int y=2;
		EX3.div(x, y);
		System.out.println("Bei.....");
	}

}
