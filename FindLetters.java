package JavaBasic;

public class FindLetters {
public static void main(String[] args) {
	String t1="testleaf";
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