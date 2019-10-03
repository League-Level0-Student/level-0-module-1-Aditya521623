package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		String answer = JOptionPane.showInputDialog("What is greater than god, more evil than the devil, the poor have it, the rich need it, and is you eat it, you'll die.");		
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		if( answer.equalsIgnoreCase("nothing")) {
			
			JOptionPane.showMessageDialog( null, " correct! " );
			
			score++;
			
		}
		else
		{
		JOptionPane.showMessageDialog( null, " W-R-O-N-G!!!!!! "  );
		}
		
		String answer2 = JOptionPane.showInputDialog(" You can drop me from the tallest building, and I be fine. If you drop me in water, i'll die. WHO AM I?");		
		
		// 6. Add some more riddles

if( answer2.equalsIgnoreCase("paper")) {
			
			JOptionPane.showMessageDialog( null, " correct! " );
			
			 score++;
			
		}
		else
		{
		JOptionPane.showMessageDialog( null, " W-R-O-N-G!!!!!! "  );
		}



JOptionPane.showMessageDialog( null, " Your final score is:" + score);


		
	}
}

