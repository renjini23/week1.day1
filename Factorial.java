package week1.day1;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;

		}

		System.out.println("Factorial of number " + number + " is :- " + fact);

	}

}
