package java.chapters.ch3.OptionalGUIDialogBoxes;

import javax.swing.*;

public class NameDialog
{
    public static void main(String[] args) {
        // prompt user
        String name = JOptionPane.showInputDialog("What yo' nam':");

        // mkMsg
        String message = String.format("Welcome [%s] to Java programming!", name.toUpperCase());

        //display in dialog
        JOptionPane.showMessageDialog(null, message);
    }
}
