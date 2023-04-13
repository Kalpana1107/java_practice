package JavaBasic;

public class ReverseWords {

	public static void main(String[] args) {
		String a = "Welcome to my page";
		String[] split = a.split(" ");
		String reverseString="";
		for (String w: split)
		{
			String reverseWord="";
			for (int i = w.length()-1; i>=0; i--) {
				reverseWord =reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
			
		}
		System.out.println("Reversed String: " + reverseString);
		
		
	}
	}
