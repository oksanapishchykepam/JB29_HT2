package by.oks.jb29_les03.ht_cycles;

/*Найдите наибольшую цифру данного натурального числа.*/

public class Task33 {

	public static void main(String[] args) {
		int number = Task06.enterNumber();
		int lastDigit = 0;
		int maxDigit = 0;
		
		while (number > 0) {
			lastDigit = number % 10;
			if (lastDigit > maxDigit) {
				maxDigit = lastDigit;
			}
			
			number = number / 10;
		}

		System.out.println("Наибольшая цифра числа = " + maxDigit);
	}

}