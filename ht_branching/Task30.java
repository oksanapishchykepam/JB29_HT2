package by.oks.jb29_les03.ht_branching;

import java.util.Random;

/* Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, 
 * и заменить их абсолютными значениями, если это не так.*/

public class Task30 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		float a = rand.nextFloat();
		float b = rand.nextFloat();
		float c = rand.nextFloat();
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		if (a > b && b > c) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		}
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}

}
