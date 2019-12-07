package example;

public class Score {
	private Student student;
	private Lesson lesson;
	private Lab lab;
	private int mark; //оценка
	public Score(Student student, Lesson lesson, Lab lab, int mark) {
		super();
		this.student = student;
		this.lesson = lesson;
		this.lab = lab;
		this.mark = mark;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public Lab getLab() {
		return lab;
	}
	public void setLab(Lab lab) {
		this.lab = lab;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	

}
