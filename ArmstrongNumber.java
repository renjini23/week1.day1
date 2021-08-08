package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original = 153;
		int realOriginal = original;
		int calculated = 0;
		int quotient = 1;
		int remainder = 0;
		while (quotient > 0) {

			quotient = original / 10;
			remainder = original % 10;
			calculated = calculated + (remainder * remainder * remainder);
			original = quotient;

		}

		if (calculated == realOriginal) {
			System.out.println("This number is an Armstrong Number");

		} else {
			System.out.println("This number is not an Armstrong Number");
		}

	}

}
