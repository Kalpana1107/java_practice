package week2.day1;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String name1 = "malayalam";
		String revname1 = "";
		char[] array = name1.toCharArray();
		for (int a = name1.length() - 1; a>=0; a--)
		{
			
			revname1+= array[a];
		}
		System.out.println(revname1);
		if (revname1.equals(name1))
		{
			System.out.println("The string is a palindrome");
		}
		else		{
		System.out.println("The string is not a Palindrome");
		}
	}
		
}