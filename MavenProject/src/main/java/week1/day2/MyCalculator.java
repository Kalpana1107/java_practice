package week1.day2;

public class MyCalculator {

	public static void main(String[] args)
	{
		Calculator obj = new Calculator();
		System.out.println("Addition: " + obj.add(10, 20, 30));
		System.out.println("Sub: " + obj.sub(20, 5));
		System.out.println("Multiply: " + obj.mul(23.45, 340.4567));
		System.out.println("Divide: " + obj.divide(4.0f, 2.0f));
	}
	
}
