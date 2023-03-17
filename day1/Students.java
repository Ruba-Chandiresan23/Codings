package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		id=4546;
		System.out.println("print " + id);
	}
	public void getStudentInfo(int id, String name) {
		id=4546;
		name = "Ruba";
		System.out.println("print  " +  id  +  name );
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		 email= "rnvkruba@gmail.com";
		phoneNumber = 914312458525l;
		System.out.println("print  " +  email   +   phoneNumber);
	}
	public static void main(String[] args) {
		Students det = new Students();
	det.getStudentInfo(0);
	det.getStudentInfo(0, null);
	det.getStudentInfo(null, 0);
		}
	}

