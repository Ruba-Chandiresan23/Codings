package week3.day1;

public class Automation extends MultipleLanguage implements TestTool,Language {
	public static void main(String[] args) {
		Automation att = new Automation();
		att.java();
		att.python();
		att.ruby();
		att.Selenium();
	}

	public void java() {
		System.out.println("javaa");
		
	}

	public void Selenium() {
		System.out.println("sell");
		
	}

	@Override
	public void ruby() {
	System.out.println("rubyy");	
		
	}
	
	
	
	
	

}
