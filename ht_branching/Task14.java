package by.oks.jb29_les03.ht_branching;

import java.util.Scanner;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным. */


public class Task14 {

	public static void main(String[] args) {
		
		int edge1 = enterNumber();
		int edge2 = enterNumber();
		
		int edge3 = 180 - (edge1 + edge2);
		
		if (edge1+edge2 >= 180) {
			System.out.println("Такого треугольника не существует.");
		}
		else {
			if (edge1 == 90 || edge2 == 90 || edge3 == 90) {
				System.out.println("Данный треугольник является прямоугольным");
			}
			else {
				System.out.println("Данный треугольник не является прямоугольным");
			}
		}
			

	}
	
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
