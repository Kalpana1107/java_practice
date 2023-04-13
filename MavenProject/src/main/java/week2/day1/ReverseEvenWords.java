package week2.day1;

public class ReverseEvenWords 
{
	public static void main(String[] args) 
	{
		String test = "I am a software tester";
		String[] split = test.split(" ");
		String output="";
		String rev="";
		// Traverse through each word (using loop)
		for (int i = 0; i < split.length; i++)
		{
			// find the odd index within the loop (use mod operator)
			
			if((i+1)%2==0) 
			{
				//print the even position words in reverse order using another loop (nested loop)
				
				char[] charArray = split[i].toCharArray();

				for (int j =charArray.length-1; j>=0; j--) 
				{
					rev=rev+charArray[j];
				}

				output=output+rev+" ";	
			}
			else			
				output=output+split[i]+" ";
		}
		System.out.println(output);
	}
}