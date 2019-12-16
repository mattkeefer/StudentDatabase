package main;

import java.awt.Color;

import javax.swing.*;
import BreezySwing.*;

public class addDialog extends GBDialog {

	public addDialog(JFrame frm) {
		super(frm);
		getContentPane().setBackground(new Color(54, 134, 239).darker());
		setSize(400, 200);
		setTitle("Add");
		setVisible(true);
		
	}
}