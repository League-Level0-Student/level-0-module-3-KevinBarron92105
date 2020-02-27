//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) { 
		//1. Create a new Robot
		Robot Jack =   new Robot();
		Jack.penDown();
		//3. Ask the user what color they would like the robot to draw
		String color=JOptionPane.showInputDialog("what color do you want the robot to draw");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("white")) {
			Jack.setPenColor(Color.DARK_GRAY);
		}
		
		
		
		
        //6. If the user doesn’t enter anything, choose a random color
		else {
			JOptionPane.showMessageDialog(null, "NO ONLY GRAY");
		}
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		for(int i=0; i <10; i++) {
			
		}
		//4. Set the pen width to 10
		Jack.setPenWidth(20);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Jack.setSpeed(1000000);
		Jack.move(150);
		Jack.turn(90);
		Jack.move(150);
		Jack.turn(90);
		Jack.move(150);
		Jack.turn(90);
		Jack.move(150);
		
		
		
		
		
		
		

	}

	private static void elseif(Object showMessageDialog) {
		// TODO Auto-generated method stub
		
	}

	private static void elseif(Object showMessageDialog) {
		// TODO Auto-generated method stub
		
	}
}
