//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot ro = new Robot();
		String color;
		ro.penDown();
		ro.setPenWidth(10);
		ro.setSpeed(500);
		for (int i = 0; i < 102; i++) {
			
		//3. Ask the user what color they would like the robot to draw
		color=JOptionPane.showInputDialog("What color would you like the robot to draw in?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
			ro.setPenColor(250, 0, 0);
		}
		else if (color.equalsIgnoreCase("orange")) {
			ro.setPenColor(250, 150, 100);
		}
		else if (color.equalsIgnoreCase("yellow")) {
			ro.setPenColor(250, 250, 0);
		}
		else if (color.equalsIgnoreCase("green")) {
			ro.setPenColor(25, 250, 25);
		}
		else if (color.equalsIgnoreCase("blue")) {
			ro.setPenColor(0, 0, 250);
		}
		else if (color.equalsIgnoreCase("purple")) {
			ro.setPenColor(150, 0, 250);
		}
		else {
			ro.setRandomPenColor();
		}
		ro.move(150);
		ro.turn(60);
	}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
