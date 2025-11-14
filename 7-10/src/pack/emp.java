package pack;

import java.util.Scanner;

public class emp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int a=sc.nextInt();
	if(a>=18) {
		System.out.println("Valid age");
	}
	else {
		try {
			throw new Exception("Invalid Age"+a);
		}
		catch(Exception iae) {
			System.out.println(iae);
		}
	}
}
}
