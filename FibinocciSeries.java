package week1.day1;

public class FibinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secondNum = 1;
		int range = 8;
		int series = 0;
		System.out.println("Fibinocci Series:-");
		System.out.print(firstNum);
		System.out.print(" ");
		System.out.print(secondNum);
		for (int i = 3; i <= range; i++) {
			series = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = series;
			System.out.print(" " + series);
		}
	}

}
