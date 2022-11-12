package JavaBasic;

public class FindLargestSmallest {
	public static void main(String[] args) {
		int a[] = { 3, 42, 6, 34, 7, 8, 9, 11 };
		int smallest = a[0];
		int largest = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > largest)
				largest = a[i];
			else if (a[i] < smallest)
				smallest = a[i];
		}
		System.out.println("Largest number is: " + largest);
		System.out.println("Smallest number is : " + smallest);
	}
}
