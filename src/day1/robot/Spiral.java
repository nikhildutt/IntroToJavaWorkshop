package day1.robot;

import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot varun = new Robot();
		// 5. Set your robot's pen to the down position
varun.penDown();
		// 3. Set the robot to go at max speed (10)
varun.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
for (int i = 0; i < 75; i++) {
	varun.move(5*i);
	varun.setRandomPenColor();
	varun.setPenWidth(i);
if (i%2==0){
	varun.setPenColor(100,0,150);
}


			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			// 2. Turn the robot 1/3 of 360 degrees to the right
	varun.turn(360/7);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

}
}
}