package Entity;

public class Student extends MemberToTheSite {

	private String email;
	private int number;

	public Student() {
		super();
	}

	public Student(String email, int number) {
		super();
		this.email = email;
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
