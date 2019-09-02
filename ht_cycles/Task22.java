package by.oks.jb29_les03.ht_cycles;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
 * F(x) = x - sin^2(x) */

import static java.lang.Math.*;

public class Task22 {

	public static void main(String[] args) {
		float firstBound = Task21.enterFloatNumber();
		float secondBound = Task21.enterFloatNumber();
		float step = Task21.enterFloatNumber();
		
		double currentValue = (double) firstBound;
		
		float result = (float) 0.0;
		
		while (currentValue <= secondBound) {
			result = (float) (currentValue - pow(sin(currentValue), 2));
			System.out.println("При x = " + currentValue + ",  F(x) = " + result);
			
			currentValue = currentValue + step;
			
		}

	}

}
