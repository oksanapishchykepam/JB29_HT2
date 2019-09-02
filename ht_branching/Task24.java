package by.oks.jb29_les03.ht_branching;

/* Составить программу, определяющую результат гадания на ромашке — «любит—не любит», 
 * взяв за исходное данное количество лепестков n. */

public class Task24 {

	public static void main(String[] args) {
		int n = Task14.enterNumber();
		
		if (n % 2 == 1) {
			System.out.println("Любит!");
		}
		else {
			System.out.println("Не любит!");
		}

	}

}
