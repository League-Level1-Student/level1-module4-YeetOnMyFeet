package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JFrame frame = new JFrame();
	
	JButton button = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();
	
public void makeButtons() {
	frame.setVisible(true);
frame.add(panel);
panel.add(button2);
panel.add(button);
button.addActionListener((ActionListener) this);
button2.addActionListener((ActionListener) this);
button.setText("Joke");
button2.setText("Punchline");
frame.pack();



}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	if (event.getSource() == button2) {
		JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes? Because he never wants to be spotted!");
	}
	if (event.getSource() == button) {
		JOptionPane.showMessageDialog(null, "Why did the bicycle collapse? It was two tired!");
	}
}

}
