package by.oks.jb29_les03.ht_branching;

/* Вычислить значение функции: x^2, если 0 <= x <= 3; 4 если x > 3 или x < 0 */

public class Task38 {

	public static void main(String[] args) {
		
		int x;
		int result;
		
		x = Task14.enterNumber();
		
		if (x > 3 || x < 0) {
			result = 4;
		}
		else {
			result = (int) Math.pow(x, 2);
		}

		System.out.println("Результат = " + result);

	}

}
