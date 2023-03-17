package week3day2;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("Second Largest Number is " +  data[4]);		

	}

}
