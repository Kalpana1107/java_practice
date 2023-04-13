package JavaBasic;

import java.util.Arrays;

public class AscendingOrderLetters {
	public static void main(String[] args) {
		char[] letter = { 'c', 'b', 'a', 'f', 'e' };
		System.out.println("before sorting");
		for (char ao : letter) {

			System.out.print(ao);
		}
		System.out.println();
		Arrays.sort(letter);
		System.out.println("after sorting");
		for (char ao : letter) {

			System.out.print(ao);
		}

	}
}
