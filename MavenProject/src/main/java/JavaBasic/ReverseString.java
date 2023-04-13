package JavaBasic;

public class ReverseString {

	public static void main(String[] args) {
		String a[] = "It is a Java Program".split(" ");
		String res = " ";
		
		for (int i = a.length-1; i>=0; i--) {
			res += a[i] + " ";
		}
		System.out.println("Reversed string: " + res);
			
	
	}
	
}
