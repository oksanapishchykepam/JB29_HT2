package by.oks.jb29_les03.ht_branching;

import java.util.Random;

/* Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, 
 * равным большему из исходных, а если равны, то заменить числа нулями. */

public class Task17 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int m = rand.nextInt(5);
		int n = rand.nextInt(5);
		
		System.out.println("Исходные числа: n = " + n + ", m = " + m);
				
		if (m > n) {
			 n = m;
		}
		else {
			if (m < n) {
				m = n;
			}
			else {
				m = 0;
				n = 0;
			}
		}
		
		System.out.println("Результат: n = " + n + ", m = " + m);
		
	}

}
