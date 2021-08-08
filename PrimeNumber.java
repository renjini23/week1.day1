package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 19;
		boolean isDivisible = false;
		for (int i = 2; i < number / 2; i++) {
			int remainder = number % i;
			if (remainder == 0) {
				isDivisible = true;
			}

		}
		if (isDivisible == false) {
			System.out.println("Number is Prime");

		} else {
			System.out.println("Number is not prime");

		}

	}

}
