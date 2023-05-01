package string_classes;

import java.util.Arrays;
import java.util.List;
public class StringFormat {

	public static void main(String[] args) {
		String name="Java Developer";
		float salary=9000.37987f;
		System.out.format("%s has %.2f USD salary\n",name,salary);
		
		List<String> ls=Arrays.asList("Essentials Java","Java Fundamentals","Head Firt java");
		
		for(String str:ls) {
			System.out.format("%-30s - In Stock%n",str);
		}

	}

}
