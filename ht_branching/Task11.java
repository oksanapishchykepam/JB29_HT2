package by.oks.jb29_les03.ht_branching;

/* Составить программу, которая определит площадь какого треугольника больше. */

import java.util.Random;
import static java.lang.Math.*;

public class Task11 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int rect1Side1 = random.nextInt(50);
		int rect1Side2 = random.nextInt(50);
		int rect1Side3 = random.nextInt(50);
		
		int rect2Side1 = random.nextInt(50);
		int rect2Side2 = random.nextInt(50);
		int rect2Side3 = random.nextInt(50);
		
		System.out.println("Стороны первого треугольника равны " + rect1Side1 + ", " + rect1Side2 + ", " + rect1Side3 + ".");
		System.out.println("Стороны второго треугольника равны " + rect2Side1 + ", " + rect2Side2 + ", " + rect2Side3 + ".");
		
		double square1 = square(rect1Side1, rect1Side2, rect1Side3);
		double square2 = square(rect2Side1, rect2Side2, rect2Side3);
		
		if (square1 > square2) {
			System.out.println("Площадь первого треугольника больше.");
		}
		else {
			if (square1 < square2) {
				System.out.println("Площадь второго треугольника больше.");
			}
			else {
				System.out.println("Площади треугольников равны.");
			}
		}

	}

/////////////////////////////////////////////////////////////////////////
	
	public static double square(int side1, int side2, int side3) {
		
		double halfPerimeter = (side1 + side2 + side3);
		double square = sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
		
		return square;
	}
}
