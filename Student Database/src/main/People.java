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
	
	public ArrayList<Person> getStudents() {
		ArrayList<Person> students = new ArrayList<Person>();
		for(Person p : people) {
			if(p instanceof Student) {
				students.add(p);
			}
		}
		return students;
	}
	
	public ArrayList<Person> getUndergrads() {
		ArrayList<Person> undergrads = new ArrayList<Person>();
		for(Person p : people) {
			if(p instanceof Undergrad) {
				undergrads.add(p);
			}
		}
		return undergrads;
	}
	
	public ArrayList<Person> getGrads() {
		ArrayList<Person> grads = new ArrayList<Person>();
		for(Person p : people) {
			if(p instanceof Grad) {
				grads.add(p);
			}
		}
		return grads;
	}
	
	public boolean duplicateId(int id) {
		ArrayList<Person> students = getStudents();
		for(Person p : students) {
			Student s = (Student)p;
			if(s.getId()==id) {
				return true;
			}
		}
		return false;
	}
}