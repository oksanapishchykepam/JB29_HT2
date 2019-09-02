package by.oks.jb29_les03.ht_branching;

/* Найти max{min(a, b), min(c, d)}. */

public class Task27 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		
		a = Task14.enterNumber();
		b = Task14.enterNumber();
		c = Task14.enterNumber();
		d = Task14.enterNumber();
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		
		int min1;
		int min2;
		int max;
		
		if (a > b) {
			min1 = b;
		}
		else {
			min1 = a;
		}
		
		if (c > d) {
			min2 = d;
		}
		else {
			min2 = c;
		}
		
		if (min1 < min2) {
			max = min2;
		}
		else {
			max = min1;
		}
		
		System.out.println("Результат max{min(a, b), min(c, d)} = " + max);
		
	}

}
