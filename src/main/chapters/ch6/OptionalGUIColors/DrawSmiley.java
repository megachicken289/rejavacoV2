package chapters.ch6.OptionalGUIColors;

import javax.swing.*;
import java.awt.*;

public class DrawSmiley extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		// draw face
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		// draw eyes
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		// draw mouth
		g.fillOval(50, 110, 120, 60);
		
		// "touch up" the mouth into smile
	    /*
         * comment out to have a shocked face :O
         */
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
}