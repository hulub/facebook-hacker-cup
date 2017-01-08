import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("fighting_the_zombie_example_input.txt"));
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int H = scanner.nextInt();
			int S = scanner.nextInt();
			Spell[] spells = new Spell[S];
			String[] spells_string = scanner.nextLine().split(" ");
			for (int j = 0; j < S; j++)
				spells[j] = new Spell(spells_string[j]);
			
		}
		scanner.close();
	}
}
