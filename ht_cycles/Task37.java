package by.oks.jb29_les03.ht_cycles;

/* Даны два двузначных числа А и В. 
 * Из этих чисел составили 2 четырехзначных числа: первое число получили путем написания сначала числа А, затем В. 
 * Для получения второго числа сначала записали число В, затем А. 
 * Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.*/

public class Task37 {

	public static void main(String[] args) {
		
		int numberA; 
		int numberB;
		
		for (numberA = 10; numberA < 100; numberA++) {
			for (numberB = 10; numberB < 100; numberB++) {
				int number1 = 100 * numberA + numberB;
				int number2 = 100 * numberB + numberA;
				
				if (number1 % 99 == 0) {
					if (number2 % 49 == 0) {
						System.out.println("Ответ: " + numberA + ", " + numberB);
					} 
					
				}
			}
		}

	}

}
