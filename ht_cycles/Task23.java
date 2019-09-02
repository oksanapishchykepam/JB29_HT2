package by.oks.jb29_les03.ht_cycles;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
 * F(x) = ctg(x/3) + 1/2*sin(x) */

import static java.lang.Math.*;

public class Task23 {

	public static void main(String[] args) {
		double firstBound = Task21.enterFloatNumber();
		double secondBound = Task21.enterFloatNumber();
		double step = Task21.enterFloatNumber();
		
		double currentValue = (double) firstBound;
		
		double result = 0.0;
		
		while (currentValue <= secondBound) {
			result = 1 / tan(currentValue / 3) + (1 / 2 * sin(currentValue));
			System.out.println("При x = " + currentValue + ",  F(x) = " + result);
			
			currentValue = currentValue + step;
			
		}

	}

}
