package chapters.ch6;

import java.security.SecureRandom;

public class Craps {
	private static final SecureRandom randNumbs = new SecureRandom();
	
	// enum to represent the game status
	private enum Status {
		CONTINUE, WON, LOST
	}
	
	;
	
	// conts taht rep cmn rolls
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	// plays one game
	public static void main (String[] args) {
		int myPoint = 0; // point if no win or lose on first roll
		Status gameStatus;   // can contain CONTINUE, WON, or LOST
		
		int sumOfDice = rollDice();
		
		// determine game status and point based on first roll
		switch (sumOfDice) {
			case SEVEN:      // 7 on first rol
			case YO_LEVEN:   // 11 on first roll
				gameStatus = Status.WON;
				break;
			
			case SNAKE_EYES: // 2 on first roll
			case TREY:       // 3 on first roll
			case BOX_CARS:   // 12 on first roll
				gameStatus = Status.LOST;
				break;
			
			default:     // no win or lose; remember point
				gameStatus = Status.CONTINUE;    // game not over
				myPoint = sumOfDice;
				System.out.printf("Point is %d%n", myPoint);
				break;
		}
		
		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();  // roll again
			
			// determine game status
			if (sumOfDice == myPoint)    // win
			{
				gameStatus = Status.WON;
			} else if (sumOfDice == SEVEN)  // lose by rolling seven before point
			{
				gameStatus = Status.LOST;
			}
		}
		
		// display won or lost message
		if (gameStatus == Status.WON) {
			System.out.println("Player wins");
		} else {
			System.out.println("Player lose");
		}
	}
	
	// roll dice, calc sum and display res
	public static int rollDice () {
		// pick rand die values
		int die1 = 1 + randNumbs.nextInt(6); // first die roll
		int die2 = 1 + randNumbs.nextInt(6); // second die roll
		
		int sum = die1 + die2;
		
		// dijsplay results of this roll
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}
}
