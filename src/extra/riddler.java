package extra;

import javax.swing.JOptionPane;

public class riddler {
public static void main(String[] args) {
	
String riddle1 = JOptionPane.showInputDialog("I have three sides, what am I?");


if(riddle1.equals("triangle")) {
	JOptionPane.showMessageDialog(null, "How did you know");
}
else {
	JOptionPane.showMessageDialog(null, "HA wrong!");
}

}
}
