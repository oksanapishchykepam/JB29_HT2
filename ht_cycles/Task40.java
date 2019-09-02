package by.oks.jb29_les03.ht_cycles;

/*Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.*/

public class Task40 {

	public static void main(String[] args) {
		int number = Task06.enterNumber();
		System.out.println("Результат: ");
		
		for (int foundNumber = 1; foundNumber < number; foundNumber++) {
			int rest = foundNumber;
			int lastDigit = 0;
			boolean rightResult = true;
			
			while (rest > 0) {
				lastDigit = rest % 10;
				rest = rest / 10;
				
				if (lastDigit != 0) {
					if (number % lastDigit == 0) {
						rightResult = true;
					} else {
						rightResult = false;
						rest = 0;
					}
				}

			}
			
			if (rightResult) {
				System.out.println(foundNumber);
			}
		}

	}

}
