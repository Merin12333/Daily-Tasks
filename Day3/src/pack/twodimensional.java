package pack;

import java.util.Scanner;

public class twodimensional {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int arr[][]=new int[2][3];
	System.out.println("Enter number");
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
}
}
