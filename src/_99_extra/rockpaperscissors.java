package _99_extra;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class rockpaperscissors {
public static void main(String[] args) {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JLabel complabel = new JLabel();
JButton button = new JButton();
Random ran = new Random();
int rand;

frame.add(panel);
panel.add(button);
panel.add(label);
rand = ran.nextInt(3);
if (rand == 0) {
	complabel.setText("The computer chose Scissors!");
}
else if (rand == 1) {
	complabel.setText("The computer chose Paper!");
}
else if (rand == 2) {
	complabel.setText("The computer chose Rock!");
}
}
}
