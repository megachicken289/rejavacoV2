package chapters.ch8.k_OptionalObjectsWithGraphics;

import javax.swing.*;

/**
 * Created by Frank Borges XPTHQ on 3/2/2018.
 */
public class TestDraw {
	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(500,500);
		app.setVisible(true);
	}
}
