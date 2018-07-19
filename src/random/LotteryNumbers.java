package random;

	import java.util.Random;

import javax.swing.JOptionPane;

	public class LotteryNumbers {
		public static void main(String[] args) {
		String number = "";
		for(int i = 0; i < 5; i++) {
			int r = new Random().nextInt(10);
			System.out.println(r);
			number += r;
}
		JOptionPane.showMessageDialog(null, number);
		}
}