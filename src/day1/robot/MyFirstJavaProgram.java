package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot V86R = new Robot ();
		V86R.penDown();
		V86R.setPenColor(Color.CYAN);
		V86R.setSpeed(1000);
		V86R.move(250);
		V86R.turn(180);
		V86R.move(250);
		V86R.setWindowColor(0, 250, 0);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(360);
		V86R.turn(90);
		for (int i = 0; i < 1; i++) {
			V86R.move(250);
			V86R.turn(90);
		}
		
		V86R.setPenColor(Color.MAGENTA);
		for (int i = 0; i < 1; i++) {
			V86R.move(250);
			V86R.turn(90);
		}
		V86R.move(250);
		V86R.turn(90);
		V86R.move(250);
		V86R.turn(90);
		V86R.move(250);
		V86R.setPenColor(Color.PINK);
		V86R.move(250);
		V86R.turn(-90);
		V86R.move(250);
		V86R.turn(-90);
		V86R.move(250);
		V86R.turn(-90);
		V86R.move(250);
		V86R.setPenColor(Color.GREEN);
		V86R.move(250);
		V86R.turn(-90);
		V86R.move(250);
		V86R.turn(-90);
		V86R.move(250);
	
		
		
		

		
		
		
		
		
	}
}
