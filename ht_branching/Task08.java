package by.oks.jb29_les03.ht_branching;

/* Составить программу нахождения наименьшего из квадратов двух чисел а и b. */

import java.util.Scanner;
import static java.lang.Math.*;

public class Task08 {

	public static void main(String[] args) {
		
		int a = enterNumber();
		
		int b = enterNumber();
			
		System.out.println("Число a = " + a);
		System.out.println("Число b = " + b);
		
		double a2 = pow(a, 2);
		double b2 = pow(b, 2);
			
		if (a2 < b2) {
			System.out.println("Наименьшее из квадратов двух чисел a и b = " + a2);
		}
		else {
			if (a2 > b2) {
				System.out.println("Наименьшее из квадратов двух чисел a и b = " + b2);
			}
			else {
				System.out.println("Квадраты чисел a и b равны");
			}
		}

	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int enterNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите целое число > ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не целое число. Попробуйте еще раз > ");
		}
		
		int number = sc.nextInt();
		
		return number;
	} 

}
