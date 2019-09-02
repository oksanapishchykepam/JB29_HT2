package by.oks.jb29_les03.ht_cycles;

/* Составить программу нахождения разности кубов первых двухсот чисел */

public class Task11 {

	public static void main(String[] args) {
		
		long dif = 0;
		
		for (int currentValue = 1; currentValue <= 200; currentValue++) {
			dif = (long) (dif - Math.pow(currentValue, 3));
		}

		System.out.println("Разность кубов первых двухсот чисел = " + dif);
	}

}
