package main;

import BreezySwing.*;
import java.awt.Color;
import javax.swing.*;

public class DatabaseGUI extends GBFrame {

	JButton addPerson = addButton("Add Person", 2,1,1,1);
	JButton output = addButton("Output", 2,3,1,1);
	
	
	public static void main(String[] args) {
		JFrame frm = new DatabaseGUI();
		frm.setTitle("Student Database");
		frm.setSize(350, 170);
		frm.setVisible(true);
		frm.getContentPane().setBackground(new Color(54, 134, 239));
	}
	
	public void buttonClicked(JButton button) {
		if(button == addPerson) {
			addDialog dlg = new addDialog(this);
		}
	}
}