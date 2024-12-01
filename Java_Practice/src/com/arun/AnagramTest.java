package com.arun;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String args[]) {
		String str="java";
		String str1="vaja";
	System.out.println(anagramTest(str,str1));	
	}

	private static boolean anagramTest(String str, String str1) {
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		return Arrays.equals(ch, ch1);
	}
}
