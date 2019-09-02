package by.oks.jb29_les03.ht_branching;

/*Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d — c). */

public class Task28 {

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
		
		if (a != d && b != d && c != d) {
			System.out.println("Ни одно из чисел не равно d");
			int max;
			int dif1;
			int dif2;
			int dif3;
			
			dif1 = d - a;
			dif2 = d - b;
			dif3 = d - c;
			
			if (dif1 >= dif2 && dif1 >= dif3) {
				max = dif1;				
			}
			else {
				if (dif2 >= dif3 && dif2 >= dif1) {
					max = dif2;
				}
				else {
					max = dif3;
				}
			}	
			System.out.println("max(d — a, d — b, d — c) = " + max);
		}
		else {
			if (a == d) {
				System.out.println("a = d");
			}
			if (b == d) {
				System.out.println("b = d");
			}
			if (c == d) {
				System.out.println("c = d");
			}
		}
		
	}

}
