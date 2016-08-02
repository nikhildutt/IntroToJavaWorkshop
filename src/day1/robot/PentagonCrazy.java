package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
Robot sam = new Robot();
sam.hide();
		// 3. Put the robot's pen down
sam.penDown();
		// 8. Make the robot go at maximum speed (10)
sam.setSpeed(10);
		// 9. Set the pen to a color that you like for the shape

		// 4. Make a variable for the number of sides you want (can’t test this one)
int side = 5;
		// 5. Make a variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6.
int angle = 360/5;
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.

for (int i = 0; i < 200; i++) {
	sam.move(i);
	sam.turn(angle);
	sam.setRandomPenColor();
	sam.turn(1);
	if (i % 2 == 0){
		sam.setPenColor(Color.YELLOW);
	}
	else {
		sam.setPenColor(Color.RED);
	}
			// 2. Move the robot 200 pixels
	
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	
			// 6. Turn the robot the amount in your angle variable
	
			// 11. Turn the robot one more degree
}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}