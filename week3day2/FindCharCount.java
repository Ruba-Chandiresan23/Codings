package week3day2;



public class FindCharCount {

	public static void main(String[] args) {
		String name = "TestLeaf";
		int count = 0;
		char[] charArray = name.toCharArray();
		
		for(int i = 0; i <charArray.length; i++) {
		
		if(charArray[i]=='e') {
			count++;
		}
		
		}
	
System.out.println(count);

	}
}

