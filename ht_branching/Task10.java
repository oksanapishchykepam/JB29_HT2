package by.oks.jb29_les03.ht_branching;

/* Составить программу, которая определит площадь какого круга меньше. */

import java.util.Random;
import static java.lang.Math.*;

public class Task10 {

	public static void main(String[] args) {
		
		Random newNumber = new Random();
		
		int radius1 = newNumber.nextInt(50);
		int radius2 = newNumber.nextInt(50);
		
		System.out.println("R1 = " + radius1);
		System.out.println("R2 = " + radius2);

		double square1= PI * pow(radius1, 2);
		double square2 = PI * pow(radius2, 2);
		
		if (square1 < square2) {
			System.out.println("Площадь первого круга меньше.");
		}
		else {
			if (square1 > square2) {
				System.out.println("Площадь второго круга меньше.");
			}
			else {
				System.out.println("Площадь первого круга равна площади второго круга");
			}
		}
		
	}

}
