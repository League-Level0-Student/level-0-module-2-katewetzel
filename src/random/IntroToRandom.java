//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		
		
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		int r = new Random().nextInt(101);

		//4. Limit the random number between 0 and 100

		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		int x = new Random().nextInt(((75-25)+1)+25);
		//6. Challenge: Limit the random number between -222 and 88
		int y = new Random().nextInt(((88-(-222)+1)-222));
		//1. Print out the value of r
		System.out.println(r);
		System.out.println(x);
		System.out.println(y);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}