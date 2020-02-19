package com.qa.anagrams;

import java.util.Arrays;

public class Runner {
	
	public static void main(String[] args) {
		
		Anagram("Lemon","Melon");	
		
		Anagram("12345","54321");
		
		Anagram("Mike","Hike");
		
		Anagram("Danny Waughman", "Waughman Danny");
		
	}
	
	public static boolean Anagram(String a, String b) {
		
		char [] aArray = a.toLowerCase().toCharArray();
		char [] bArray = b.toLowerCase().toCharArray();
		
		Arrays.sort(aArray);
		Arrays.sort(bArray);
		
		if (Arrays.equals(aArray,bArray) == true) {
			System.out.println(a + " is an anagram of " + b + "!");
			return true;
		} else {
			System.out.println(a + " is not an anagram of " + b + ".");
			return false;
		}
		
		
	}

}
