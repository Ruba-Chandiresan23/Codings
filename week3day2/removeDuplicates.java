package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {


	public static void main(String[] args) {
		String  text = "We learn java basics as part of java sessions in java week 1";
	
		 String[] split = text.split(" ");
		Set<String> name =new LinkedHashSet<String>();
		for (String name1 : split) {
			name.add(name1);
		}
		
		
			
		
	System.out.println(name);	        
		
		
		

	}

}
