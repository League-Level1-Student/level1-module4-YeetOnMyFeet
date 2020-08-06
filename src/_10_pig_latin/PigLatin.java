package _10_pig_latin;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements MouseListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	
	public void run() {
		frame.add(panel);
		panel.add(label);
		frame.setSize(500,500);
		frame.setTitle("Pig Latin Translator");
		panel.add(text1);
		panel.add(button1);
		panel.add(text2);
		button1.setVisible(true);
		text1.setVisible(true);
		text2.setVisible(true);
		button1.setText("Translate");
		button1.addMouseListener(this);
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
		if (text1.getText() != null) {
			PigLatinTranslator.translate(text1.getText());
			System.out.println(PigLatinTranslator.translate(text1.getText()));
			text2.setText(PigLatinTranslator.translate(text1.getText()));
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
