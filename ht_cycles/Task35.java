package by.oks.jb29_les03.ht_cycles;

/*Найдите количество четных цифр данного натурального числа.*/

public class Task35 {

	public static void main(String[] args) {
		int number = Task06.enterNumber();
		int lastDigit = 0;
		int count = 0;

		while (number > 0) {
			lastDigit = number % 10;
						
			if (lastDigit % 2 == 0) {
				count++;
			}
			
			number = number / 10;
		}
		
		System.out.println("Количество четных цифр: " + count);
	}

}
