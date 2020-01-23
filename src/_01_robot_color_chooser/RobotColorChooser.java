//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot hi = new Robot();
		hi.hide();
		hi.setSpeed(100);
		hi.penDown();
		for (int i = 0; i <= i; i++) {
			String whatColor = JOptionPane.showInputDialog("What color do you want the robot to draw? (Red, Green, Blue)");
		if (whatColor.equals("Red")) {
			hi.setPenColor(255,0,0);
		} else if (whatColor.equals("Green")) {
			hi.setPenColor(0,255,0);
		} else if (whatColor.equals("Blue")) {
			hi.setPenColor(0,0,255);
		} else {
			hi.setRandomPenColor();
		}
		hi.setPenWidth(10);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		}
		
		
		//1. Create a new Robot
		
		//3. Ask the user what color they would like the robot to draw
		
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
