package by.oks.jb29_les03.ht_cycles;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы
и самого числа. m и n вводятся с клавиатуры.*/

public class Task27 {

	public static void main(String[] args) {
		int number1 = Task06.enterNumber();
		int number2 = Task06.enterNumber();
		
		findDividers(number1);
		findDividers(number2);
		
	}

	public static void findDividers(int number) {
		
		System.out.println("Делители числа "+ number + ": ");
		
		for (int divider = 2; divider < number; divider++) {
			if (number % divider == 0) {
				System.out.println(divider);
			}
		}
		
	}
}
