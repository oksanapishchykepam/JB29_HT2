package by.oks.jb29_les03.ht_cycles;

import java.math.BigInteger;

/* Составить программу нахождения произведения квадратов первых двухсот чисел.*/

public class Task10 {

	public static void main(String[] args) {
		
		long result = 1;
		
		for (int i = 1; i <= 100; i++) {
			double square = Math.pow(i, 2);
			result = (long) (result * square);
						
		}
		System.out.println("Результат = " + result);

	}

}
