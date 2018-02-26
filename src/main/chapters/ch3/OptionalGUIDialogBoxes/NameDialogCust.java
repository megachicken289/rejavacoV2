package chapters.ch3.OptionalGUIDialogBoxes;

import javax.swing.*;

public class NameDialogCust {
	public static void main (String[] args) {
		// prompt user
		String name = JOptionPane.showInputDialog("What yo' nam':");
		
		String message = "<YOU HAVE ENTERED NOTHING MORON>";
		if (name == null) {
			message = String.format("Welcome [%s] to Java programming!", name.toUpperCase());
		}
		
		JOptionPane.showMessageDialog(null, message);
	}
}
