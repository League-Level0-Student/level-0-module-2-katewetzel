package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How tall are you in inches?");
	int a = Integer.parseInt(answer);
	if(a>=48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster");
	}else
		JOptionPane.showMessageDialog(null, "You need to grow more before you can go on the rollercoaster");
	}
}
	
	

