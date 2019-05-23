package exercises;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	Robot b = new Robot("mini");

	private void drawCircle(int radius) {

		for (int i = 0; i < 360; i++) {
			b.move((int) ((2 * radius * Math.PI) / 360));
			b.turn(1);
		}
	}

	private void drawSquare(int square) {

		for (int i = 0; i < 4; i++) {
			b.move(square);
			b.turn(90);
		}
	}

	private void drawTriangle(int triangle) {

		for (int i = 0; i < 3; i++) {
			b.move(triangle);
			b.turn(120);
		}
	}

	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
		/*
		 * Create methods to draw a circle, square and triangle and call the appropriate
		 * one depending on the user choice.
		 */
		ObedientRobot a = new ObedientRobot();
		a.b.penDown();
		a.b.setPenWidth(3);
		a.b.setSpeed(15);
		a.b.setPos(350,300);

		if (shape == 0) {
			String radiusAsString = JOptionPane.showInputDialog("Please enter the radius of a circle(min 60).");
			int radius = Integer.parseInt(radiusAsString);
			a.drawCircle(radius);
		} else if (shape == 1) {
			String squareAsString = JOptionPane.showInputDialog("Please enter the side of a square.");
			int square = Integer.parseInt(squareAsString);
			a.drawSquare(square);
		} else {
			String triangle = JOptionPane.showInputDialog("Please enter thw side of triangle.");
			int trinagle = Integer.parseInt(triangle);
			a.drawTriangle(trinagle);
		}

	}

}
