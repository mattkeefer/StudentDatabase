package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import BreezySwing.*;

public class addDialog extends GBDialog {

	JComboBox type = addComboBox(1,1,2,1);
	JLabel a = addLabel("<html><font color='#265ca3'>hello there</font></html>", 1,2,1,1);
	JLabel b = addLabel("<html><font color='#265ca3'>this is a spacer</font></html>", 1,3,1,1);
	JLabel c = addLabel("<html><font color='#265ca3'>hi</font></html>", 1,4,1,1);
	JLabel nameLbl = addLabel("<html><font color='white'>Name:</font></html>", 2,1,1,1);
	JTextField name = addTextField("", 2,2,2,1);
	JLabel idLbl = addLabel("<html><font color='white'>ID Number:</font></html>", 3,1,1,1);
	JTextField id = addTextField("", 3,2,2,1);
	JLabel majorLbl = addLabel("<html><font color='white'>Major:</font></html>", 4,1,1,1);
	JTextField major = addTextField("", 4,2,2,1);
	JLabel gradeLbl = addLabel("<html><font color='white'>Grade Level:</font></html>", 5,1,1,1);
	JComboBox grade = addComboBox(5,2,2,1);
	JButton add = addButton("Add", 6,1,2,1);
	JButton close = addButton("Close", 6,3,2,1);
	
	public addDialog(JFrame frm) {
		super(frm);
		getContentPane().setBackground(new Color(54, 134, 239).darker());
		type.addItem("Person");
		type.addItem("Student");
		type.addItem("Undergraduate");
		type.addItem("Graduate");
		grade.addItem("Freshmen");
		grade.addItem("Sophomore");
		grade.addItem("Junior");
		grade.addItem("Senior");
		type.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(type.getSelectedItem().equals("Person")) {
					setSetters(0);
				}
				else if(type.getSelectedItem().equals("Student")) {
					setSetters(1);
				}
				else if(type.getSelectedItem().equals("Undergraduate")) {
					setSetters(2);
				}
				else if(type.getSelectedItem().equals("Graduate")) {
					setSetters(3);
				}
			}
		});
		type.setSelectedItem("Person");
		setSize(400, 300);
		setTitle("Add");
		setVisible(true);
	}
	
	private void setSetters(int i) {
		name.setText("");
		id.setText("");
		major.setText("");
		idLbl.setVisible(false);
		id.setVisible(false);
		majorLbl.setVisible(false);
		major.setVisible(false);
		gradeLbl.setVisible(false);
		grade.setVisible(false);
		grade.setSelectedItem("Freshmen");
		if(i>0) {
			idLbl.setVisible(true);
			id.setVisible(true);
			if(i>1) {
				majorLbl.setVisible(true);
				major.setVisible(true);
				if(i==2) {
					gradeLbl.setVisible(true);
					grade.setVisible(true);
				}
			}
		}
	}
	
	public void buttonClicked(JButton button) {
		if(button==add) {
			//add thingy thing
		}
		dispose();
	}
}