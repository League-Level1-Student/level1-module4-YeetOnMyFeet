package _08_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements MouseListener{
JFrame frame = new JFrame();
JLabel label = new JLabel();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JTextField text1 = new JTextField(10);
JTextField text2 = new JTextField(10);


public void run() {
	frame.add(panel);
	panel.add(label);
	frame.setSize(500,500);
	label.setText("Simple Calculator");
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(text1);
	panel.add(text2);
	button1.setVisible(true);
	button2.setVisible(true);
	button3.setVisible(true);
	button4.setVisible(true);
	text1.setVisible(true);
	text2.setVisible(true);
	button1.setText("add");
	button2.setText("sub");
	button3.setText("mult");
	button4.setText("division");
	button1.addMouseListener(this);
	button2.addMouseListener(this);
	button3.addMouseListener(this);
	button4.addMouseListener(this);
	frame.setVisible(true);
	panel.setVisible(true);
	frame.addMouseListener(this);
	frame.pack();
}


@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	String textfield1 = text1.getText();
	int num = Integer.parseInt(textfield1);
	
	String textfield2 = text2.getText();
	int num2 = Integer.parseInt(textfield2);
	if ((e.getSource() == button1 && !text1.getText().equals("") && !text2.getText().equals(""))) {
		
		//System.out.println(num + ""+ num2);
		System.out.println(num + num2);
		label.setText(num + num2 + "");
		text1.setText("");
		text2.setText("");
		
	}
if ((e.getSource() == button2 && !text1.getText().equals("") && !text2.getText().equals(""))) {
		
		//System.out.println(num + ""+ num2);
		System.out.println(num - num2);
		label.setText(num - num2 + "");
		text1.setText("");
		text2.setText("");
}
if ((e.getSource() == button3 && !text1.getText().equals("") && !text2.getText().equals(""))) {
	
	//System.out.println(num + ""+ num2);
	System.out.println(num * num2);
	label.setText(num * num2 + "");
	text1.setText("");
	text2.setText("");
}
if ((e.getSource() == button4 && !text1.getText().equals("") && !text2.getText().equals(""))) {
	
	//System.out.println(num + ""+ num2);
	System.out.println(num / num2);
	label.setText(num / num2 + "");
	text1.setText("");
	text2.setText("");
}
}



@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
