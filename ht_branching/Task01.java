package by.oks.jb29_les03.ht_branching;

/* Составить программу сравнения двух чисел 1 и 2. 
 * Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8. */

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		
		Random newNumber = new Random();
		
		int number1 = newNumber.nextInt(100);
		int number2 = newNumber.nextInt(100);
		
		System.out.println("Число 1 = " + number1);
		System.out.println("Число 2 = " + number2);
		
		if (number1 < number2) {
			System.out.println(7);
		}
		else {
			System.out.println(8);
		}
	}

}
