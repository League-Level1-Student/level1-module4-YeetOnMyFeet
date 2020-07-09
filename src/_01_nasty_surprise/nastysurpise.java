package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurpise implements MouseListener{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
public void run() {
	
	
	
	frame.add(panel);
	
	panel.add(button);
	panel.add(label);
	panel.add(button2);
	button.addMouseListener(this);
	frame.setVisible(true);
	frame.setTitle("Trick or Treat");
	button.setText("Trick");
	button2.setText("Treat");
	button2.addMouseListener(this);
	frame.pack();
	
	
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
    


}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if (button == (e.getSource())) {
		showPictureFromTheInternet("https://previews.123rf.com/images/saphatthachat/saphatthachat1807/saphatthachat180700204/114688163-vector-pixel-art-puppy-face-isolated-cartoon.jpg");
		System.out.println("Button has been clicked for 'Trick'");
	}
	else {
		showPictureFromTheInternet("https://wallpaperplay.com/walls/full/9/0/3/121268.jpg");
		System.out.println("Button2 has been clicked for 'Treat'");
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
	
}}
