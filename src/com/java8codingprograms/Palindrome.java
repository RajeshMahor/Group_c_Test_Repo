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

	}

}
