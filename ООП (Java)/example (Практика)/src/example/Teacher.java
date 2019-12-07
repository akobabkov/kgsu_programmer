package example;

public class Teacher extends Person {
	AccademicDegree accademicDegree;

	public Teacher(String fullName, AccademicDegree accademicDegree) {
		super(fullName);
		this.accademicDegree = accademicDegree;
	}

	public AccademicDegree getAccademicDegree() {
		return accademicDegree;
	}

	public void setAccademicDegree(AccademicDegree accademicDegree) {
		this.accademicDegree = accademicDegree;
	}
	
	
}
