package com.java8codingprograms;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "nayan";
		String s2 = new StringBuilder(s1).reverse().toString();
		if (s1.equals(s2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		System.out.println("--------second way-----------");

		String s3 = "madam";
		String s4 = new StringBuffer(s3).reverse().toString();
		if (s3.equals(s4)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		
		
		//Another approach
		String s5="";
		for(int i = s1.length()-1; i>=0; i--) {
			s5 = s5+s1.charAt(i);
		}
		if(s1.equals(s5)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}	
	}

}
