package main;

public class Student extends Person {
	
	private int id;

	public Student(String nm, int i) {
		super(nm);
		id = i;
	}
	
	public int getId() {
		return id;
	}
}