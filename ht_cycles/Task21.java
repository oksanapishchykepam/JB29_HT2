package by.oks.jb29_les03.ht_cycles;

import java.util.Scanner;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
 * F(x) = x - sin(x) */

public class Task21 {

	public static void main(String[] args) {
		
		float firstBound = enterFloatNumber();
		float secondBound = enterFloatNumber();
		float step = enterFloatNumber();
		
		double currentValue = (double) firstBound;
		
		float result = (float) 0.0;
		
		while (currentValue <= secondBound) {
			result = (float) (currentValue - Math.sin(currentValue));
			System.out.println("При x = " + currentValue + ",  F(x) = " + result);
			
			currentValue = currentValue + step;
			
		}


	}

	public static float enterFloatNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число > ");
		
		while (!sc.hasNextFloat()) {
			sc.next();
			System.out.println("Вы неверное число. Попробуйте еще раз > ");
		}
		
		float number = sc.nextFloat();
		
		return number;
	} 
	
}
