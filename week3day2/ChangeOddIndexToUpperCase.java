package week3day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] t1 = test.toCharArray();
		for (int i = 0; i < t1.length; i++) {
			if(i%2!=0) {
				char word=Character.toUpperCase(t1[i]);
				System.out.print(word);
		}
			
			else
				System.out.print(t1[i]);
		}
			
		}
		
		
		
		

	

}
