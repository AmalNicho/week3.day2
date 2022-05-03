package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinList {
	public static void main(String[] args) {
		

		String x="We learn java basics as part of java sessions in java week1";
		
		List<String> dup=new ArrayList<String>(Arrays.asList(x.split(" ")));
				
		
		
		Set<String> removedup=new LinkedHashSet<String>(dup);
		
		System.out.print(removedup);
		
		System.out.println("\n");
		
		System.out.println(String.join(" ", removedup));;
		
		
	}
	
	
	
	

}
