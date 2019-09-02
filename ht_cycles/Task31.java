package by.oks.jb29_les03.ht_cycles;

import java.util.ArrayList;

/* Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также ошибочные числа пользователя*/

import java.util.Random;

public class Task31 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		ArrayList<Integer> randomNumbers = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			 int randomNumber = rand.nextInt(15);
			 randomNumbers.add(randomNumber);
		}
		
		ArrayList<Integer> guessNumbers = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int guessNumber = Task06.enterNumber();
			guessNumbers.add(guessNumber);
		}

		for (int i = 0; i < randomNumbers.size(); i++) {
			System.out.print(randomNumbers.get(i) + " ");
		}
		System.out.println("");
		for (int i = 0; i < guessNumbers.size(); i++) {
			System.out.print(guessNumbers.get(i) + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < randomNumbers.size(); i++) {
			for (int j = 0; j < guessNumbers.size(); j++) {
				if (randomNumbers.get(i) == guessNumbers.get(j)) {
					
					System.out.println("Вы угадали число " + randomNumbers.get(i));
					
					randomNumbers.remove(i);
					guessNumbers.remove(j);
					
					i--;
					j = randomNumbers.size();
					
				}
				
			}
		}
		
		if (randomNumbers.size() > 0) {
			System.out.println("Вы не угадали числа: ");
			for (int i = 0; i < randomNumbers.size(); i++) {
				System.out.println(randomNumbers.get(i) + " ");
			}
			
			System.out.println("Вы вводили ошибочные числа: ");
			for (int i = 0; i < guessNumbers.size(); i++) {
				System.out.println(guessNumbers.get(i) + " ");
			}
		}


	}

}
