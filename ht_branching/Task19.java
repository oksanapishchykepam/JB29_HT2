package by.oks.jb29_les03.ht_branching;

/* Подсчитать количество положительных среди чисел а, b, с. */

public class Task19 {

	public static void main(String[] args) {
		
		
		int a = Task14.enterNumber();
		int b = Task14.enterNumber();
		int c = Task14.enterNumber();
		
		int countPositive = 0;
		countPositive = count(a, countPositive);
		countPositive = count(b, countPositive);
		countPositive = count(c, countPositive);
		
		System.out.println("Количество положительных чисел среди " + a + ", " + b + ", "  + c + " = " + countPositive);
		
	}
	
	public static int count(int number, int count) {
				
		if (number > 0) {
			count = count + 1;
		}
		
		return count;
	}

}
