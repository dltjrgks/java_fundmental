class MyMath {

	long add(long a, long b) {
		return a + b;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiple(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}

public class MyMathTest {
	
	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5, 3);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiple(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiple(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}
