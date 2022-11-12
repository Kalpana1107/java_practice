package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String t1="welcome to chennai";
		int a = 0;
		char[] array = t1.toCharArray();
		for(int i=0; i< array.length; i++)
		{
			if (array[i] == 'e')
			{
				a++;
			}
		}
		System.out.println(a);
	}
}

