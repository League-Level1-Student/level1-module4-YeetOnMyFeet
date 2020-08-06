package _09_latest_tweet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class LatestTwitter implements MouseListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JTextField text1 = new JTextField(10);
public void run() {
	frame.add(panel);
	panel.add(label);
	frame.setSize(500,500);
	frame.setTitle("The Amazing Tweet Retriever");
	panel.add(button1);
	panel.add(text1);
	button1.setVisible(true);
	text1.setVisible(true);
	button1.setText("Search the Twitterverse");
	button1.addMouseListener(this);
	frame.setVisible(true);
	panel.setVisible(true);
	frame.addMouseListener(this);
	frame.pack();
}

private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
    twitter.setOAuthAccessToken(accessToken);

Query query = new Query(searchingFor);
    try {
        QueryResult result = twitter.search(query);
        return result.getTweets().get(0).getText();
    } catch (Exception e) {
        System.err.print(e.getMessage());
        return "What the heck is that?";
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button1) {
		
		System.out.println(getLatestTweet(text1.getText()));
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
