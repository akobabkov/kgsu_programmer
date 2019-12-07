package example;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		AccademicDegree a = new AccademicDegree("КФМН");
		System.out.println("Создана степень " + a.getDegreeName());
		AccademicDegree b = new AccademicDegree("Доктор Экономических Наук");
		
		Teacher c = new Teacher("Иванов Иван Иванович", a);
		Teacher d = new Teacher("Петров Петр Петрович", b);
		d.setFullName("Иванов Петр Петрович");
		Group e = new Group("ПТЗ-30018с");
		Student f = new Student("К К К", e);
		Student j = new Student("Д Д Д", e);
		e.addStudent(f);
		e.addStudent(j);
		Disciplyne h = new Disciplyne("Экономика");
		Disciplyne h1 = new Disciplyne("Математика");
		Date date = new Date(2018, 5, 1, 23, 9);
		Lesson l = new Lesson(c, e, h, date);
		Lab k = new Lab("Лабораторная 1", h);
		Lab k1 = new Lab("Лабораторная 2", h);
		PointCheck p = new PointCheck(l, f);
		PointCheck p1 = new PointCheck(l, j);
		Score s = new Score(f, l, k, 4);
		Score s1 = new Score(j, l, k1, 3);
		System.out.println("dfdf");
	}

}
