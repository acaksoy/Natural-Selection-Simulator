
import javax.swing.JFrame;
import java.lang.Thread;


import java.util.concurrent.TimeUnit;
import java.awt.*;

import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame MainFrame = new JFrame("Natural Selection Simulator");
		MainFrame.setSize(1000, 800);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Draw drawer = new Draw();
		MainFrame.setVisible(true);
		Rabbit firstRabbit =  new Rabbit();
		firstRabbit.setSpeed(0.10f); 
		firstRabbit.setPosition(500, 400);
		
		MainFrame.add(firstRabbit.getDrawer());
		firstRabbit.Move();
		MainFrame.add(drawer);
		drawer.sendData(20, 500, "Grass");
			
		
		
		

		// mvc muster
		// Beobachter entwurfmuster
		// sequenzdiagramm
		
		
		
		
		/* for mutation:
		 *  https://www.geeksforgeeks.org/mutation-algorithms-for-real-valued-parameters-ga/
		 * https://en.wikipedia.org/wiki/Mutation_(genetic_algorithm)
		 * https://www.tutorialspoint.com/genetic_algorithms/genetic_algorithms_mutation.htm
		 * 
		 * 
		 * for drawing:
		 * https://www.youtube.com/watch?v=CAWTh9KftN0
		 * image:
		 * https://www.youtube.com/watch?v=M-F7z1xWS6o
		 * 
		 * 
		 * for multi drawing:
		 * https://docs.oracle.com/javase/tutorial/uiswing/painting/problems.html
		 * https://www.cis.upenn.edu/~bcpierce/courses/629/jdkdocs/api/java.awt.Panel.html
		 * yeni!!!>>>> https://stackoverflow.com/questions/32442382/java-moving-objects-at-the-same-time
		 * 
		*/
		//http://greenteapress.com/thinkjava6/html/thinkjava6017.html
		
		
		
		

	}
	}