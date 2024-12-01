package com.arun;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		
		String a[]= {"jack","jill","jack","john"};
		Set<String> s= new HashSet<>();
		Set<String>forDup = new HashSet<>();
		for(String n:a) {
			
			if(!s.contains(n)) {
				s.add(n);
			}
			else
			{
				forDup.add(n);
			}
		}
		System.out.println("duplicate:"+forDup);
	}

}
