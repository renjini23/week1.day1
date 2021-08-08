package week1.day1;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		int quotient = 1;
		int sum = 0;
		int remainder = 0;
		while (quotient > 0) {
			quotient = number / 10;
			remainder = number % 10;
			number = quotient;
			sum = sum + remainder;
		}
		System.out.println("Sum of Digits is :- " + sum);
	}

}
