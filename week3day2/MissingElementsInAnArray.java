package week3day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,7,6,8};
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(arr));
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)!=i+1) {
				System.out.println(i+1);
				break;
				
			}
			
		}
		

	}

}
