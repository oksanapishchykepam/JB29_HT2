package by.oks.jb29_les03.ht_cycles;

/* Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности. */

public class Task12 {

	public static void main(String[] args) {
		
		int aFirst = 1;
		int aCurrent = aFirst;
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum = sum + aCurrent;
			aCurrent = 6 + aCurrent;
		}
		
		System.out.println("Сумма первых 10 членов последовательности равна " + sum);

	}

}
