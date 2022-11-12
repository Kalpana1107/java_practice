package JavaBasic;

public class Findchar {
		public static void main(String[] args)
		{
			String test = "kalpana@123#";
			int  letter = 0, num = 0, specialChar = 0;
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
				else
				{
					specialChar++;
				}
			}
			System.out.println("letter: " + letter);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);
		}
	}
