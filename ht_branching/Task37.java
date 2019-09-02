package by.oks.jb29_les03.ht_branching;

/* Вычислить значение функции: -x^2 + 3x + 9 если x >= 3; 1 / (x^3 - 6) если x < 3*/

public class Task37 {

	public static void main(String[] args) {
		
		int x;
		float result;
		
		x = Task14.enterNumber();
		
		if (x >= 3) {
			result = (float) - (Math.pow(x, 2)) + 3 * x + 9;
		}
		else {
			result = (float) (1 / (Math.pow(x, 3) - 6));
		}

		System.out.println("Результат = " + result);

	}

}
