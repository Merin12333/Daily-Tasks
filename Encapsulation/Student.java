package Encapsulation;

import java.util.Scanner;

class studentdetails {
 private String name;
 private  int mark;
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public int getMark() {
	return mark;
 }
 public void setMark(int mark) {
	 if(mark>=0 && mark<=50) {
	this.mark = mark;
 }else {
	 System.out.println("Invalid Marks");}
 }
 }
 
 public class Student{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		studentdetails s=new studentdetails();
       System.out.println("Enter student name");
       String name=sc.nextLine();
       s.setName(name);
       System.out.println("Enter student mark");
       int mark=sc.nextInt();
       s.setMark(mark);
        
       System.out.println("Name : "+s.getName());
       System.err.println("Mark : "+s.getMark());
       

		
	}
	 
 }
 

