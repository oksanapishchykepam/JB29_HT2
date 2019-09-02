package by.oks.jb29_les03.ht_branching;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие. */

public class Task31 {

	public static void main(String[] args) {
		
		int a = Task14.enterNumber();
		int b = Task14.enterNumber();
		
		int x = Task14.enterNumber();
		int y = Task14.enterNumber();
		int z = Task14.enterNumber();
		
		int minDimension;
		int medDimension;
		
		if (x <= y && x <= z) {
			minDimension = x;
			if (y <= z) {
				medDimension = y;
			}
			else {
				medDimension = z;
			}
		}
		else {
			if (y <= x && y <= z) {
				minDimension = y;
				if (x <= z) {
					medDimension = x;
				}
				else {
					medDimension = z;
				}
			}
			else {
				minDimension = z;
				if (x <= y) {
					medDimension = x;
				}
				else {
					medDimension = y;
				}
			}
		}
		
		if (a < b) {
			if (a >= minDimension && b >= medDimension) {
				System.out.println("Кирпич пройдет через отверстие");
			}
			else {
				System.out.println("Кирпич не пройдет через отверстие");
			}
		}
		else {
			if (b >= minDimension && a >= medDimension) {
				System.out.println("Кирпич пройдет через отверстие");
			}
			else {
				System.out.println("Кирпич не пройдет через отверстие");
			}
		}

	}

}
