package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;
import BreezySwing.*;

public class outputDialog extends GBDialog {
	
	JList<String> ppl = addList(1,1,1,2);
	JTextArea personInfo = addTextArea("", 3,1,1,3);
	JButton close = addButton("Close", 6,1,1,1);
	People p;

	public outputDialog(JFrame frm, People pl) throws FormatException {
		super(frm);
		getContentPane().setBackground(new Color(54, 134, 239).darker());
		if(pl.getSize()==0) {
			throw new FormatException("There are no people in the database.");
		}
		p = pl;
		initializeList();
		personInfo.setEditable(false);
		setSize(400, 300);
		setTitle("Add");
		setVisible(true);
	}
	
	private void initializeList() {
		ArrayList<Person> people = p.getPeople();
		for(Person per : people) {
			addToList(per.getName());
		}
	}
	
	private void addToList(String str) {
		DefaultListModel<String> model = (DefaultListModel<String>)ppl.getModel();
		model.addElement(str);
	}
	
	private void resetList() {
		DefaultListModel<String> model = (DefaultListModel<String>)ppl.getModel();
		model.removeAllElements();
		initializeList();
	}
	
	public void buttonClicked(JButton button) {
		dispose();
	}
}