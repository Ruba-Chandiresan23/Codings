package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("30k monthly");
	}
	public static void main(String[] args) {
	AxisBank acc = new AxisBank();
	acc.deposit();
	acc.fixed();
	acc.savings();
	
	
}
}
