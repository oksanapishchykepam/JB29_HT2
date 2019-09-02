package by.oks.jb29_les03.ht_cycles;

/* Необходимо вывести на экран таблицу умножения на 3 */

public class Task03 {

	public static void main(String[] args) {
		int number = 0;
		
		while (number < 10) {
			number = number + 1;
			int result = number * 3;
			System.out.println("3 * " + number + " = " + result);
					}
	}

}
