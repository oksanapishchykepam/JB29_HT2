package by.oks.jb29_les03.ht_cycles;

import java.util.Scanner;

/*Написать программу, переводящую римские цифры в арабские.*/

public class Task30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите римскую цифру >");
		
		String text = sc.next();
		String numberArab = "";
		
		while (!sc.hasNext("[IVXLCDM]")) {
			System.out.println("Нет такого варианта. Попробуй еще раз! >");
			sc.next();
		}
		
		for (int i = 0; i < text.length(); i++) {
			
			char roman = text.charAt(i);
			
			switch (roman) {
			case 'I':
				numberArab = numberArab + "1";
				break;
			case 'V':
				numberArab = numberArab + "5";
				break;
			case 'X':
				numberArab = numberArab + "10";
				break;
			case 'L':
				numberArab = numberArab + "50";
				break;
			case 'C':
				numberArab = numberArab + "100";
				break;
			case 'D':
				numberArab = numberArab + "500";
				break;
			case 'M':
				numberArab = numberArab + "1000";
				break;
			}
		}

		System.out.println(numberArab);
	}
 

}
