package by.oks.jb29_les03.ht_branching;

/* Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные. */

import static java.lang.Math.*;

public class Task12 {

	public static void main(String[] args) {
			
		float number1;
		number1 = (float) -0.3;
		float number2;
		number2 = 12.12f;
		float number3;
		number3 = 0.0f;
		
		System.out.println("Заданные числа: " + number1 + ", " + number2 + ", " + number3 + ".");
		
		calculation(number1);
		calculation(number2);
		calculation(number3);
		

	}

	public static void calculation (float number) {
		
		float result;
		result = (float) pow(number, 2);
		
		if (number < 0) {
			result = (float) pow(result, 2);
			System.out.println(number + " в четвертой степени = " + result);
		}
		else {
			System.out.println(number + " во второй степени = " + result);
		}
		
	}
}
