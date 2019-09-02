package by.oks.jb29_les03.ht_branching;

/* Вычислить значение функции: -x^3 + 9 если x <= 13; -3 / (x + 1) если x > 13 */

public class Task40 {

	public static void main(String[] args) {
		
		int x;
		float result;
		
		x = Task14.enterNumber();
		
		if (x <= 13) {
			result = (float) - (Math.pow(x, 3)) + 9;
		}
		else {
			result = (float) - (3.0 / (x + 1));
		}

		System.out.println("Результат = " + result);

	}

}
