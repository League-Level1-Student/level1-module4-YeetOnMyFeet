package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JButton button = new JButton();
	Random ran1 = new Random();
	int r1;
	Random ran2 = new Random();
	int r2;
	Random ran3 = new Random();
	int r3;
	int tries = 3;

	public void run() {
		frame.add(panel);
		panel.add(button);
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		label4.setText("Tries Remaining: " + tries);
		frame.setVisible(true);
		button.addActionListener(this);
		button.setVisible(true);
		button.setText("Spin");
		frame.pack();
		
		
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	panel.remove(label);
	r1 = ran1.nextInt(3);
	System.out.println(r1);
	panel.remove(label2);
	r2 = ran2.nextInt(3);
	System.out.println(r2);
	panel.remove(label3);
	r3 = ran3.nextInt(3);
	System.out.println(r3);
	
	if (r1 == 0) {
		try {
			label = createLabelImage("neworange.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label);
	}
	else if (r1 == 1) {
		try {
			label = createLabelImage("cherry.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label);
	}
	else if (r1 ==2) {
		try {
			label = createLabelImage("lime.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label);
	}
	if (r2 == 0) {
		try {
			label2 = createLabelImage("neworange.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label2);
	}
	else if (r2 == 1) {
		try {
			label2 = createLabelImage("cherry.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label2);
	}
	else if (r2 ==2) {
		try {
			label2 = createLabelImage("lime.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label2);
	}
	if (r3 == 0) {
		try {
			label3 = createLabelImage("neworange.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label3);
	}
	else if (r3 == 1) {
		try {
			label3 = createLabelImage("cherry.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label3);
	}
	else if (r3 ==2) {
		try {
			label3 = createLabelImage("lime.jpg");
		} catch (MalformedURLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		panel.add(label3);
	}
	frame.add(panel);
	frame.pack();
	if (r1 == r2 && r2 == r3) {
		JOptionPane.showMessageDialog(null, "You win!");
		tries = 3;
	}
	
	else if (tries == 0 ) {
		JOptionPane.showMessageDialog(null, "You lose!");
		tries = 3;
	}
	
	else if (e.getSource() == button) {
		tries = tries - 1;
	}
	label4.setText("Tries Remaining: " + tries);
	}
}







    


