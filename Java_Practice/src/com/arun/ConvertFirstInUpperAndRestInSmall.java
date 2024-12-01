package com.arun;

public class ConvertFirstInUpperAndRestInSmall {
	public static void main(String[] args) {
		String str="aPphYLe";
		performAction(str);
		
		
	}

	private static void performAction(String str) {
		String First=str.substring(0, 1).toUpperCase();
		String last=str.substring(1).toLowerCase();
		System.out.println(First+last);
		
	}

}
