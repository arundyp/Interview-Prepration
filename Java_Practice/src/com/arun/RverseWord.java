package com.arun;

public class RverseWord {
	public static void main(String[] args) {
		String str="Welcome to java prog";
		String a[]=str.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
