package by.oks.jb29_les03.ht_branching;

import java.util.Scanner;

/* На плоскости ХОY задана своими координатами точка А. 
 * Указать, где она расположена (на какой оси или в каком координатном угле). */



public class Task16 {

	public static void main(String[] args) {
		
		int x = enterNumber();
		int y = enterNumber();
		
		System.out.println("Задана точка А. x = " + x + ", y = " + y);
		
		if (x == 0 || y == 0) {
			if (x == 0) {
				if (y > 0) {
					System.out.println("Точка расположена на оси OY выше начала координат.");
				}
				else {
					if (y < 0) {
						System.out.println("Точка расположена на оси OY ниже начала координат.");
					}
					else {
						System.out.println("Точка расположена в начале координат (0; 0).");
					}
				}
			
			}
			else {
				if (x > 0) {
					System.out.println("Точка расположена на оси OX правее начала координат.");
				}
				else {
					System.out.println("Точка расположена на оси OX левее начала координат.");
				}
				
			}
		}
		else {
			if (x > 0 && y > 0) {
				System.out.println("Точка расположена в 1 координатной четверти");
			}
			else {
				if (x < 0 && y > 0) {
					System.out.println("Точка расположена во 2 координатной четверти");
				}
				else {
					if (x < 0 && y < 0) {
						System.out.println("Точка расположена в 3 координатной четверти");
					}
					else {
						System.out.println("Точка расположена в 4 координатной четверти");
					}
				}
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
