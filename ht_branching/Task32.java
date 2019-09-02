package by.oks.jb29_les03.ht_branching;

/* Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной. */

public class Task32 {

	public static void main(String[] args) {
		int number1 = Task14.enterNumber();
		int number2 = Task14.enterNumber();
		int number3 = Task14.enterNumber();
		
		int sum1 = number1 + number2;
		int sum2 = number1 + number3;
		int sum3 = number2 + number3;
		
		if (sum1 > 0 || sum2 > 0 || sum3 > 0) {
			System.out.println("Хотя бы одна из сумм любых двух чисел явлется положительной");
		}
		else {
			System.out.println("Ни одна из сумм любых двух чисел не явлется положительной");
		}

	}

}
