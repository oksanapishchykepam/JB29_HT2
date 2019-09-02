package by.oks.jb29_les03.ht_branching;

/* Определить, делителем каких чисел а, b, с является число k. */

public class Task20 {

	public static void main(String[] args) {
		
		int a = Task14.enterNumber();
		int b = Task14.enterNumber();
		int c = Task14.enterNumber();
		int k = Task14.enterNumber();
		
		System.out.println("Исходные числа: a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("k = " + k);
		
		divider(a, k);
		divider(b, k);
		divider(c, k);

	}
	
	public static void divider(int number, int div) {
		if (number % div == 0) {
			System.out.println("Число " + div + " явлется делителем числа " + number);
		}
		else {
			System.out.println("Число " + div + " не явлется делителем числа " + number);
		}
	}

}
