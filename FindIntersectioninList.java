package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectioninList {
	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> l2=new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		for(Integer x:l1) {
			for(Integer y:l2) {
				int postition1=l1.indexOf(x);
				int postition2 = l2.indexOf(y);
				if (x==y)
				{ 
					System.out.println("The Value is matched in List1 L1 index "+postition1+" and List2 index "+postition2+" The Value is "+x+","+y); 
				}
				else {
					//System.out.println("The Value is not matched in List1 L1 index "+postition1+" and List2 index "+postition2+" The Value is "+x+","+y);
				}
			}
		}
		
		
	}

}
