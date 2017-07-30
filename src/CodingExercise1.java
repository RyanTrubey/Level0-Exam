import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot idk = new Robot();
    	idk.penDown();
    	idk.setSpeed(10);
   	 // 3. ask the user what color they would like the Robot to draw
    	String colors = JOptionPane.showInputDialog("Which Color?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if(colors.equalsIgnoreCase("Red")){
    		idk.setPenColor(Color.red);
    	} else if (colors.equalsIgnoreCase("Blue")){
    		idk.setPenColor(Color.blue);
    	} else if (colors.equalsIgnoreCase("Green")){
    		idk.setPenColor(Color.green);
    	} else if (colors.equalsIgnoreCase("Orange")){
    		idk.setPenColor(Color.orange);
    	} else if (colors.equalsIgnoreCase("yellow")){
    		idk.setPenColor(Color.yellow);
    	}
   	 // 2. set the pen width to 10
    	idk.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 	for(int i = 0; i < 4; i++){
   	 		idk.move(100);
   	 		idk.turn(90);
   	 	}
    }

}
