package main;

import java.util.*;

public class People {

	private ArrayList<Person> people;
	
	public People() {
		people = new ArrayList<Person>();
	}
	
	public void add(String nm) {
		people.add(new Person(nm));
	}
	
	public void add(String nm, int i) {
		people.add(new Student(nm, i));
	}
	
	public void add(String nm, int i, int g) {
		people.add(new Undergrad(nm, i, g));
	}
	
	public void add(String nm, int i, String m) {
		people.add(new Grad(nm, i, m));
	}
	
	public int getSize() {
		return people.size();
	}
	
	public ArrayList<Person> getPeople() {
		return people;
	}
}