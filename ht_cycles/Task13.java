package by.oks.jb29_les03.ht_cycles;

/* Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5. */

public class Task13 {

	public static void main(String[] args) {
		
		float currentValue = (float) -5.0;
		float step = (float) 0.5;
		float result = (float) 0.0;
		
		while (currentValue <= 5) {
			result = (float) (5 - Math.pow(currentValue, 2) / 2);
			System.out.println("При x = " + currentValue + ",  y = " + result);
			
			currentValue = currentValue + step;
			
		}

	}

}
