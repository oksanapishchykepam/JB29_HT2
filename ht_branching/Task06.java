package by.oks.jb29_les03.ht_branching;

/* Составить программу: определения наибольшего из двух чисел а и b.*/

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		
		Random newNumber = new Random();
		
		int a = newNumber.nextInt(5);
		int b = newNumber.nextInt(5);
		
		System.out.println("Число a = " + a);
		System.out.println("Число b = " + b);
		
		if (a > b) {
			System.out.println("Наибольшее из чисел a и b = " + a);
		}
		else {
			if (a < b) {
				System.out.println("Наибольшее из чисел a и b = " + b);
			}
			else {
				System.out.println("Число a и число b равны");
			}
		}

	}

}
