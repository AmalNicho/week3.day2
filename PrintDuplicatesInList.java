package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInList {
	public static void main(String[] args) {
int c;
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20));
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < l1.size() - 1; i++) {
c=0;
			for (int j = 1; j < l1.size(); j++) {

				if (i != j) {
					if (l1.get(i).equals(l1.get(j))) {
						c++;	
						
					} 
				}

			}
			
			if (c>0)
			{
				
				
				set.add(l1.get(i));
				
				
			}

		}
		System.out.println(set);	
	}

}
