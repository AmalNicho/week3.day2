package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestinList {
	public static void main(String[] args) {
		
	List<Integer> l1=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
	
	Collections.sort(l1);
	
	Collections.reverse(l1);
	
	System.out.println(l1.get(1));
	
	
	
	
	}


}