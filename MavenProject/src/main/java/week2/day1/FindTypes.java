package week2.day1;

public class FindTypes
{
	public static void main(String[] args)
	{
		String test = "kalpana@123#";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] array = test.toCharArray();
		for (int i=0; i<array.length; i++)
		{
			if(Character.isLetter(array[i]))
			{
				letter++;
			}
			else if(Character.isDigit(array[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(array[i]))
			{
				space++;
			}
		
			else
			{
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
}
