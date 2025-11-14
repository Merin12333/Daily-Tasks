package Inheritance;
//This program uses inheritance to calculate different late fees for Books, Novels, and TextBooks by 
//overriding the getLateFee() method.


import java.util.Scanner;

class Book{
	String title;
	String author;
	 public int getLateFee(int days) {
		 int fee = days*1;
		 return fee;	 
	 }
	 public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	 }
}
class Novel extends Book{
	public Novel(String title, String author) {
		super(title, author);
	}

	public int getLateFee(int days) {
		int fee=days*2;
		return fee;
	}
}
class TextBook extends Book{

	public TextBook(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}
	public int getLateFee(int days) {
		int fee=days*3;
		return fee;
	}
	
}
public class Inheritance3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many days late ");
	int days=sc.nextInt();
	
  Book n=new Novel("afshhs", "Aiswarya K J");
  Book t=new TextBook("shjd", "Sree");
  System.out.println("Novel Late Fee "+n.getLateFee(days));
  System.out.println("TextBook Late Fee "+t.getLateFee(days));
  
}
}
