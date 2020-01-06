package main;

import java.util.Random;

public class Student extends Person {
	
	private int id;

	public Student(String nm, int i) {
		super(nm);
		id = i;
		if(i == 0) {
			Random rand = new Random();
			id = rand.nextInt(10000);
		}
	}
	
	public int getId() {
		return id;
	}
	
	public String print() {
		return "Name: " + getName() + '\n' + "Student ID: " + id;
	}
}