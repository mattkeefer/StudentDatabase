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
	
	public String print() {
		return "Name: " + getName() + '\n' + "Student ID: " + getId() + '\n' + "Grade Level: " + determineGrade();
	}
	
	public boolean equals(Undergrad u) {
		if(grade == u.getGrade()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private String determineGrade() {
		if(grade == 0) {
			return "Freshman";
		}
		if(grade == 1) {
			return "Sophomore";
		}
		if(grade == 2) {
			return "Junior";
		}
		if(grade == 3) {
			return "Senior";
		}
		return "Unknown";
	}
}