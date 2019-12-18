package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import BreezySwing.*;

public class addDialog extends GBDialog {

	JComboBox type = addComboBox(1,1,1,1);
	
	public addDialog(JFrame frm) {
		super(frm);
		getContentPane().setBackground(new Color(54, 134, 239).darker());
		type.addItem("Person");
		type.addItem("Student");
		type.addItem("Undergraduate");
		type.addItem("Graduate");
		type.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//perform action
			}
		});
		setSize(400, 200);
		setTitle("Add");
		setVisible(true);
	}
	
	private void setSetters() {
		
	}
}