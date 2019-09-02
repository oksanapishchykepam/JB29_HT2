package by.oks.jb29_les03.ht_branching;

/* Подсчитать количество отрицательных среди чисел а, b, с. */

public class Task18 {

	public static void main(String[] args) {
		
		int a = Task14.enterNumber();
		int b = Task14.enterNumber();
		int c = Task14.enterNumber();
		
		int countNegative = 0;
		countNegative = count(a, countNegative);
		countNegative = count(b, countNegative);
		countNegative = count(c, countNegative);
		
		System.out.println("Количество отрицательных чисел среди " + a + ", " + b + ", "  + c + " = " + countNegative);
		
	}
	
	public static int count(int number, int count) {
				
		if (number < 0) {
			count = count + 1;
		}
		
		return count;
	}

}
