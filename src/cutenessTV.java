import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel  = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	
	
	public void showButton() {
        
        frame.setVisible(true);
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        
        frame.add(panel);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        frame.pack();
        
        
        
        
        
   }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button clicked");
		JButton buttonclicked = (JButton) e.getSource();
		
		if (buttonclicked == button) {
		showDucks();
		}
		
		if (buttonclicked == button2) {
		System.out.println("frog");
		showFrog();
		}
		
		if (buttonclicked == button3) {
			System.out.println("unicorns");
		showFluffyUnicorns();
		}
		
		
	}
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	
	
}
