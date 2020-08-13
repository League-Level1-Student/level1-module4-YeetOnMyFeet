package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton []buttons = new JButton[8*3];
int molecount = 0;
int missed = 0;
Random ran = new Random();
int random = ran.nextInt(24);

public void run() {
	frame.add(panel);
	frame.setSize(500,500);
	frame.setVisible(true);
	frame.setTitle("Whack A Button For Fame And Glory");
	panel.setLayout(new GridLayout(8,3));
	for (int i = 0; i < buttons.length; i++) {
		buttons[i] = new JButton();
		panel.add(buttons[i]);
		buttons[i].addActionListener(this);
	}
	
	drawButtons();
	
}
public void drawButtons() {
	buttons[random].setText("mole!");
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() != buttons[random]) {
		speak("missed!");
		missed ++;
		frame.remove(panel);
		panel = new JPanel();
		 random = ran.nextInt(24);
		run();
		drawButtons();
		molecount = 1;
		
	}
	else {
		System.out.println(molecount ++);
		frame.remove(panel);
		panel = new JPanel();
		random = ran.nextInt(24);
		run();
		drawButtons();
	}
	
	if (molecount == 10) {
		endGame(new Date(), 10);
	}
	 
	 if (missed == 5) {
		System.out.println("You lost!");
		endGame(new Date(), 5);
	}
	
}


private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
}




