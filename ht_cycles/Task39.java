package by.oks.jb29_les03.ht_cycles;

/* В трехзначном числе зачеркнули старшую цифру. 
 * Когда полученное число умножили на 7, то получили исходное число. Найти это число.*/

public class Task39 {

	public static void main(String[] args) {
		
		for (int number = 100; number < 1000; number++) {
			int lastDigit = 0;
			int rest = number;
			
			while (rest > 0) {
				lastDigit = rest % 10;
				rest = rest / 10;
			}
			
			int interimNumber = number - lastDigit * 100;
			int resultNumber = interimNumber * 7;
			
			if (number == resultNumber) {
				System.out.println("Result = " + number);
			}
		}

	}

}
