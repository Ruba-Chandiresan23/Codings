package week3day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		Integer array1 [] = {3,2,11,4,6,7};
		Integer array2 [] = {1,2,8,4,9,7};
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(array1));
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(array2));
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
			if(list1.get(i)==list2.get(j)) {
				System.out.println(list1.get(i));
			}
			}
		}
	}

}
