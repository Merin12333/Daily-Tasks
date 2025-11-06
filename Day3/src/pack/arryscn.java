package pack;

import java.util.Scanner;

public class arryscn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter marks");
			marks[i]=sc.nextInt();
		}
		int count=0;
		int sum=0;
		System.out.println("Entered Mark");
		for(int j=0;j<marks.length;j++) {
			if(marks[j]<40) {
				count++;
			}
			
			
			sum +=marks[j];
			System.out.println(marks[j]);
		}
		int avg=sum/marks.length;
		System.out.println("Sum"+sum);
		System.out.println("Average"+avg);
		System.out.println("Failed"+count);
	}

}
