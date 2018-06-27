import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
String Birthday = JOptionPane.showInputDialog("What is your birthday");

if(Birthday.equals("6/27")) {
	JOptionPane.showMessageDialog(null, "happy birthday");
	
}
else {
	JOptionPane.showMessageDialog(null, "Happy unbirthday");
	
	
}


}
}
