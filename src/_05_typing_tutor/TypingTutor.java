package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
		
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
char currentLetter = generateRandomLetter();


public void makeFrame() {
frame.setTitle("Type or Die");
frame.add(panel);
frame.add(label);
label.setText(currentLetter+"");
frame.setVisible(true);
frame.addKeyListener(this);
frame.pack();

label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);
}







char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');



}









@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}









@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("You typed: " + e.getKeyChar());
	
}









@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
	
	
	
	if (e.getKeyChar() == currentLetter) {
		System.out.println("Correct!");
		label.setBackground(Color.green);
		label.setOpaque(true);
	}
	else {
		label.setBackground(Color.red);
		label.setOpaque(true);
	}
	currentLetter = generateRandomLetter();
	label.setText(currentLetter+"");
}
	}
