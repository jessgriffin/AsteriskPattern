
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfAsterisks = 20;

		// FIRST TRIANGLE
		for (int x = 0; x < numberOfAsterisks; x++) {

			for (int y = 0; y < x + 1; y++) {
				// prints *
				System.out.print("*");

			}
			System.out.println("");

		}

		System.out.println("");
		// END OF FIRST TRIANGLE

		// SECOND TRIANGLE
		for (int a = numberOfAsterisks; a >= 0; a--) {

			for (int b = 0; b < a; b++) {
				// prints * as many times as A's current value (it'll go through
				// the loop the nubmer of times a's value is)
				System.out.print("*");

			}
			System.out.println("");
		}

		System.out.println("");

		// END OF SECOND TRIANGLE

		// THIRD TRIANGLE

		for (int a = 0; a < numberOfAsterisks; a++) {

			for (int b = 1; b < a + 1; b++) {
				// prints spaces as many times as A's current value
				System.out.print(" ");
			}
			for (int c = numberOfAsterisks; c > a; c--) {

				System.out.print("*");

			}
			System.out.println("");
		}

		System.out.println("");
		// END OF THRID TRIANGLE

		// FOURTH TRIANGLE
		for (int a = numberOfAsterisks; a > 0; a--) {

			for (int b = 0; b < a - 1; b++) {
				// prints a space as many times as a's current value
				System.out.print(" ");
			}

			for (int c = numberOfAsterisks; c > a - 1; c--) {

				System.out.print("*");

			}

			System.out.println("");

		}

		System.out.println("");

	}

}
