package elseif;

import javax.swing.JOptionPane;

public class Zodiac {

	public static void main(String[] args) {
		String zodiac;
		zodiac=JOptionPane.showInputDialog("What is your zodiac sign?");
		if (zodiac.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "You are courageous, energetic, willful, commanding, leading. You often lead, even when following would be best course of action.");
		}
		else if (zodiac.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You are pleasure seeking, you love control, you are dependable, grounded, provoked slowly, and highly sensual in nature.");
		}
		else if (zodiac.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "You are cerebral, chatty, you love learning and education, you are charming, and adventurous.");
		}
		else if (zodiac.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You are emotional, group oriented, and you seek security and family.");
		}
		else if (zodiac.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "You are generous, organized, protective, and beautiful.");
		}
		else if (zodiac.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You are balanced, you seek beauty, and have a sense of justice.");
		}
		else if (zodiac.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You are passionate, exacting, loves extremes, combative, and reflective.");
		}
		else if (zodiac.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You are happy, absent minded, creative, and adventurous.");
		}
		else if (zodiac.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You are timeless, driven, calculating, and ambitious.");
		}
		else if (zodiac.equalsIgnoreCase("Aquaris")) {
			JOptionPane.showMessageDialog(null, "You are forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		}
		else if (zodiac.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You are particular, logical, practical, you haved a sense of duty, and are critical.");
		}
		else if (zodiac.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You are likeable, energetic, passionate, and sensitive.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That isn't a zodiac sign!");
		}
	}
}
