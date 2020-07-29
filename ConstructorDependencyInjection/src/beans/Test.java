package beans;

/**
 * @author ritpa
 *
 */

public class Test {
	
	private String gender;
	private int age;
	private String email;

	public Test(String gender, int age, String email) {
		super();
		this.gender = gender;
		this.age = age;
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printHello(String name) {
		System.out.println("Hello "+gender +" " +name+ " is of "+ age +" email is "+ email);
	}
	
}
