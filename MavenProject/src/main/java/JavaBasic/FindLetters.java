package JavaBasic;

public class FindLetters {
public static void main(String[] args) {
	String t1="kalpana is a good girl";
	int a = 0;
	char[] b = t1.toCharArray();
	for(int i=1; i<b.length; i++)
		if(b[i]=='a') 
		{
			a++;
		}
	System.out.println(a);
}
}