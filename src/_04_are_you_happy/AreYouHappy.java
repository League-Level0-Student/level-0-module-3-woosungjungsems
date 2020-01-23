package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String ask_If_Happy = JOptionPane.showInputDialog("Are you happy?");
		if(ask_If_Happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		} else if(ask_If_Happy.equalsIgnoreCase("no")) {
			String ask_Want_Happy = JOptionPane.showInputDialog("Do you want to be happy?");
			if(ask_Want_Happy.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else if(ask_Want_Happy.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
		}

	}

}
