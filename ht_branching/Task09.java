package by.oks.jb29_les03.ht_branching;

/* Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним. */

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		int side1 = enterNumber();
		int side2 = enterNumber();
		int side3 = enterNumber();
		
		System.out.println("Сторона 1 = " + side1);
		System.out.println("Сторона 2 = " + side2);
		System.out.println("Сторона 3 = " + side3);
		
		if (side1 + side2 <= side3 | side1 + side3 <= side2 | side2 + side3 <= side1) {
			System.out.println("Такого треугольника не существует");
		}
		else {
			if (side1 == side2 & side2 == side3) {
				System.out.println("Треугольник равносторонний");
			}
			else {
				System.out.println("Треугольник не равносторонний");
			}
		}
	}

///////////////////////////////////////////////////////////////////////////
	
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
