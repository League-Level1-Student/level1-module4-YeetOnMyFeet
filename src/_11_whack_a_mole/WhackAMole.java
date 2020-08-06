package _11_whack_a_mole;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton []buttons = new JButton[8*3];

public void run() {
	frame.add(panel);
	frame.setSize(500,500);
	frame.setVisible(true);
	frame.setTitle("Whack A Button For Fame And Glory");
	panel.setLayout(new GridLayout(8,3));
	for (int i = 0; i < buttons.length; i++) {
		buttons[i] = new JButton();
		panel.add(buttons[i]);
	}
	
}
public void drawButtons() {
	
}

Random ran = new Random();

}
