import java.util.Scanner;

class Collatz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		boolean exitCode = false;

		System.out.println("\n --Welcome to the Collatz Conjecture Calculator-- \n");
		while (!exitCode) {
			System.out.print("Enter a positive integer: ");
			number = scanner.nextInt();
			System.out.println("------------------------------");
		
			while (number != 1) {
				if (number % 2 == 0) {
					System.out.println("Interger is EVEN.");
					System.out.println(number + " / 2");
					number = number / 2;
					System.out.println("OUTPUT: " + number + "\n");
				} 
				else {
					System.out.println("Interger is ODD.");
					System.out.println("3(" + number + ") + 1");
					number = ((3 * number) + 1);
					System.out.println("OUTPUT: " + number + "\n");
				}
			}
			System.out.println("Use CTRL-C to exit program.\n");
		}
	}
}