package example;

import java.util.Date;

public class Lesson {
	private Teacher teacher;
	private Group group;
	private Disciplyne disciplyne;
	private Date date;
	public Lesson(Teacher teacher, Group group, Disciplyne disciplyne, Date date) {
		super();
		this.teacher = teacher;
		this.group = group;
		this.disciplyne = disciplyne;
		this.date = date;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public Disciplyne getDisciplyne() {
		return disciplyne;
	}
	public void setDisciplyne(Disciplyne disciplyne) {
		this.disciplyne = disciplyne;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
