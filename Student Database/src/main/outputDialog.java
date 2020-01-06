package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class outputDialog extends GBDialog {
	
	JList<String> ppl = addList(1,1,2,3);
	JTextArea personInfo = addTextArea("", 1,3,2,3);
	JButton perBtn = addButton("People", 4,1,1,1);
	JButton stuBtn = addButton("Students", 4,2,1,1);
	JButton undBtn = addButton("Undergrads", 4,3,1,1);
	JButton graBtn = addButton("Grads", 4,4,1,1);
	JButton close = addButton("Close", 5,2,2,1);
	People p;
	int d;

	public outputDialog(JFrame frm, People pl) throws FormatException {
		super(frm);
		getContentPane().setBackground(new Color(54, 134, 239).darker());
		if(pl.getSize()==0) {
			throw new FormatException("There are no people in the database.");
		}
		p = pl;
		fillList(p.getPeople());
		personInfo.setText("");
		personInfo.setEditable(false);
		setSize(600, 500);
		setTitle("Add");
		setVisible(true);
	}
	
	private void addToList(String str) {
		DefaultListModel<String> model = (DefaultListModel<String>)ppl.getModel();
		model.addElement(str);
	}
	
	private void resetList() {
		DefaultListModel<String> model = (DefaultListModel<String>)ppl.getModel();
		model.removeAllElements();
	}
	
	public void buttonClicked(JButton button) {
		resetInfo();
		if(button==close) {
			dispose();
		}
		if(button==perBtn) {
			resetList();
			fillList(p.getPeople());
			d = 0;
		}
		if(button==stuBtn) {
			resetList();
			fillList(p.getStudents());
			d = 1;
		}
		if(button==undBtn) {
			resetList();
			fillList(p.getUndergrads());
			d = 2;
		}
		if(button==graBtn) {
			resetList();
			fillList(p.getGrads());
			d = 3;
		}
	}
	
	public void listItemSelected(JList<String> li) {
		resetInfo();
		addInfo(findSelectedPerson(li.getSelectedIndex()).print());
		Person person = findSelectedPerson(li.getSelectedIndex());
		if(person instanceof Undergrad) {
			Undergrad ugrad = (Undergrad)person;
			String out = "";
			out += "\n\nUndergraduates in same grade: \n\n";
			for(Person per : p.getUndergrads()) {
				if(per instanceof Undergrad && !per.equals(person)) {
					Undergrad u = (Undergrad)per;
					if(u.equals(ugrad)) {
						out += per.print() + "\n\n";
					}
				}
			}
			if(!out.equals("\n\nUndergraduates in same grade: \n\n")) {
				addInfo(out);
			}
		}
		if(person instanceof Grad) {
			Grad grad = (Grad)person;
			String out = "";
			out += "\n\nGraduate students with same major: \n\n";
			for(Person per : p.getGrads()) {
				if(per instanceof Grad && !per.equals(person)) {
					Grad g = (Grad)per;
					if(g.equals(grad)) {
						out += per.print() + "\n\n";
					}
				}
			}
			if(!out.equals("\n\nGraduate students with same major: \n\n")) {
				addInfo(out);
			}
		}
	}
	
	private void resetInfo() {
		personInfo.setText("");
	}
	
	private void addInfo(String str) {
		String out = personInfo.getText();
		resetInfo();
		out += str;
		personInfo.setText(out);
	}
	
	private void fillList(ArrayList<Person> list) {
		for(Person p : list) {
			addToList(p.getName());
		}
	}
	
	private Person findSelectedPerson(int s) {
		if(d==0) {
			return p.getPeople().get(s);
		}
		if(d==1) {
			return p.getStudents().get(s);
		}
		if(d==2) {
			return p.getUndergrads().get(s);
		}
		if(d==3) {
			return p.getGrads().get(s);
		}
		return p.getPeople().get(0);
	}
}