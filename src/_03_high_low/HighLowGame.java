//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 0 - 100. 
		int random = new Random().nextInt(101);
		System.out.println(random);
		for (int i = 0; i < 10; i++) {
			String ask = JOptionPane.showInputDialog("Guess the random number of 0 - 100.");
			int guess = Integer.parseInt(ask);
			if (guess == random) {
				JOptionPane.showMessageDialog(null, "You are correct!");
				System.exit(0);
			}
			else if (guess > random) {
				JOptionPane.showMessageDialog(null, "It's too high.");
			}
			else if(guess < random) {
				JOptionPane.showMessageDialog(null, "It's too low.");
			}
		}
		System.out.println("You lost.");
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


