package JavaBasic;

import java.util.Scanner;

public class PrimeNumber {

	// To find whether a number is prime number or not

	public static void main (String[] args)
	{
		int input;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number:" );
		input = obj.nextInt();
		obj.close();
		
		boolean flag = false;
		for (int i=2; i <= input/2; i++)
		{
			if (input % i == 0)
			{
				flag = true;
				break;	
			}
		}
		if (!flag)
			System.out.println(input + " is a prime number");
		else
			System.out.println(input + " is not a prime number");
	}
	

}
