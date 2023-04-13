package JavaBasic;

public class Practice2 {
	public static void main(String[] args) {
		int k = 10;
		for (int i = 1; i <= k; i++)
		{
			for (int j = k; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
