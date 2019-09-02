package by.oks.jb29_les03.ht_branching;

/* Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х */

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		
		Random newNumber = new Random();
		
		int a = -1; //newNumber.nextInt(50);
		int b = 12; //newNumber.nextInt(50);
		int c = -100; //newNumber.nextInt(50);
		int x = newNumber.nextInt(50);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("x = " + x);
		
		double result = a * Math.pow(x, 2) + b * x + c;
	
		if (result < 0) {
			result = -result;
		}
		
		System.out.println("Module of result = " + result);
 
	}

}
