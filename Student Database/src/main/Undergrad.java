package main;

public class Undergrad extends Student{
	
	private int grade;

	public Undergrad(String nm, int i, int g) {
		super(nm, i);
		grade = g;
	}
	
	public int getGrade() {
		return grade;
	}
}