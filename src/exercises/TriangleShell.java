package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Instantiate a new Robot
	Robot r = new Robot();

	void go() {
		// drawTriangle(100); //3. Remove this command, it's just for testing
		int length = 50;
		r.setSpeed(20);
		for (int i = 0; i < 60; i++) {
			drawTriangle(length);
			length += 10;
			r.setRandomPenColor();
			r.turn(6);
		}

		// 6. Make the robot go as fast as possible
		// 4. make a variable to hold the length of the triangle and set it to 50
		// 7. Do all the steps below, 60 times
		// 9. Change the color of the pen to a random color
		// 8. Increase the length of the side by 10 pixels
		// 5. call your drawTriangle() method using your length variable
		// 10. Turn the robot 6 degrees to the right

	}

	/*
	 * 2. Fill in the method below to draw a triangle. Use the length variable for
	 * the size of the triangle.
	 */
	private void drawTriangle(int distance) {
		r.penDown();
		r.setPenWidth(2);
		for (int i = 0; i < 3; i++) {
			r.move(distance);
			r.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
