package by.oks.jb29_les03.ht_branching;

/* Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее. */

public class Task22 {

	public static void main(String[] args) {
		
		int x = Task14.enterNumber();
		int y = Task14.enterNumber();
		
		System.out.println("Исходные числа: x = " + x + ", y = " + y);
		
		int min;
		int max;
		
		if (x > y) {
			min = y;
			max = x;
		}
		else {
			min = x;
			max = y;
		}
		
		x = max;
		y = min;
		
		System.out.println("Числа после перераспределения: x = " + x + ", y = " + y);
 
	}

}
