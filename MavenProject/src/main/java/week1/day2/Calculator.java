package week1.day2;

public class Calculator {
	public static void main(String[] args)
	{
		Calculator obj = new Calculator();
		
		int add = obj.add(2,3,4);
		System.out.println(add);
		
		int sub = obj.sub(4,2);
		System.out.println(sub);
		
		double mul = obj.mul(26.43,36.456);
		System.out.println(mul);
		
		float divide = obj.divide(2.4f,1.4f);
		System.out.println(divide);
		
		
	}

	public int add(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}

	public int sub(int num1, int num2)
	{
		return num1-num2;
	}
	public double mul(double num1, double num2)
	{
		return num1*num2;
	}
	public float divide(float num1, float num2)
	{
		return num1/num2;
	}
}



