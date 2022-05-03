package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class MissingElementInList {
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 7, 6, 8));

		Collections.sort(l1);

		for (int i = 0; i < l1.size(); i++) {

			if (i == l1.get(i)) {

			} else {
				System.out.println("The Missing Value is " + i);
				break;
			}

		}

	}

}
