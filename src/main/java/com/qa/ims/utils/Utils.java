package com.qa.ims.utils;

import java.util.Scanner;


public class Utils {
	
	private Utils () {
		
	}

	/**
	 * Asks user for input and returns as a string
	 */
	public static String getInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	/**
	 * Asks user for input and returns as a float
	 */
	public static float getInputFloat() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}
	
}
