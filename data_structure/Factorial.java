package data_structure;

public class Factorial {
	public static void main(String[] args) {
		int factorial = fact(5);
		System.out.println("factorial is "+factorial);
		
	}
	public static int fact(int num) {
		if(num == 0) {
			return 1;
		}
		else {
		return num*fact(num-1);
		}
	}
}
