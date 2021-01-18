package RollingDice;

import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		Random randNumber = new Random();
		int x = randNumber.nextInt(6) + 1;
		System.out.println("You rolled a: " + x);
	}

}
