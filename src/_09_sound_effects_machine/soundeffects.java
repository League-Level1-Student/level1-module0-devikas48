package _09_sound_effects_machine;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundeffects implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JPanel panel = new JPanel();
	
	
	
	
	public void showButton() {
       
        frame.setVisible(true);
        
     
        
        button.addActionListener(this);
        
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
		 playSound("flute.wav");
		 playSound("drum.wav");
	     playSound("sawing wood.wav");

	}
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	
	
	
	
	
	
	
	
}
