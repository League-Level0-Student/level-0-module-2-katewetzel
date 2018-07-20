package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How old are you?");
	int a = Integer.parseInt(answer);
	if(a>=18) {
		String answer2 = JOptionPane.showInputDialog("Who should the next president be?");
		if(answer2.equals("Trump")) {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	}else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	}
}
}
