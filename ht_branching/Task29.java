package by.oks.jb29_les03.ht_branching;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.*/

public class Task29 {

	public static void main(String[] args) {
		
		int x1 = Task14.enterNumber();
		int y1 = Task14.enterNumber();
		int x2 = Task14.enterNumber();
		int y2 = Task14.enterNumber();
		int x3 = Task14.enterNumber();
		int y3 = Task14.enterNumber();
		
		// y = ax + b
		int a;
		int b;
		
		a = (y1 - y2) / (x1 - x2);
		b = y1 - a * x1;
		
		if ((a * x3 + b) == y3) {
			System.out.println("Точки лежат на одной прямой");
		}
		else {
			System.out.print("Точки не лежат на одной прямой");
		}

	}

}
