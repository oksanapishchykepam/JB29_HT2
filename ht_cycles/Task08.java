package by.oks.jb29_les03.ht_cycles;

/* Вычислить значения функции на отрезке [а,b] c шагом h: y = (x + c) * 2, x = 15; y = (x - c) + 6, x != 15. */

public class Task08 {

	public static void main(String[] args) {
		int startSegment = Task06.enterNumber();
		int endSegment = Task06.enterNumber();
		
		int step = Task06.enterNumber();
		
		int currentValue = startSegment;
		
		while (currentValue <= endSegment) {
			int result;
			int c = 3;
			if (currentValue == 15) {
				result = (currentValue + c) * 2;
			}
			else {
				result = (currentValue - c) + 6;
			}
			System.out.println("Значение функции при x = " + currentValue + " = " + result);
			currentValue = currentValue + step;
		}


	}

}
