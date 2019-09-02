package by.oks.jb29_les03.ht_branching;

/* Даны действительные числа х и у, не равные друг другу. 
 * Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением. */

import java.util.Random;

public class Task15 {

	public static void main(String[] args) {
		
		Random rand;
		rand = new Random();
		
		double number1;
		double number2;
		
		number1 = rand.nextDouble();
		number2 = rand.nextDouble();
		
		System.out.println("Исходные числа: число1 = " + number1 + ", число2 = " + number2 + ".");
		
		double halfSum;
		double doubleMltpl;
		
		halfSum = (number1 + number2) / 2;
		doubleMltpl = 2 * number1 * number2;
		
		if (number1 > number2) {
			number1 = doubleMltpl;
			number2 = halfSum;
		}
		else {
			number2 = doubleMltpl;
			number1 = halfSum;
		}

		System.out.println("Результат: число1 = " + number1 + ", число2 = " + number2 + ".");
	}

}
