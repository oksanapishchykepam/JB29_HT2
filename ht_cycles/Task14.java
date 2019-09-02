package by.oks.jb29_les03.ht_cycles;

/* Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. */

public class Task14 {

	public static void main(String[] args) {
		
		int number = Task06.enterNumber();
		float currentValue = (float) 1.0;
		float result = (float) 0.0;
		
		while (currentValue <= number) {
			result = (float) (result + 1 / currentValue);
			currentValue++;
		}

		System.out.println("Результат = " + result);
	}

}
