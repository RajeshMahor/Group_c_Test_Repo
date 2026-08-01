package Collections;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,2,5,43,45,56,242,676);
		
		list.stream().filter(i -> i%2==0).forEach(x -> System.out.println(x));
	}
}
