package by.oks.jb29_les03.ht_cycles;

/*Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.*/

public class Task34 {

	public static void main(String[] args) {
		
		int number = 1000;
		
		System.out.println("Сумма следующих четырехзначныч чисел равна 15: ");
		
		for (number = 1000; number <= 9999; number++) {
			
			int rest = number;
			
			int lastDigit = 0;
			int sumOfDigits = 0;
			
			while (rest > 0) {
				lastDigit = rest % 10;
				sumOfDigits = sumOfDigits + lastDigit;
				rest = rest / 10;
			}
			
			if (sumOfDigits == 15) {
				System.out.println(number);
			}
			
			
		}

	}

}
