package week3day2;

public class Palindrome {

	public static void main(String[] args) {
String pal = "Madam";
String rev = "";
char[] pal1 = pal.toCharArray();
for(int i= pal1.length-1 ; i >= 0; i--) {
rev = rev + pal1[i];	
	}
System.out.println(rev);
	
	if(pal.equalsIgnoreCase(rev)) {
	System.out.println("The word is Palindrome");	
	}
	else {
		System.out.println("The word is not Palindrome");
	}
	}
}