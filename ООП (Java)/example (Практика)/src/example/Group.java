package example;

import java.util.ArrayList;

public class Group {
	private ArrayList<Student> students = new ArrayList<Student>();
	private String name;
	
	public Group(ArrayList<Student> students, String name) {
		super();
		this.students = students;
		this.name = name;
	}

	public Group(String name) {
		super();
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void delStudent(int index) {
		students.remove(index);
	}

	public int searchStudent(Student student) {
		return students.indexOf(student);
	}
	
	
	
}
