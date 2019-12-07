package bank;

public abstract class Person {
	private String fullName;

	public Person(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Person() {
		
	}
}
