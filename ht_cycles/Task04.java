package by.oks.jb29_les03.ht_cycles;

/* С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.*/

public class Task04 {

	public static void main(String[] args) {
		int number = 0;
		
		while (number < 100) {
			number = number + 2;
			System.out.print(number + " ");
		}

	}

}
