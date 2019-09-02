package by.oks.jb29_les03.ht_cycles;

import java.util.Random;

/*Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)*/

public class Task17 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		float realNumber = rand.nextFloat();
		int naturalNumber = Task06.enterNumber();
		
		System.out.println("a = " + realNumber);
		
		float result = (float)1.0;
		
		for (int i = 0; i < naturalNumber; i ++) {
			float factor = realNumber + i;
			result = (float) result * factor;
		}
		
		System.out.println("Результат = " + result);

	}

}
