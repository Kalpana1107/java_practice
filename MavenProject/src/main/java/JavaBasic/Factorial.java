package JavaBasic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int input, fact = 1;
	Scanner obj = new Scanner (System.in);
	System.out.println("Factorial Number: " );
	input = obj.nextInt();
	 for (int i = 1; i<=input; i++) {
		 fact = fact * i;
		
	 }obj.close();
	 System.out.println(fact);
	}
	
}
