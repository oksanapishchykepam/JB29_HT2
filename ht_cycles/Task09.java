package by.oks.jb29_les03.ht_cycles;

/* Найти сумму квадратов первых ста чисел.*/

public class Task09 {

	public static void main(String[] args) {
		
		int result = 0;
		
		for (int i = 1; i <= 100; i++) {
			int square = (int) Math.pow(i, 2);
			result = result + square;
						
		}
		System.out.println("Результат = " + result);

	}

}
