package by.oks.jb29_les03.ht_cycles;

/*Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
 * Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.*/

public class Task38 {

	public static void main(String[] args) {
		int number = Task06.enterNumber();
		
		int previousDigit = number % 10;
		number = number / 10;
		int currentDigit = number % 10;
		number = number / 10;
		
		int difPrevious = 0;
		int difCurrent = currentDigit - previousDigit;

		boolean arithmeticProgression = false;
		
		while (number > 0) {
			previousDigit = currentDigit;
			currentDigit = number % 10;
			number = number / 10;
			
			difPrevious = difCurrent;			
			difCurrent = currentDigit - previousDigit;
			
			if (difPrevious != difCurrent) {
				arithmeticProgression = false;
				number = 0;
			} else {
				arithmeticProgression = true;
			}
		}
		
		if(arithmeticProgression) {
			System.out.println("Цифры исходного числа образуют арифметическую прогрессию");
		} else {
			System.out.println("Цифры исходного числа не образуют арифметическую прогрессию");
		}

	}

}
