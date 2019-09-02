package by.oks.jb29_les03.ht_cycles;

/*С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно. */

public class Task05 {

	public static void main(String[] args) {
		int number = 1;
		
		while (number < 100) {
			System.out.print(number + " ");
			number = number + 2;
		}


	}

}
