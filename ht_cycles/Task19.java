package by.oks.jb29_les03.ht_cycles;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: an = 1/2^n + 1/3^n*/

import static java.lang.Math.*;

public class Task19 {

	public static void main(String[] args) {
		
		int number = Task06.enterNumber();
		double member = 0;
		double sum = 0;
		
		for (int i = 1; i <= number; i++) {
			member = 1 / pow(2, i) + 1 / pow(3, i);
			
			if (abs(member) >= E) {
				sum = sum + member;
			}
		}
		
		System.out.println("Результат = " + sum);

	}

}
