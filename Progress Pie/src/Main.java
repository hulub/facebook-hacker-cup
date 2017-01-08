import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(new File("progress_pie_example_input.txt"));
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int P = scanner.nextInt();
			int X = scanner.nextInt();
			int Y = scanner.nextInt();
			System.out.print("Case #" + (i + 1) + ": ");
			if (P == 0 || !isInCircle(X, Y) /*verify the steep*/) {
				System.out.println("white");
				continue;
			}
			System.out.println("black");
		}
		scanner.close();
	}

	private static boolean isInCircle(int x, int y) {
		double distance = Math.sqrt((x - 50) * (x - 50) + (y - 50) * (y - 50));
		return distance <= 50;
	}
}
