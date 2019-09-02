package by.oks.jb29_les03.ht_cycles;

/* Вычислить значения функции на отрезке [а,b] c шагом h: y = x, x > 2; y = -x, x <=2*/

public class Task07 {

	public static void main(String[] args) {
		
		int startSegment = Task06.enterNumber();
		int endSegment = Task06.enterNumber();
		
		int step = Task06.enterNumber();
		
		int currentValue = startSegment;
		
		while (currentValue <= endSegment) {
			int result;
			if (currentValue > 2) {
				result = currentValue;
			}
			else {
				result = -currentValue ;
			}
			System.out.println("Значение функции при x = " + currentValue + " = " + result);
			currentValue = currentValue + step;
		}

	}

}
