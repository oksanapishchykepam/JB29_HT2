package by.oks.jb29_les03.ht_cycles;

/*Требуется определить факториал числа, которое ввел пользователь */

public class Task25 {

	public static void main(String[] args) {
		int number = Task06.enterNumber();
		int fact = 1;
		
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
			
		System.out.println(number + "! = " +  fact);
	}

}
