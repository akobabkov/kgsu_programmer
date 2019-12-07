package example;

public class Student extends Person {
	private Group group;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Student(String fullName, Group group) {
		super(fullName);
		this.group = group;
	}
	
	public Student() {
		super();
	}
	
	

}
