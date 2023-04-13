package week2.day1;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args)
	{
		String text1 = "stops";
		String text2 = "posts";
		boolean flag=false;
		if(text1.length() == text2.length())
		{
			char[] array = text1.toCharArray();
			char[] charArray = text2.toCharArray();
			Arrays.sort(array);
			Arrays.sort(charArray);
			for (int i = 0; i < array.length; i++) 
			{
				if(array[i]==charArray[i])

					flag=true;
				else
					break;
			}

			if(flag)
				System.out.println("The text is an Anagram");
			else
				System.out.println("The text is not an Anagram");


		}
		else
			System.out.println("Length is different");
	}

}
