package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	
		
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
char currentLetter = generateRandomLetter();


public void makeFrame() {
frame.setTitle("Type or Die");
frame.add(panel);
frame.add(label);
label.setText(currentLetter);
frame.pack();


}









char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
	}
