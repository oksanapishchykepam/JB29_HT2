package by.oks.jb29_les03.ht_cycles;

import java.util.Scanner;

/* Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа. */


public class Task06 {

	public static void main(String[] args) {
		
		int number = 1;
		int inputNumber = enterNumber();
		int sum = 0;
		
		while (number <= inputNumber) {
			sum = sum + number;
			number++;
		}
		
		System.out.println(sum);
		
	}
	
	public static int enterNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число > ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не целое число. Попробуйте еще раз > ");
		}
		
		int number = sc.nextInt();
		
		return number;
	} 

}
