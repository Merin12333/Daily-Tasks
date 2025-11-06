package com.example;

import javax.swing.JOptionPane;

public class Dialog2 {
	public static void main(String[] args) {
	int s1= Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
	int s2= Integer.parseInt(JOptionPane.showInputDialog("Enter a another number"));
	JOptionPane.showMessageDialog(null,"The addition is "+(s1+s2));
	
	}

}
