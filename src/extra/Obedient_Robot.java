package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot bot = new Robot();
public static void main(String[] args) {
	
	String shape;
	String color;
	shape = JOptionPane.showInputDialog("What shape should Bot draw? A circle, triangle, or square?");
	color = JOptionPane.showInputDialog("What color should Bot draw in? Red, blue, or purple?");
	if (color.equalsIgnoreCase("Red")) {
		bot.setPenColor(250, 0, 0);
	}
	else if (color.equalsIgnoreCase("Blue")) {
		bot.setPenColor(0, 0, 250);
	}
	else if (color.equalsIgnoreCase("Purple")) {
		bot.setPenColor(200, 0, 250);
	}
	else {
		bot.setRandomPenColor();
	}
	if (shape.equalsIgnoreCase("Circle")) {
		drawCircle();
	}
	else if (shape.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
	else if (shape.equalsIgnoreCase("Square")) {
		drawSquare();
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not an available shape!");
	}
	
}	
	
public static void drawSquare() {
	
	bot.setSpeed(100);
	bot.penDown();
	for (int i = 0; i < 5; i++) {
	bot.move(100);
	bot.turn(90);
	}
}

public static void drawTriangle() {
	
	bot.setSpeed(100);
	bot.penDown();
	for (int i = 0; i < 3; i++) {
	bot.move(100);
	bot.turn(120);
	}
}

public static void drawCircle() {
	
	bot.setSpeed(100);
	bot.penDown();
	for (int i = 0; i < 361; i++) {
	bot.move(1);
	bot.turn(1);
	}
}
}