package com.arun;

public class PrintUniqueCharFromString {
	public static void main(String[] args) {
		String str="kushwaha";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.print(ch);
			}
		}
	}

}
