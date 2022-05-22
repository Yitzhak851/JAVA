
/**
 * This class getting from the user :
 * Year of birth - centory.
 * Height & Char that represent if the user is Male or Female.
 *
 * @author (YBO)
 * @version (1.0)
 */

import javax.swing.JOptionPane;


public class PrintAge {
    
    public static void main (String[] args) {
        String YearBirth = JOptionPane.showInputDialog("Enter your year of birth");
        String ID = JOptionPane.showInputDialog("Enter your ID");
        String Height = JOptionPane.showInputDialog("Enter your Height");
        String Gender = JOptionPane.showInputDialog("Enter your Gender - Female/ Male ?");
        
        
        int age = 2022 - (Integer.parseInt(YearBirth));
        JOptionPane.showMessageDialog(null, " Your details are:"
                                            ," Yoar age:"  + age
                                            ," Your ID:" + ID
                                            , " Your Height:" + Height
                                            , " Your Gender:" + Gender );
    }
    
}    