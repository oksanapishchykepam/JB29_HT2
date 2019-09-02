package by.oks.jb29_les03.ht_cycles;

/*Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение.
 * Найти эти числа.*/

public class Task36 {

	public static void main(String[] args) {

		for (int number1 = 10; number1 < 100; number1++) {
			for (int number2 = 10; number2 < 100; number2++) {
				int number = 100 * number1 + number2;
				int multipl = number1 * number2;
				
				if (number % multipl == 0) {
					System.out.println("Ответ: " + number1 + ", " + number2);
				}
			}
		}
		
	}

}
