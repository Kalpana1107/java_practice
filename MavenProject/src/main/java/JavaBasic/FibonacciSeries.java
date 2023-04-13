package JavaBasic;

public class FibonacciSeries {

	// To find Fibonacci series for the given number
	
	public static void main(String[] args) {
		int i1 = 0, i2 = 1, sum, range = 10;
		
		for (int i = 1; i < range; i++ ) {
			System.out.println(i1);
			sum = i1 + i2;
			i1=i2;
			i2=sum;
						
			
		}
	}
}
