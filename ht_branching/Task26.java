package by.oks.jb29_les03.ht_branching;

/* Написать программу нахождения суммы большего и меньшего из трех чисел. */

public class Task26 {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int number3;
		
		number1 = Task14.enterNumber();
		number2 = Task14.enterNumber();
		number3 = Task14.enterNumber();
		
		int min;
		int max;
		
		if (number1 < number2 && number1 < number3) {
			min = number1;
			if (number2 > number3) {
				max = number2;
			}
			else {
				max = number3;
			}
		}
		else {
			if (number2 < number1 && number2 < number3) {
				min = number2;
				if (number1 > number3) {
					max = number1;
				}
				else {
					max = number3;
				}
			}
			else {
				min = number3;
				if (number1 > number2) {
					max = number1;
				}
				else {
					max = number2;
				}
			}
		}
		
		int sum;
		sum = min + max;
		
		System.out.println("Исходные числа: " + number1 + ", " + number2 + ", "  + number3);
		System.out.println("Результат: " + sum);
		
	}

}
