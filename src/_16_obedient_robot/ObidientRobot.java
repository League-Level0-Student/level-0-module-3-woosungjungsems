package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObidientRobot {

	public static void main(String[] args) {
		Robot hi = new Robot();
		hi.setSpeed(100);
		hi.penDown();
		for (int i = 0; i <= i; i++) {
			String whatShape = JOptionPane.showInputDialog("What shape do you want the robot to draw? (Circle, Triangle, Square)");
		if (whatShape.equals("Circle")) {
			String whatColor = JOptionPane.showInputDialog("What color do you want the robot to draw? (Red, Green, Blue)");
			if (whatColor.equals("Red")) {
				hi.setPenColor(255,0,0);
				hi.setPenWidth(10);
				for (int j = 0; j < 72; j++) {
					hi.move(5);
					hi.turn(5);
			}
			}
			else if (whatColor.equals("Green")) {
				hi.setPenColor(0,255,0);
				hi.setPenWidth(10);
				for (int j = 0; j < 72; j++) {
					hi.move(5);
					hi.turn(5);
			}
			}
			else if (whatColor.equals("Blue")) {
				hi.setPenColor(0,0,255);
				hi.setPenWidth(10);
				for (int j = 0; j < 72; j++) {
					hi.move(5);
					hi.turn(5);
			} 
		}
			
			}
			
		
		else if (whatShape.equals("Triangle")) {
			String whatColor = JOptionPane.showInputDialog("What color do you want the robot to draw? (Red, Green, Blue)");
			if (whatColor.equals("Red")) {
				hi.setPenColor(255,0,0);
				hi.setPenWidth(10);
				hi.move(100);
				hi.turn(120);
				hi.move(100);
				hi.turn(120);
				hi.move(100);
				hi.turn(120);
			} 
			else if (whatColor.equals("Green")) {
				hi.setPenColor(0,255,0);
				hi.setPenWidth(10);
				hi.move(100);
				hi.turn(120);
				hi.move(100);
				hi.turn(120);
				hi.move(100);
				hi.turn(120);
			}
			else if (whatColor.equals("Blue")) {
				hi.setPenColor(0,0,255);
				hi.setPenWidth(10);
				hi.move(100);
				hi.turn(120);
				hi.move(100);
				hi.turn(120);
				hi.move(100);
				hi.turn(120);
			} 
			
			
		} 
		else if (whatShape.equals("Square")) {
			String whatColor = JOptionPane.showInputDialog("What color do you want the robot to draw? (Red, Green, Blue)");
			if (whatColor.equals("Red")) {
				hi.setPenColor(255,0,0);
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
			else if (whatColor.equals("Green")) {
				hi.setPenColor(0,255,0);
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
			else if (whatColor.equals("Blue")) {
				hi.setPenColor(0,0,255);
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
			
		
		}
		
		

	}

}
}
