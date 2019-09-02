package by.oks.jb29_les03.ht_branching;

/* Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. */

import static java.lang.Math.*;

public class Task13 {

	public static void main(String[] args) {
		
		int x1 = -1;
		int y1 = 4;
		int x2 = -5;
		int y2 = 0;
		
		System.out.println("Координаты точки А: x = " + x1 + ", y = " + y1);
		System.out.println("Координаты точки B: x = " + x2 + ", y = " + y2);
		
		float dist1 = dist(x1, y1);
		float dist2 = dist(x2, y2);
		
		if (dist1 > dist2) {
			System.out.println("Точка А ближе к началу координат, чем точка B.");
			
		}
		else {
			if (dist1 < dist2) {
				System.out.println("Точка B ближе к началу координат, чем точка A.");
			}
			else {
				System.out.println("Точка А и точка B находятся на одинаковом расстоянии от начала координат");
			}
		}
				
	}

	public static float dist(int x, int y) {
		float dist = (float) sqrt(pow(x, 2) + pow(y, 2));
		
		return dist;
		
	}
}
