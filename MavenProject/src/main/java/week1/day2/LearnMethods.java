package week1.day2;

public class LearnMethods {
 
	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();
		//obj.methodName();
		obj.printCarName();
		
		int CarRegNumber = obj.getCarRegNumber();
		System.out.println(CarRegNumber);
		
		String getCarVariant = obj.getCarVariant();
		System.out.println(getCarVariant);
		
		int multiply = obj.multiplyTwoNumbers(3,3);
		System.out.println(multiply);
	}
	public void printCarName() {
	 System.out.println("Maruti Suzuki");
}
	public int getCarRegNumber() {
		int CarRegNumber = 1130;
		
		return CarRegNumber;
	}
	public String getCarVariant() {
		return "Ciaz";
	}
	public int multiplyTwoNumbers(int x, int y) {
		return x*y;
	}
}

