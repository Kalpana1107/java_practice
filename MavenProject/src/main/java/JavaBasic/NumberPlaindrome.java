package JavaBasic;

import java.util.Scanner;

public class NumberPlaindrome {
	public static void main(String[] args) {
		int i, j = 0, k;
		Scanner get = new Scanner(System.in);
		i = get.nextInt();
		int temp = i;
		while (i > 0) {
			k = i % 10;
			j = (j * 10) + k;
			i = i / 10;
		}
		if (temp == j) {
			System.out.print(temp);
			System.out.print(" is a Palindrome number");
		} else {
			System.out.println(i);
			System.out.print(" is not a Palindrome number");
		}get.close();
	}
}
