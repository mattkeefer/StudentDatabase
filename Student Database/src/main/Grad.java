package main;

public class Grad extends Student {

	private String major;
	
	public Grad(String nm, int i, String m) {
		super(nm, i);
		major = m;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String print() {
		return "Name: " + getName() + '\n' + "Student ID: " + getId() + '\n' + "Major: " + major;
	}
	
	public boolean equals(Grad g) {
		if(major.equalsIgnoreCase(g.getMajor())) {
			return true;
		}
		else {
			return false;
		}
	}
}