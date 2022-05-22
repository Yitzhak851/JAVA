
/**
 * Write a description of class ShowMessage here.
 *
 * @author (YBO)
 * @version (1.0)
 */

import javax.swing.JOptionPane;
public class ScannerMessage {

    public static void main (String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hi " + name + " !");
    }
    
}