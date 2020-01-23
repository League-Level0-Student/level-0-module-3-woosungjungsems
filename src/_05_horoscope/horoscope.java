package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {

	public static void main(String[] args) {
		String starSign = JOptionPane.showInputDialog("What is your Star Sign?");
		if(starSign.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		} else if(starSign.equalsIgnoreCase("taurus")) {
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		} else if(starSign.equalsIgnoreCase("gemini")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
		} else if(starSign.equalsIgnoreCase("cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
		} else if(starSign.equalsIgnoreCase("leo")) {
			JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
		} else if(starSign.equalsIgnoreCase("virgo")) {
			JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
		} else if(starSign.equalsIgnoreCase("libra")) {
			JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
		} else if(starSign.equalsIgnoreCase("scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
		} else if(starSign.equalsIgnoreCase("sagittarius")) {
			JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
		} else if(starSign.equalsIgnoreCase("capricorn")) {
			JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
		} else if(starSign.equalsIgnoreCase("aquarius")) {
			JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		} else if(starSign.equalsIgnoreCase("pisces")) {
			JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
		} else 
			JOptionPane.showMessageDialog(null, "There is no such thing like that");
		
		
		
	}

}
