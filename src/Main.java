import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int intNumber = in.nextInt();

		if (1 <= intNumber && intNumber <= 5) {

			if (intNumber % 2 == 0) {
				System.out.println("Числото е четно!");
			}
			if (intNumber % 2 == 1) {
				System.out.println("Числото е нечетно!");
			}
			if (6 <= intNumber && intNumber <= 15) {
				if (intNumber % 3 == 0) {
					System.out.println("Числото се дели на 3 без остатък!");
				}
				if (intNumber % 3 != 0) {
					System.out.println("Числото се дели на 3 без остатък!");
				}
			}
			if (intNumber < 1 || 15 < intNumber) {
				if (intNumber == 0) {
					System.out.println("Числото е нула!");

				}
				if (intNumber < 0) {
					System.out.println("Числото е отрицателно!");
				}
				if (intNumber > 0) {
					System.out.println("Числото е положително!");
				}
			}
		}
	}
}
