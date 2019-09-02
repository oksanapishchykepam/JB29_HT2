package by.oks.jb29_les03.ht_cycles;

/* Вычислить : 1+2+4+8+...+ 2 в 10 степени.*/

public class Task15 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int power = 0; power <= 10; power++) {
			sum = (int) (sum + Math.pow(2, power));
		}
		
		System.out.println("Результат = " + sum);

	}

}
