package by.oks.jb29_les03.ht_branching;

/* Вычислить значение функции: -x^2 + x - 9 если x >= 8; 1 / (x^4 - 6) если x < 8 */

public class Task39 {

	public static void main(String[] args) {
		
		int x;
		float result;
		
		x = Task14.enterNumber();
		
		if (x >= 8) {
			result = (float) - (Math.pow(x, 2)) + x - 9;
		}
		else {
			result = (float) (1 / (Math.pow(x, 4) - 6));
		}

		System.out.println("Результат = " + result);

	}

}
