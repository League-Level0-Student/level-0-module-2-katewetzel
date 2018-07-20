package methods;

import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SafeCracker {

	public static void main(String[] args) {
		/*
		 * Your mission: use the tryCode method to crack the safe by trying all possible
		 * combinations
		 */
		for(int i=0; i<10000000;i++) {
			System.out.println(i);
			tryCode(i);
			
		}
	}

	static void tryCode(int i) {
		
		System.out.println("trying " + i);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (i == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + i);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}
	

	private static void playTheSoundOfSuccess() {
		try {
			AudioClip sound = JApplet.newAudioClip(SafeCracker.class.getResource("me-gusta.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
}

	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
