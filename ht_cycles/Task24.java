package by.oks.jb29_les03.ht_cycles;

/*Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в
другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.*/

public class Task24 {

	public static void main(String[] args) {
		int number = Task06.enterNumber();
		
		int sumOfDigits = 0;
		int newNumber = 0;
		int lastDigit = 0;
		
		while (number > 0) {
			lastDigit = number % 10;
			newNumber = newNumber * 10 + lastDigit;
			
			if (lastDigit % 2 == 0) {
				sumOfDigits = sumOfDigits + lastDigit;
			}
			
			number = number / 10;
		}
		
		
		
		System.out.println(sumOfDigits);
		System.out.println(newNumber);

	}

}
