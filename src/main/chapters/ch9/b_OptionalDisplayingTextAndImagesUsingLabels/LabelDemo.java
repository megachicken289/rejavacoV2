package chapters.ch9.b_OptionalDisplayingTextAndImagesUsingLabels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Frank Borges XPTHQ on 3/5/2018.
 */
public class LabelDemo {
	public static void main(String[] args) {
		// Create a label with plain text
		JLabel northLabel = new JLabel("North");
		
		// create an icon from an images so we can put it on a JLabel
		ImageIcon labelIcon = new ImageIcon("GUItip.gif");
		
		// create a label with an Icon instead of text
		JLabel centerLabel = new JLabel(labelIcon);
		
		// create another label with an Icon
		JLabel southlabel = new JLabel("South");
		
		// set the label to display text (as well as the icon)
		southlabel.setText("South");
		
		// create a frame to hold the labels
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add the labels to the frame; the second arg specifies
		// where on the frame to add the label
		app.add(northLabel, BorderLayout.NORTH);
		app.add(centerLabel, BorderLayout.CENTER);
		app.add(southlabel, BorderLayout.SOUTH);
		
		app.setSize(500,500);
		app.setVisible(true);
	}
}
