package by.oks.jb29_les03.ht_cycles;

/*Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/

import java.util.ArrayList;

public class Task29 {

	public static void main(String[] args) {
		int number1 = Task06.enterNumber();
		int number2 = Task06.enterNumber();
		
		ArrayList<Integer> number1Digits = getNumberDigits(number1);
		ArrayList<Integer> number2Digits = getNumberDigits(number2);

		String commonDigits = "";
		
		for (int i = 0; i < number1Digits.size(); i++) {
			for (int j = 0; j < number2Digits.size(); j++) {
				if (number1Digits.get(i) == number2Digits.get(j)) {
					commonDigits = commonDigits + number1Digits.get(i) + " ";
				}
			}
		}
		
		if (commonDigits.length() == 0) {
			System.out.println("У чисел " + number1 + " и " + number2 + " нет совпадающих цифр.");
		} else {
			System.out.println("Повторяющиеся цифры: " + commonDigits);
		}
		


	}


	public static ArrayList<Integer> getNumberDigits(int number) {
		
		int lastDigit = 0;
		
		ArrayList<Integer> numberDigits = new ArrayList<>();
		
		while (number > 0) {

			lastDigit = number % 10;
			numberDigits.add(lastDigit);
			number = number / 10;
		}
		
		return numberDigits;

	}
}