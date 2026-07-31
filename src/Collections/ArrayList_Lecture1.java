package Collections;

import java.util.ArrayList;

public class ArrayList_Lecture1 {
	
	
	
		
		public static void main(String[] args) {
			
			ArrayList al= new ArrayList<>();
			
			//ArrayList al= new ArrayList<>();
			
			al.add(10);
			al.add("Rahul");
			al.add(20);
			al.add(10);
			al.add(null);
			al.add(null);
			al.add("Rahul");
			al.add(20);
			al.add(10);
			al.add(10);
			al.add("Rahul");
			al.add(20);
			al.add(10);
			al.add(null);
			al.add(null);
			al.add("Rahul");
			al.add(20);
			al.add(10);
			//System.out.println(al);
			al.remove(2);
			//System.out.println(al);
			al.add(5,"ram");
			//System.out.println(al);
			
			
			ArrayList<String> al1= new ArrayList<>();
			al1.add("Rahul");
			al1.add("Rohit");
			al1.add("Sachin");
			al1.add("Sandip");
			
			ArrayList<Integer> al2= new ArrayList<>();
			al2.add(10);
			al2.add(20);
			al2.add(30);
			al2.add(40);
			System.out.println(al2);
			
			ArrayList<Integer> al3= new ArrayList<>();
			al3.add(100);
			al3.add(200);
		   System.out.println(al3);
			al3.addAll(al2);
			System.out.println(al3);
			

		}
}
