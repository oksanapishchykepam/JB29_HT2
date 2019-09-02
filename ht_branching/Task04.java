package by.oks.jb29_les03.ht_branching;

/* Составить программу: равны ли два числа а и b? */

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		
		Random newNumber = new Random();
		
		int a = newNumber.nextInt(5);
		int b = newNumber.nextInt(5);
		
		System.out.println("Число a = " + a);
		System.out.println("Число b = " + b);
		
		if (a == b) {
			System.out.println("Числа a и b равны");
		}
		else {
			System.out.println("Числа a и b не равны");	
		}

	}

}
