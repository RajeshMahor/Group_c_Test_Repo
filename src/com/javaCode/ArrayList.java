package com.javaCode;

import java.util.Comparator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> streamList = List.of("Umesh","Rajesh","Pravin","Suhas","Chinmay");
		
		streamList.stream().sorted().forEach(a -> System.out.println("Accesnding Order : "+a));
		
		System.out.println("-------------------");
		
		streamList.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.println("Descending Order : "+a));
		
		System.out.println("-------------------");
		
		streamList.stream().filter(s -> s.startsWith("R")).forEach(a -> System.out.println("Filter : "+a));
		
		System.out.println("-------------------");
		
		System.out.println(streamList);
	}

}
