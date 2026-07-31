package com.javaCode;

import java.util.Comparator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> streamList = List.of("Umesh","Rajesh","Pravin","Suhas","Chinmay");
		
		streamList.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.println(a));

	}

}
