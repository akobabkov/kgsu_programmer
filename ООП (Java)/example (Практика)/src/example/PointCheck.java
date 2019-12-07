package example;

public class PointCheck {
	private Lesson lesson;
	private Student student;
	public PointCheck(Lesson lesson, Student student) {
		super();
		this.lesson = lesson;
		this.student = student;
	}
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
