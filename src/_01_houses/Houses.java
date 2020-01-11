package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Houses bob = new Houses();
	    bob.run(100);
	}
	public void run(int height) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(50);
		rob.moveTo(80, 500);
	for (int i = 0; i < 10; i++) {
		
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
		
	}
	}
	

}