package chapters.ch8.k_OptionalObjectsWithGraphics;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

/**
 * Created by Frank Borges XPTHQ on 3/2/2018.
 */
public class DrawPanel extends JPanel {
	private SecureRandom randNumb = new SecureRandom();
	private MyLine[] lines; // array of lines
	
	// constructor, creates a panel with rand shapes
	public DrawPanel() {
		setBackground(Color.WHITE);
		
		lines = new MyLine[5+randNumb.nextInt(5)];
		
		// create liens
		for (int count = 0; count < lines.length; count++) {
			// generate rand cooridinates
			int x1 = randNumb.nextInt(500);
			int y1 = randNumb.nextInt(500);
			int x2 = randNumb.nextInt(500);
			int y2 = randNumb.nextInt(500);
			
			// generate a random color
			Color color = new Color(
					randNumb.nextInt(256),
					randNumb.nextInt(256),
					randNumb.nextInt(256));
			
			// add the line to the list of lines to be displayed
			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
	}
	
	// for each shape array, draw the individual shapes
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		// draw the lines
		for (MyLine line : lines) {
			line.draw(g);
		}
	}
}
