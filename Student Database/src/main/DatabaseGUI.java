package main;

import BreezySwing.*;
import java.awt.Color;
import javax.swing.*;

public class DatabaseGUI extends GBFrame {

	JButton addPerson = addButton("Add Person", 2,1,1,1);
	JButton output = addButton("Output", 2,3,1,1);
	People pl = new People();
	
	public static void main(String[] args) {
		JFrame frm = new DatabaseGUI();
		frm.setTitle("Student Database");
		frm.setSize(400, 300);
		frm.setVisible(true);
		frm.getContentPane().setBackground(new Color(54, 134, 239));
	}
	
	public void buttonClicked(JButton button) {
		try {
			if(button == addPerson) {
				addDialog dlg = new addDialog(this, pl);
			}
		}
		catch(FormatException e) {
			messageBox(e.getMessage());
		}
		if(button == output) {
			System.out.println(pl.toString());
		}
	}
}