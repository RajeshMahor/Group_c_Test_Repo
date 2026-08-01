package Collections;

import java.util.ArrayList;

public class ArraylistLearn{
	
 public static void main(String[] args) {
	 
	 
	ArrayList al = new ArrayList();
	al.add(123);
	al.add(null);
	al.add(10);
	al.add(20);
	al.add(null);
	
	System.out.println(al);
	System.out.println(al.size());

	al.remove(3);
	System.out.println(al);
    System.out.println(al.size());

   al.add(0,"abx");
   System.out.println(al);
   System.out.println(al.size());
   System.out.println(al.get(3));
  
   
   System.out.println(al.indexOf(20)); //-1
   
   System.out.println(al.indexOf(120)); //-1

   System.out.println(al.indexOf(10));
   
   
   System.out.println(al.contains("abx"));
   
   System.out.println(al.isEmpty());
   
//   System.out.println(al.clone());
    ArrayList a2 = (ArrayList) al.clone();
    System.out.println(a2);
    System.out.println(a2.get(0));
    System.out.println(a2.add("xyz"));
    System.out.println(al);
    System.out.println(a2);
    
    System.out.println(al.add("abc"));
    System.out.println(al);
    
    
    

//	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }

}
