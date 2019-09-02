package by.oks.jb29_les03.ht_branching;

/* Составить программу сравнения введенного числа а и цифры 3.
 * Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». */

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		
		Random newNumber = new Random();

		int a = newNumber.nextInt(10);
		
		System.out.println("Число a = " + a);
		
		if (a < 3) {
			System.out.println("yes");
		}
		if (a > 3) {
			System.out.println("no");
		}
					
				

	}

}
