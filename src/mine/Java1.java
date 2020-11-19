package mine;

import java.util.Random;
import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		
		//ALGORITHM = binary search techniques

		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int randNum = 0;
		int upperLimit = 100;
		int lowerLimit = 1;
		String myAnswer = "";
		System.out.println("Imagine a number and type 'ready' once you are ready to play...");
		if (in.nextLine().equals("ready")) {
			do {
				randNum = (upperLimit + lowerLimit + 1) / 2;
				System.out.println("Is the number " + randNum + " ?");
				myAnswer = in.nextLine();

				if (myAnswer.equals("lower")) { // It should be higher
					upperLimit = randNum - 1;

				} else if (myAnswer.equals("higher")) { // It should be lower
					lowerLimit = randNum + 1;

				} else if (myAnswer.equals("end")) {
					System.out.println("Game Ended.");
					System.exit(0);
				}

			} while (!myAnswer.equals("yes"));

			in.close();
			System.out.println("this is jave1");
		}
	}
}