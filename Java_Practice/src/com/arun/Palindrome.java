package com.arun;

public class Palindrome {
	public static void main(String[] args) {
		String original="level";
		String reverse="";
	
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		
		if (original.equals(reverse)) 
			System.out.println("palindorme");
			
		else
			System.out.println("not palindrome");
	
	}
}
