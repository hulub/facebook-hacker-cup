import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(new File("lazy_loading_example_input.txt"));
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			int[] W = new int[N];
			for (int j = 0; j < N; j++)
				W[j] = scanner.nextInt();

			// manipulate input
			System.out.println(N);
			System.out.println(Arrays.toString(W));
		}
		scanner.close();
	}
}
