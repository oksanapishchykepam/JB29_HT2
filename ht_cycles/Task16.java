package by.oks.jb29_les03.ht_cycles;

/*Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).*/

public class Task16 {

	public static void main(String[] args) {
		long result = 1;
		int factor = 0;
				
		for (int i = 1; i <= 10; i++) {
			factor = factor + i;
			result = (long) (result * factor);
		}

		System.out.println("Результат = " + result);

	}

}
