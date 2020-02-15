import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener {
	
	JFrame frame = new JFrame();
    JButton button = new JButton();
	
	public void showButton() {
        System.out.println("Button clicked");
        
        frame.setVisible(true);
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
       
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 int rand = new Random().nextInt(5);
		 if (rand == 0) {
			 JOptionPane.showMessageDialog(null, "You will find something that you lost today.");
		 }
		 
		 if (rand == 1) {
			 JOptionPane.showMessageDialog(null, "You will get $1 today.");
		 }
		 
		 if (rand == 2) {
			 JOptionPane.showMessageDialog(null, "You will make a new friend today");
		 }
		 
		 if (rand == 3) {
			 JOptionPane.showMessageDialog(null, "You will be very happy today.");
		 }
		 
		 if (rand == 4) {
			 JOptionPane.showMessageDialog(null, "You will be happy today.");
		 }
			JOptionPane.showMessageDialog(null, "Woohoo!");

	}
}
