package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Houses bob = new Houses();
		bob.run();
	}

	Robot rob = new Robot();
	Random ran = new Random();

	public void run() {
		rob.setWindowColor(Color.BLACK);
		rob.penDown();
		rob.setSpeed(50);
		rob.moveTo(80, 500);
		for (int i = 0; i < 10; i++) {

			int s = ran.nextInt(3);
			if (s == 0) {
				house("small", Color.GREEN);
			} else if (s == 1) {
				house("medium", Color.cyan);
			} else if (s == 2) {
				house("large", Color.MAGENTA);
			}

			rob.turn(-90);
			rob.move(30);
			rob.turn(-90);

		}
	}

	public void house(int height) {
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
	}

	public void house(String size, Color color) {
		rob.setPenColor(color);
		if (size.contentEquals("small")) {
			house(60);
		} else if (size.contentEquals("medium")) {
			house(120);
		} else if (size.equals("large")) {
			house(250);
		} else {
			house(100);
		}
	}

}