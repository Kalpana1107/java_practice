package JavaBasic;

import java.util.Scanner;

public class Username {
	public static void main(String[] args) {
		String userName = "kalpana@gmail.com";
		String passWord = "kalpana@123";
		Scanner uName = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("User Name: ");
			String user = uName.nextLine();
			System.out.println("Enter password");
			String pass = uName.nextLine();

			if ((userName.equals(user)) && (passWord.equals(pass))) {
				System.out.println("you are successfully logged in");
				break;
			} else
				{
				if (i == 2)
				System.out.println("Your id is locked");
				else
			    System.out.println("Username or password is incorrect");
				}
		}
		uName.close();
	}
}
