
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "August 30th";
		String myBirthday = "October 27th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String bday = JOptionPane.showInputDialog(
				"Who's birthday do you want to know? If you want to know mine, type in yours. Don't use 's");
		// 3. Print out what the user typed
		System.out.println(bday);
		// 4. if user asked for "mom"
		if (bday.equalsIgnoreCase("Mom")) {
			// print mom's birthday
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		else if (bday.equalsIgnoreCase("Dad")) {
			// print dad's birthday
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		else if (bday.equalsIgnoreCase("Yours")) {
			// print myBirthday
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birhtday!");
		}
	}
}
